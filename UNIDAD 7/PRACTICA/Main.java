import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Alumno> set = new TreeSet<Alumno>(new MiComparadorAlumnos());
        Map<String, Alumno> map = new HashMap<>();

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true) {
                Alumno e = (Alumno) ois.readObject();
                map.put(e.getDNI(),e);
                set.add(e);
            }

        } catch (IOException | ClassNotFoundException e) {
            //e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int num = 0;

        while (num != 6) {
            System.out.println("¿Qué quieres hacer?");
            num = sc.nextInt();

            sc.nextLine();

            if (num == 1) {

                System.out.println("INSERTAR ALUMNO");
                System.out.println("Nombre");
                String nombre = sc.nextLine();
                System.out.println("Apellidos");
                String apellidos = sc.nextLine();
                System.out.println("Dirección");
                String direccion = sc.nextLine();
                System.out.println("DNI");
                String DNI = sc.nextLine();
                System.out.println("Email");
                String email = sc.nextLine();
                System.out.println("Curso");
                String curso = sc.nextLine();
                System.out.println("¿DUAL?");
                boolean dual = sc.nextBoolean();

                Alumno a1=new Alumno(nombre,apellidos,direccion,DNI,email,curso,dual);

                if (!map.containsKey(DNI)){
                    set.add(a1);
                    map.put(DNI, a1);
                }else{
                    System.out.println("Ese alumno ya existe");
                }
            }
            if (num == 2) {
                System.out.println("BORRAR ALUMNO");
                System.out.println("Introduce el DNI del alumno que quieres borrar");
                String DNI = sc.nextLine();

                if (map.containsKey(DNI)){

                    Alumno alumno = map.get(DNI);

                    set.remove(alumno);
                    map.remove(DNI);
                }else{
                    System.out.println("ESE ALUMN@ NO EXISTE");
                }
            }
            if (num == 3) {
                System.out.println("MOSTRAR ALUMNOS");
                System.out.println(set);
            }
            if (num == 4) {
                System.out.println("MOSTRAR ALUMNOS DE UN CURSO");
                System.out.println("¿Qué curso quieres que se muestre?");
                String curso= sc.nextLine();

                Iterator<Alumno> ite = set.iterator();
                int num_alum=0;

                while(ite.hasNext()){
                    Alumno alumno = ite.next();
                    if (alumno.getCurso().equals(curso)){
                        System.out.println(alumno);
                        num_alum++;
                    }
                }

                if (num_alum==0){
                    System.out.println("NO HAY ALUMNOS DE ESE CURSO");
                }

            }
            if (num == 5) {
                System.out.println("MODIFICAR ALUMNO");
                System.out.println("Introduce el DNI del alumno que quieres modificar");
                String DNI = sc.nextLine();

                if (map.containsKey(DNI)){
                    System.out.println("Nuevo nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Nuevos apellidos");
                    String apellidos = sc.nextLine();
                    System.out.println("Nueva dirección");
                    String direccion = sc.nextLine();
                    System.out.println("Nuevo email");
                    String email = sc.nextLine();
                    System.out.println("Nuevo curso");
                    String curso = sc.nextLine();
                    System.out.println("¿DUAL?");
                    boolean dual = sc.nextBoolean();

                    Alumno alumno = new Alumno(nombre,apellidos,direccion,DNI,email,curso,dual);

                    Alumno a = map.get(DNI);

                    set.remove(a);

                    set.add(alumno);

                    map.put(DNI,alumno);
                }else{
                    System.out.println("NO EXISTE ALUMNO CON ESE DNI");
                }
            }
        }

        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));

            Collection<Alumno> lista = map.values();
            for(Alumno e : lista) {
                oos.writeObject(e);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}