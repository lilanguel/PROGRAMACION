import java.io.Serializable;
import java.util.Objects;

public class Alumno implements Serializable {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String DNI;
    private String email;
    private String curso;
    private boolean dual;

    public Alumno(String nombre, String apellidos, String direccion, String DNI, String email, String curso, boolean dual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.DNI = DNI;
        this.email = email;
        this.curso = curso;
        this.dual = dual;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isDual() {
        return dual;
    }

    public void setDual(boolean dual) {
        this.dual = dual;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", DNI='" + DNI + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", dual=" + dual +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return dual == alumno.dual && nombre.equals(alumno.nombre) && apellidos.equals(alumno.apellidos) && direccion.equals(alumno.direccion) && DNI.equals(alumno.DNI) && email.equals(alumno.email) && curso.equals(alumno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, direccion, DNI, email, curso, dual);
    }
}
