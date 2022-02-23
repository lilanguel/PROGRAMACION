import java.util.Objects;

public class Persona {
    private String NIF;
    private String nombre;
    private String apellidos;
    private static int contadorID=0;
    private int identificador;


    public Persona(String NIF, String nombre, String apellidos) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador=contadorID;
        contadorID++;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
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

    public static int getContadorID() {
        return contadorID;
    }

    public static void setContadorID(int contadorID) {
        Persona.contadorID = contadorID;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "NIF='" + NIF + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificador=" + identificador +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return identificador == persona.identificador && NIF.equals(persona.NIF) && nombre.equals(persona.nombre) && apellidos.equals(persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NIF, nombre, apellidos, identificador);
    }
}
