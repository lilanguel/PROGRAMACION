import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Examen {
    private Calendar fecha;
    private String consejeria;
    private String enlace;
    private Preguntas[] preguntas;
    private Sedes[] sedes;
    private final int capacidad=100;

    public Examen(Calendar fecha, String consejeria, String enlace) {
        this.fecha = fecha;
        this.consejeria = consejeria;
        this.enlace = enlace;
        preguntas=new Preguntas[0];
        sedes=new Sedes[0];
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConsejeria() {
        return consejeria;
    }

    public void setConsejeria(String consejeria) {
        this.consejeria = consejeria;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }

    public boolean addPregunta(Preguntas preg){
        if (preguntas.length<capacidad){
            Preguntas[] resultado= Arrays.copyOf(preguntas,preguntas.length+1);
            resultado[resultado.length-1]=preg;
            preguntas=resultado;
            return true;
        }
        return false;
    }

    public boolean elimPregunta(Preguntas preg){
        Preguntas[] resultado= new Preguntas[0];
        Integer longitud=preguntas.length;
        for (int i = 0; i < preguntas.length; i++) {
            if (!preguntas[i].equals(preg)) {
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=preguntas[i];
            }
        }
        preguntas=resultado;
        if(longitud==resultado.length){
            return false;
        }else{
            return true;
        }
    }
    public boolean addSede(Sedes sed){
        Sedes[] resultado= Arrays.copyOf(sedes,sedes.length+1);
        resultado[resultado.length-1]=sed;
        sedes=resultado;
        return true;
    }

    public boolean elimSede(Sedes sed){
        Sedes[] resultado= new Sedes[0];
        Integer longitud=sedes.length;
        for (int i = 0; i < sedes.length; i++) {
            if (!sedes[i].equals(sed)) {
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=sedes[i];
            }
        }
        sedes=resultado;
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
        Examen examen = (Examen) o;
        return capacidad == examen.capacidad && fecha.equals(examen.fecha) && consejeria.equals(examen.consejeria) && enlace.equals(examen.enlace) && Arrays.equals(preguntas, examen.preguntas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fecha, consejeria, enlace, capacidad);
        result = 31 * result + Arrays.hashCode(preguntas);
        return result;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecha=" + fecha +
                ", consejeria='" + consejeria + '\'' +
                ", enlace='" + enlace + '\'' +
                ", preguntas=" + Arrays.toString(preguntas) +
                ", sedes=" + Arrays.toString(sedes) +
                ", capacidad=" + capacidad +
                '}';
    }
}
