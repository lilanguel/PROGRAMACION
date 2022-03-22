import java.util.Arrays;
import java.util.Objects;

public class Coro extends AgrupacionOficial{

    private int nBandurrias;
    private int nGuitarras;
    private Integrante[] integrantes;


    public Coro(String nombre, String autor, String autor_música, String autor_letras, String tipo, int puntos_obtenidos, int nBandurrias, int nGuitarras) {
        super(nombre, autor, autor_música, autor_letras, tipo, puntos_obtenidos);
        this.nBandurrias = nBandurrias;
        this.nGuitarras = nGuitarras;
        this.integrantes=new Integrante[0];

    }

    public int getnBandurrias() {
        return nBandurrias;
    }

    public void setnBandurrias(int nBandurrias) {
        this.nBandurrias = nBandurrias;
    }

    public int getnGuitarras() {
        return nGuitarras;
    }

    public void setnGuitarras(int nGuitarras) {
        this.nGuitarras = nGuitarras;
    }


    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del coro con nombre "+getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Coro "+getNombre()+" va de "+getTipo());
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
        System.out.println("El coro "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Coro{" +
                super.toString()+
                "nBandurrias=" + nBandurrias +
                ", nGuitarras=" + nGuitarras +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Coro coro = (Coro) o;
        return nBandurrias == coro.nBandurrias && nGuitarras == coro.nGuitarras && Arrays.equals(integrantes, coro.integrantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), nBandurrias, nGuitarras);
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }
}
