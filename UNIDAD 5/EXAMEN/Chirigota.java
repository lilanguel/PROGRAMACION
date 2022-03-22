import java.util.Arrays;
import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private int nCuples;
    private Integrante[] integrantes;

    public Chirigota(String nombre, String autor, String autor_música, String autor_letras, String tipo, int puntos_obtenidos, int nCuples) {
        super(nombre, autor, autor_música, autor_letras, tipo, puntos_obtenidos);
        this.nCuples = nCuples;
        this.integrantes=new Integrante[0];
    }

    public int getnCuples() {
        return nCuples;
    }

    public void setnCuples(int nCuples) {
        this.nCuples = nCuples;
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la chirigota con nombre "+getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Chirigota "+getNombre()+" va de "+getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota "+getNombre());
    }

    @Override
    void insertar_integrante(Integrante i) {
        this.integrantes = Arrays.copyOf(this.integrantes,this.integrantes.length+1);
        integrantes[integrantes.length-1]=i;
    }

    @Override
    boolean eliminar_integrante(Integrante integ) {
        if (integrantes.length>0){
            Integrante[] resultado= new Integrante[0];

            for (int i = 0; i < integrantes.length; i++) {
                if (!integrantes[i].equals(integ)){
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=integrantes[i];
                }
            }
            integrantes=resultado;
            return true;
        }
        return false;
    }

    @Override
    void caminito_del_falla() {
        System.out.println("La chirigota "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                super.toString()+
                "nCuples=" + nCuples +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chirigota chirigota = (Chirigota) o;
        return nCuples == chirigota.nCuples && Arrays.equals(integrantes, chirigota.integrantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), nCuples);
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }
}
