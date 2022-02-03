import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer anio;
    private boolean adaptacion;
    private String descripcion;
    private static int numOpositores;
    private static int numOpositoresConAdaptacion;

    public Opositor(String nombre, String apellidos, Integer anio, boolean adaptacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anio = anio;
        if (adaptacion){
            this.adaptacion = adaptacion;
            this.descripcion = descripcion;
            numOpositoresConAdaptacion++;
        }else{
            this.adaptacion = adaptacion;
            this.descripcion = null;
        }

        numOpositores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getNumOpositores() {
        return numOpositores;
    }

    public static int getNumOpositoresConAdaptacion() {
        return numOpositoresConAdaptacion;
    }

    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return adaptacion == opositor.adaptacion && nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos) && anio.equals(opositor.anio) && descripcion.equals(opositor.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, anio, adaptacion, descripcion);
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anio=" + anio +
                ", adaptacion=" + adaptacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
