import java.util.Objects;
import java.util.TreeSet;

public class Oferta {
    private int codigo;
    private String descripción;
    private boolean cubierto;

    private TreeSet<Trabajador> set;

    public Oferta(int codigo, String descripción, boolean cubierto) {
        this.codigo = codigo;
        this.descripción = descripción;
        this.cubierto = cubierto;
        set=new TreeSet<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public boolean isCubierto() {
        return cubierto;
    }

    public void setCubierto(boolean cubierto) {
        this.cubierto = cubierto;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "codigo=" + codigo +
                ", descripción='" + descripción + '\'' +
                ", cubierto=" + cubierto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oferta oferta = (Oferta) o;
        return codigo == oferta.codigo && cubierto == oferta.cubierto && descripción.equals(oferta.descripción) && set.equals(oferta.set);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripción, cubierto, set);
    }
}
