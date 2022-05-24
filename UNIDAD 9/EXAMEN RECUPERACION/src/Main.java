public class Main {
    public static void main(String[] args) {
        VUELIXAR vuelixar = new VUELIXAR();

        vuelixar.cargarDatos();

        Pasajero p1 = new Pasajero("Mamerto", "Galán", "63742479D");
        Pasajero p2 = new Pasajero("Ángel", "de los Ríos", "49068381C");
        Pasajero p3 = new Pasajero("Iván", "Negrón", "12345678P");
        Pasajero p4 = new Pasajero("Miguel", "Núñez", "98765432R");
        Pasajero p5 = new Pasajero("Manuel", "Jaén", "84328392L");
        Pasajero p6 = new Pasajero("Mariana", "Cáceres", "39474983G");

        Vuelo v1 = new Vuelo("1", "Barajas", "San José", "12/04/2007");
        Vuelo v2 = new Vuelo("2", "Madrid", "Sevilla", "19/06/2008");


        vuelixar.addVuelo(v1);
        vuelixar.addVuelo(v2);

        vuelixar.addPasajero("1", p1);
        vuelixar.addPasajero("1", p2);
        vuelixar.addPasajero("1", p3);
        vuelixar.addPasajero("1", p4);
        vuelixar.addPasajero("2", p5);
        vuelixar.addPasajero("2", p6);

        vuelixar.removePasajero("1", p1);

        vuelixar.mostrarXPasajeros();

        vuelixar.guardarDatos();
    }
}