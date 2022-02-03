import java.util.Arrays;
import java.util.Objects;

public class Sedes {
    private String codigo;
    private Capitales capitales;
    private Opositor[] opositores;

    public Sedes(String codigo, Capitales capitales) {
        this.codigo = codigo;
        this.capitales = capitales;
        opositores=new Opositor[0];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Capitales getCapitales() {
        return capitales;
    }

    public void setCapitales(Capitales capitales) {
        this.capitales = capitales;
    }

    public Opositor[] getOpositores() {
        return opositores;
    }

    public void setOpositores(Opositor[] opositores) {
        this.opositores = opositores;
    }

    public boolean addOpositor(Opositor opositor){
        if (!esta(opositor)){
            Opositor[] resultado= Arrays.copyOf(opositores,opositores.length+1);
            resultado[resultado.length-1]=opositor;
            opositores=resultado;
            return true;
        }
        return false;
    }
    public boolean esta(Opositor opos){
        for (int i = 0; i < opositores.length; i++) {
            if (opositores[i].equals(opos)){
                return true;
            }
        }
        return false;
    }

    public boolean elimOpositor(Opositor opos){
        Opositor[] resultado= new Opositor[0];
        Integer longitud=opositores.length;
        for (int i = 0; i < opositores.length; i++) {
            if (!opositores[i].equals(opos)) {
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=opositores[i];
            }
        }
        opositores=resultado;
        if(longitud==resultado.length){
            return false;
        }else{
            return true;
        }
    }

    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedes sedes = (Sedes) o;
        return codigo.equals(sedes.codigo) && capitales == sedes.capitales && Arrays.equals(opositores, sedes.opositores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(codigo, capitales);
        result = 31 * result + Arrays.hashCode(opositores);
        return result;
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "codigo='" + codigo + '\'' +
                ", capitales=" + capitales +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }
}
