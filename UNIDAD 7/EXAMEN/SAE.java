import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class SAE {

    private HashMap<Integer,TreeSet<Trabajador>> conjuntoOfertas;

    public SAE() {
        conjuntoOfertas = new HashMap<>();
    }

    public boolean addOferta(int codigo, Oferta o){
        if (!conjuntoOfertas.containsKey(o.getCodigo())){
            conjuntoOfertas.put(o.getCodigo(), new TreeSet<>(new MiComparadorTrabajadores()));
            return true;
        }
        return false;
    }

    public boolean addTrabajador(Integer codigo, Trabajador t){
        if (conjuntoOfertas.containsKey(codigo)){
            Iterator<Trabajador> it = conjuntoOfertas.get(codigo).iterator();
            while(it.hasNext()) {
                Trabajador i = it.next();
                if (i.equals(t)){
                    return false;
                }
            }
            conjuntoOfertas.get(codigo).add(t);
            return true;
        }
        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajador t){
        if (conjuntoOfertas.containsKey(codigo)){
            Iterator<Trabajador> it = conjuntoOfertas.get(codigo).iterator();
            while(it.hasNext()) {
                Trabajador i = it.next();
                if (i.equals(t)){
                    conjuntoOfertas.get(codigo).remove(t);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void mostrarTrabajadores(Integer codigo){

        int contadorTrabajadores=0;

        if (conjuntoOfertas.containsKey(codigo)){
            Iterator<Trabajador> it = conjuntoOfertas.get(codigo).iterator();

            while(it.hasNext()) {
                Trabajador i = it.next();
                System.out.println(i);
                contadorTrabajadores++;
            }
        }

        if (contadorTrabajadores==0){
            System.out.println("No existe ningún trabajador en esa oferta");

        }
    }
    public void mostrarTrabajadoresXEdad(Integer codigo){
        int contadorTrabajadores=0;

        Collection<Trabajador> lista = conjuntoOfertas.get(codigo);

        Collections.sort(lista, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador t1, Trabajador t2) {
                if (t1.getEdad()-t2.getEdad()==0){
                    return t1.getNombre().compareTo(t2.getNombre());
                }
                return t1.getEdad()-t2.getEdad();
            }
        });

        if (conjuntoOfertas.containsKey(codigo)){
            Iterator<Trabajador> it = conjuntoOfertas.get(codigo).iterator();

            while(it.hasNext()) {
                Trabajador i = it.next();
                System.out.println(i);
                contadorTrabajadores++;
            }
        }

        if (contadorTrabajadores==0){
            System.out.println("No existe ningún trabajador en esa oferta");

        }
    }

    public void mostrarOfertas(){
        System.out.println(conjuntoOfertas);
    }

    public void cargarPacientes() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true) {
                Oferta o = (Oferta) ois.readObject();
                addOferta(o.getCodigo(),o);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sae.dat"));
            Collection<TreeSet<Trabajador>> conjunto = conjuntoOfertas.values();

            Iterator it = conjunto.iterator();

            while (it.hasNext()) {
                Set<Trabajador> trabajadors = (Set<Trabajador>) it.next();

                for (Trabajador t : trabajadors) {
                    oos.writeObject(t);
                }
            }

            oos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
