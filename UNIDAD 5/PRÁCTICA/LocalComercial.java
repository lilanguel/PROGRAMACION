import java.util.Calendar;
import java.util.Objects;

public class LocalComercial extends Local implements mostrarPrecioVenta{
    private String actividad;

    public LocalComercial(int anho_construccion, String direccion, int metros_cuadrados, double precio, Persona propietario, String actividad) {
        super(anho_construccion, direccion, metros_cuadrados, precio, propietario);
        this.actividad=actividad;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    @Override
    void mostrarPropiedad() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LocalComercial that = (LocalComercial) o;
        return actividad.equals(that.actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), actividad);
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                super.toString()+
                "actividad='" + actividad + '\'' +
                "fechaLLamada=" + Calendar.getInstance()+
                '}';
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a "+getActividad()+" y valgo "+getPrecio());
    }
}
