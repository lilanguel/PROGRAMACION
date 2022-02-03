import java.util.Objects;

public class Opciones {
    private String texto;
    private boolean verdadera;

    public Opciones(String texto, boolean verdadera) {
        this.texto = texto;
        this.verdadera = verdadera;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isVerdadera() {
        return verdadera;
    }

    public void setVerdadera(boolean verdadera) {
        this.verdadera = verdadera;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opciones opciones = (Opciones) o;
        return verdadera == opciones.verdadera && texto.equals(opciones.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, verdadera);
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "texto='" + texto + '\'' +
                ", verdadera=" + verdadera +
                '}';
    }
}
