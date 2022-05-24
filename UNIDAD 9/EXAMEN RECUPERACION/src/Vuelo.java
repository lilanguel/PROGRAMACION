import java.util.HashSet;
import java.util.Objects;

public class Vuelo {
    private String codigo;
    private String aeropuerto_origen;
    private String aeropuerto_destino;
    private String fecha;
    private HashSet<Pasajero> pasajeros;

    public Vuelo(String codigo, String aeropuerto_origen, String aeropuerto_destino, String fecha) {
        this.codigo = codigo;
        this.aeropuerto_origen = aeropuerto_origen;
        this.aeropuerto_destino = aeropuerto_destino;
        this.fecha = fecha;
        pasajeros = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAeropuerto_origen() {
        return aeropuerto_origen;
    }

    public void setAeropuerto_origen(String aeropuerto_origen) {
        this.aeropuerto_origen = aeropuerto_origen;
    }

    public String getAeropuerto_destino() {
        return aeropuerto_destino;
    }

    public void setAeropuerto_destino(String aeropuerto_destino) {
        this.aeropuerto_destino = aeropuerto_destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public HashSet<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(HashSet<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigo=" + codigo +
                ", aeropuerto_origen='" + aeropuerto_origen + '\'' +
                ", aeropuerto_destino='" + aeropuerto_destino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", pasajeros=" + pasajeros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return codigo == vuelo.codigo && Objects.equals(aeropuerto_origen, vuelo.aeropuerto_origen) && Objects.equals(aeropuerto_destino, vuelo.aeropuerto_destino) && Objects.equals(fecha, vuelo.fecha) && Objects.equals(pasajeros, vuelo.pasajeros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, aeropuerto_origen, aeropuerto_destino, fecha, pasajeros);
    }
}

