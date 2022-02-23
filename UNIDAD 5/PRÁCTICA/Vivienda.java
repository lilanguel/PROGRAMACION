import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Vivienda extends Propiedad implements mostrarPrecioVenta{
    private Persona[] personas;
    private int nBaños;
    private int nHabitaciones;
    private int capacidad;
    private double precio;

    public Vivienda(int anho_construccion, String direccion, int metros_cuadrados, int nBaños, int nHabitaciones, int capacidad, double precio) {
        super(anho_construccion, direccion, metros_cuadrados);
        this.nBaños = nBaños;
        this.nHabitaciones = nHabitaciones;
        this.capacidad = capacidad;
        this.precio = precio;
        this.personas=new Persona[0];
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public int getnBaños() {
        return nBaños;
    }

    public void setnBaños(int nBaños) {
        this.nBaños = nBaños;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean addPersonas(Persona per){
        if (personas.length<capacidad && !estaPersona(per)){
            Persona[] resultado= Arrays.copyOf(personas,personas.length+1);
            resultado[resultado.length-1]=per;
            personas=resultado;
            return true;
        }
        return false;
    }

    public boolean estaPersona(Persona per){
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].equals(per)){
                return true;
            }
        }
        return false;
    }

    public boolean elimPersona(Persona per){
        if (personas.length>0){
            Persona[] resultado= new Persona[0];

            for (int i = 0; i < personas.length; i++) {
                if (!personas[i].equals(per)){
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=personas[i];
                }
            }
            personas=resultado;
            return true;
        }
        return false;
    }

    @Override
    void mostrarPropiedad() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                super.toString()+
                "personas=" + Arrays.toString(personas) +
                ", nBaños=" + nBaños +
                ", nHabitaciones=" + nHabitaciones +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", fechaLLamada=" + Calendar.getInstance()+
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vivienda vivienda = (Vivienda) o;
        return nBaños == vivienda.nBaños && nHabitaciones == vivienda.nHabitaciones && capacidad == vivienda.capacidad && Double.compare(vivienda.precio, precio) == 0 && Arrays.equals(personas, vivienda.personas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nBaños, nHabitaciones, capacidad, precio);
        result = 31 * result + Arrays.hashCode(personas);
        return result;
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima "+getCapacidad()+" y valgo "+ getPrecio());
    }


}
