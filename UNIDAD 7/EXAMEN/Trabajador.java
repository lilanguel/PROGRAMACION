import java.util.Objects;

public class Trabajador {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacion_academica;



    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacion_academica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacion_academica = formacion_academica;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacion_academica() {
        return formacion_academica;
    }

    public void setFormacion_academica(String formacion_academica) {
        this.formacion_academica = formacion_academica;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formacion_academica='" + formacion_academica + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return edad == that.edad && dni.equals(that.dni) && nombre.equals(that.nombre) && apellidos.equals(that.apellidos) && formacion_academica.equals(that.formacion_academica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, edad, formacion_academica);
    }
}
