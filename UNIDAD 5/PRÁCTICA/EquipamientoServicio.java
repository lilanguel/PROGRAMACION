import java.util.Calendar;
import java.util.Objects;

public class EquipamientoServicio extends Propiedad {
    private TipoServicio tipoServicio;

    public EquipamientoServicio(int anho_construccion, String direccion, int metros_cuadrados,TipoServicio tipoServicio) {
        super(anho_construccion, direccion, metros_cuadrados);
        this.tipoServicio=tipoServicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }



    @Override
    void mostrarPropiedad() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                super.toString()+
                "tipoServicio=" + tipoServicio +
                "fechaLLamada=" + Calendar.getInstance()+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipamientoServicio that = (EquipamientoServicio) o;
        return tipoServicio == that.tipoServicio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoServicio);
    }
}
