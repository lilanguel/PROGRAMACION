import java.util.Comparator;

public class MiComparadorTrabajadores implements Comparator<Trabajador> {

    @Override
    public int compare(Trabajador t1, Trabajador t2) {
        if (t1.getApellidos().equals(t2.getApellidos())){
            return t1.getNombre().compareTo(t2.getNombre());
        }
        return t1.getApellidos().compareTo(t2.getApellidos());
    }
}
