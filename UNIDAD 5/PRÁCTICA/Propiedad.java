public abstract class Propiedad implements Comparable<Propiedad> {
    private int anho_construccion;
    private String direccion;
    private int metros_cuadrados;
    private static int contadorPropiedades;

    public Propiedad(int anho_construccion, String direccion, int metros_cuadrados) {
        this.anho_construccion = anho_construccion;
        this.direccion = direccion;
        this.metros_cuadrados = metros_cuadrados;
        contadorPropiedades++;
    }

    abstract void mostrarPropiedad();

    public int getAnho_construccion() {
        return anho_construccion;
    }

    public void setAnho_construccion(int anho_construccion) {
        this.anho_construccion = anho_construccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(int metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public static int getContadorPropiedades() {
        return contadorPropiedades;
    }

    public static void setContadorPropiedades(int contadorPropiedades) {
        Propiedad.contadorPropiedades = contadorPropiedades;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "anho_construccion=" + anho_construccion +
                ", direccion='" + direccion + '\'' +
                ", metros_cuadrados=" + metros_cuadrados +
                '}'+"\n";
    }

    @Override
    public int compareTo(Propiedad propiedad) {
        return this.metros_cuadrados - propiedad.getMetros_cuadrados();
    }
}
