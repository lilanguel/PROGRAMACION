import java.util.Arrays;
import java.util.Comparator;

public class Registro {
    private Propiedad[] propiedad;

    public Registro() {
        propiedad=new Propiedad[0];
    }

    public Propiedad[] getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad[] propiedad) {
        this.propiedad = propiedad;
    }

    public void addPropiedad(Propiedad prop){
        this.propiedad = Arrays.copyOf(this.propiedad,this.propiedad.length+1);
        propiedad[propiedad.length-1]=prop;
    }

    public boolean eliminarPropiedad(Propiedad prop){
        if (propiedad.length>0){
            Propiedad[] resultado= new Propiedad[0];

            for (int i = 0; i < propiedad.length; i++) {
                if (!propiedad[i].equals(prop)){
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=propiedad[i];
                }
            }
            propiedad=resultado;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedad, registro.propiedad);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedad);
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedad=" + Arrays.toString(propiedad) +
                '}';
    }

    public void informeSuperficie(){
        Arrays.sort(propiedad);

        System.out.println(toString());
    }

    public void informeAntiguedad(){
        Arrays.sort(propiedad, new Comparator<Propiedad>() {
            @Override
            public int compare(Propiedad p1, Propiedad p2) {
                if (p1.getAnho_construccion()==p2.getAnho_construccion()){
                    return p2.getMetros_cuadrados() - p1.getMetros_cuadrados();
                }

                return p1.getAnho_construccion()-p2.getAnho_construccion();
            }
        });

        System.out.println(toString());
    }
}
