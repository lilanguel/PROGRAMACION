import java.util.Arrays;
import java.util.Comparator;

public class COAC {
    private AgrupacionOficial[] agrupacionOficials;

    public COAC() {
        this.agrupacionOficials=new AgrupacionOficial[0];
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion){
        this.agrupacionOficials = Arrays.copyOf(this.agrupacionOficials,this.agrupacionOficials.length+1);
        agrupacionOficials[agrupacionOficials.length-1]=agrupacion;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        if (agrupacionOficials.length>0){
            AgrupacionOficial[] resultado= new AgrupacionOficial[0];

            for (int i = 0; i < agrupacionOficials.length; i++) {
                if (!agrupacionOficials[i].equals(agrupacion)){
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=agrupacionOficials[i];
                }
            }
            agrupacionOficials=resultado;
            return true;
        }
        return false;
    }


    public void ordenar_por_puntos(){
        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial t1, AgrupacionOficial t2) {
                return t1.getPuntos_obtenidos()-t2.getPuntos_obtenidos();
            }
        });
    }

    public void ordenar_por_nombre(){
        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial t1, AgrupacionOficial t2) {
                return t1.getNombre().compareTo(t2.getNombre());
            }
        });
    }

    public void ordenar_por_autor(){
        Arrays.sort(agrupacionOficials, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial t1, AgrupacionOficial t2) {
                return t1.getAutor().compareTo(t2.getAutor());
            }
        });
    }

    @Override
    public String toString() {
        return "COAC{" +
                "agrupacionOficials=" + Arrays.toString(agrupacionOficials) +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        COAC coac = (COAC) o;
        return Arrays.equals(agrupacionOficials, coac.agrupacionOficials);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(agrupacionOficials);
    }
}
