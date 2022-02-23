import java.util.Objects;

public abstract class Local extends Propiedad {
    private Persona propietario;
    private double precio;

    public Local(int anho_construccion, String direccion, int metros_cuadrados, double precio, Persona propietario) {
        super(anho_construccion, direccion, metros_cuadrados);
        this.precio=precio;
        this.propietario=propietario;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{" +
                super.toString()+
                "propietario=" + propietario +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Local local = (Local) o;
        return Double.compare(local.precio, precio) == 0 && propietario.equals(local.propietario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propietario, precio);
    }
}
