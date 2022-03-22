import java.util.Arrays;
import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private int nMiembros;
    private Integrante[] integrantes;


    public Cuarteto(String nombre, String autor, String autor_música, String autor_letras, String tipo, int puntos_obtenidos, int nMiembros) {
        super(nombre, autor, autor_música, autor_letras, tipo, puntos_obtenidos);
        this.nMiembros = nMiembros;
        this.integrantes=new Integrante[0];
    }

    public int getnMiembros() {
        return nMiembros;
    }

    public void setnMiembros(int nMiembros) {
        this.nMiembros = nMiembros;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del cuarteto con nombre "+getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Cuarteto "+getNombre()+" va de "+getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+getNombre());
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
        System.out.println("El cuarteto "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                super.toString()+
                "nMiembros=" + nMiembros +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuarteto cuarteto = (Cuarteto) o;
        return nMiembros == cuarteto.nMiembros && Arrays.equals(integrantes, cuarteto.integrantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), nMiembros);
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }
}
