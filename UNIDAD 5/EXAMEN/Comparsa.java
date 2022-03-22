import java.util.Arrays;
import java.util.Objects;

public class Comparsa extends AgrupacionOficial{
    private String empresa_atrezzo;
    private Integrante[] integrantes;


    public Comparsa(String nombre, String autor, String autor_música, String autor_letras, String tipo, int puntos_obtenidos, String empresa_atrezzo) {
        super(nombre, autor, autor_música, autor_letras, tipo, puntos_obtenidos);
        this.empresa_atrezzo = empresa_atrezzo;
        this.integrantes=new Integrante[0];
    }

    public String getEmpresa_atrezzo() {
        return empresa_atrezzo;
    }

    public void setEmpresa_atrezzo(String empresa_atrezzo) {
        this.empresa_atrezzo = empresa_atrezzo;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la comparsa con nombre "+getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("La Comparsa "+getNombre()+" va de "+getTipo());
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
        System.out.println("La comparsa "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                super.toString()+
                "empresa_atrezzo='" + empresa_atrezzo + '\'' +
                ", integrantes=" + Arrays.toString(integrantes) +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comparsa comparsa = (Comparsa) o;
        return empresa_atrezzo.equals(comparsa.empresa_atrezzo) && Arrays.equals(integrantes, comparsa.integrantes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), empresa_atrezzo);
        result = 31 * result + Arrays.hashCode(integrantes);
        return result;
    }
}
