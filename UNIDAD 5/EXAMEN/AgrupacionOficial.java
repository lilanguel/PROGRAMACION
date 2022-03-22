import java.util.Objects;

public abstract class AgrupacionOficial extends Agrupacion{
    private int puntos_obtenidos;

    public AgrupacionOficial(String nombre, String autor, String autor_música, String autor_letras, String tipo, int puntos_obtenidos) {
        super(nombre, autor, autor_música, autor_letras, tipo);
        this.puntos_obtenidos = puntos_obtenidos;
    }

    public int getPuntos_obtenidos() {
        return puntos_obtenidos;
    }

    public void setPuntos_obtenidos(int puntos_obtenidos) {
        this.puntos_obtenidos = puntos_obtenidos;
    }

    abstract void insertar_integrante(Integrante i);

    abstract boolean eliminar_integrante(Integrante i);

    abstract void caminito_del_falla();

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                super.toString()+
                "puntos_obtenidos=" + puntos_obtenidos +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgrupacionOficial that = (AgrupacionOficial) o;
        return puntos_obtenidos == that.puntos_obtenidos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), puntos_obtenidos);
    }
}
