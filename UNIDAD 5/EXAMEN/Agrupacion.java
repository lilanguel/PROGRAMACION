import java.util.Objects;

public abstract class Agrupacion extends COAC {
    private String nombre;
    private String autor;
    private String autor_música;
    private String autor_letras;
    private String tipo;
    private static int nAgrupaciones;

    public Agrupacion(String nombre, String autor, String autor_música, String autor_letras, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autor_música = autor_música;
        this.autor_letras = autor_letras;
        this.tipo = tipo;
        nAgrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor_música() {
        return autor_música;
    }

    public void setAutor_música(String autor_música) {
        this.autor_música = autor_música;
    }

    public String getAutor_letras() {
        return autor_letras;
    }

    public void setAutor_letras(String autor_letras) {
        this.autor_letras = autor_letras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    abstract void cantar_la_presentacion();

    abstract void hacer_tipo();

    public static void mostrar_numero_agrupaciones(){
        System.out.println("Numero de agrupaciones: "+nAgrupaciones);
    }

    @Override
    public String toString() {


        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autor_música='" + autor_música + '\'' +
                ", auot_letras='" + autor_letras + '\'' +
                ", tipo='" + tipo + '\'' +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agrupacion that = (Agrupacion) o;
        return nombre.equals(that.nombre) && autor.equals(that.autor) && autor_música.equals(that.autor_música) && autor_letras.equals(that.autor_letras) && tipo.equals(that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, autor_música, autor_letras, tipo);
    }
}
