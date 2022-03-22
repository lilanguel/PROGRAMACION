import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica_cartelon;

    public Romancero(String nombre, String autor, String autor_música, String autor_letras, String tipo, String tematica_cartelon) {
        super(nombre, autor, autor_música, autor_letras, tipo);
        this.tematica_cartelon = tematica_cartelon;
    }

    public String getTematica_cartelon() {
        return tematica_cartelon;
    }

    public void setTematica_cartelon(String tematica_cartelon) {
        this.tematica_cartelon = tematica_cartelon;
    }

    @Override
    void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del romancero con nombre "+getNombre());
    }

    @Override
    void hacer_tipo() {
        System.out.println("El Romancero "+getNombre()+" va de "+getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Romancero "+getNombre());
    }

    @Override
    public String toString() {

        return "Romancero{" +
                super.toString()+
                "tematica_cartelon='" + tematica_cartelon + '\'' +
                '}'+"\n";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Romancero romancero = (Romancero) o;
        return tematica_cartelon.equals(romancero.tematica_cartelon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tematica_cartelon);
    }
}
