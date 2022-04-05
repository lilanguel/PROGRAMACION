import java.util.Comparator;

public class MiComparadorAlumnos implements Comparator<Alumno> {

    @Override
    public int compare(Alumno a1, Alumno a2) {
        if (a1.getApellidos().equals(a2.getApellidos())){
            return a1.getNombre().compareTo(a2.getNombre());
        }

        return a1.getApellidos().compareTo(a2.getApellidos());
    }
}
