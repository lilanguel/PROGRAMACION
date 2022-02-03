import java.util.Arrays;
import java.util.Objects;

public class Preguntas {
    private String enunciado;
    private Opciones[] opciones;
    private final int capacidad=3;

    public Preguntas(String enunciado) {
        this.enunciado = enunciado;
        opciones = new Opciones[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opciones[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opciones[] opciones) {
        this.opciones = opciones;
    }
    public boolean addOpciones(Opciones opc){
        if (opciones.length<capacidad && !esta(opc)){
            Opciones[] resultado= Arrays.copyOf(opciones,opciones.length+1);
            resultado[resultado.length-1]=opc;
            opciones=resultado;
            return true;
        }
        return false;
    }
    public boolean esta(Opciones opc){
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equals(opc)){
                return true;
            }
        }
        return false;
    }

    public boolean elimOpcion(Opciones opc){
        Opciones[] resultado= new Opciones[0];
        Integer longitud=opciones.length;
        for (int i = 0; i < opciones.length; i++) {
            if (!opciones[i].equals(opc)) {
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=opciones[i];
            }
        }
        opciones=resultado;
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
        Preguntas preguntas = (Preguntas) o;
        return enunciado.equals(preguntas.enunciado) && opciones == preguntas.opciones;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado, opciones);
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "enunciado='" + enunciado + '\'' +
                ", opciones=" + Arrays.toString(opciones) +
                ", capacidad=" + capacidad +
                '}';
    }
}
