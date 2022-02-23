import java.util.Calendar;

public class LocalIndustrial extends Local implements mostrarPrecioVenta{
    private double consumoEnergetico;

    public LocalIndustrial(int anho_construccion, String direccion, int metros_cuadrados, double precio, Persona propietario, double consumoEnergetico) {
        super(anho_construccion, direccion, metros_cuadrados, precio, propietario);
        this.consumoEnergetico=consumoEnergetico;
    }


    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    void mostrarPropiedad() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                super.toString()+
                "consumoEnergetico=" + consumoEnergetico +
                "fechaLLamada=" + Calendar.getInstance()+
                '}'+"\n";
    }

    @Override
    public void mostrarPrecioVenta() {
        System.out.println("Soy un Local Industral con un consumo máximo de "+getConsumoEnergetico()+" y valgo "+getPrecio());
    }
}
