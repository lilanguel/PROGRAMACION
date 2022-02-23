import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Registro r1 = new Registro();
        Persona p1= new Persona("458426C","Ángel","Ríos");
        Persona p2= new Persona("497849R","Manuel","Jaén");
        Persona p3= new Persona("465465E","Miguel","Núñez");
        Persona p4= new Persona("541441T","Iván","Negrón");
        Vivienda v1=new Vivienda(2002,"Arriate N6",698,2,4,10,100000.00);
        Vivienda v2=new Vivienda(1986,"Cervantes N8",124,4,8,10,1000005.00);
        Vivienda v3=new Vivienda(2015,"Canaletas N9",30,1,2,3,20000.00);
        LocalIndustrial li1=new LocalIndustrial(1986,"Paquito N37",125,9605,p1,569.36);
        LocalComercial lc1=new LocalComercial(2012,"mamerto N5", 536,8965.23,p2,"Tienda de ropa");
        EquipamientoServicio es1=new EquipamientoServicio(2019,"Carrasco N98",159,TipoServicio.DEPORTIVO);

        Vivienda[] viviendas = {v1,v2,v3};

        Arrays.sort(viviendas, new Comparator<Vivienda>() {
            @Override
            public int compare(Vivienda p1, Vivienda p2) {
                return p1.getnHabitaciones() - p2.getnHabitaciones();
            }
        });

        System.out.println(Arrays.toString(viviendas));

        System.out.println("-------------------");

        r1.addPropiedad(v1);
        r1.addPropiedad(v2);
        r1.addPropiedad(v3);
        r1.addPropiedad(li1);

        r1.informeSuperficie();

        r1.eliminarPropiedad(v3);

        System.out.println("-------------------");

        r1.informeAntiguedad();

        System.out.println("-------------------");


        v1.addPersonas(p1);
        v1.addPersonas(p2);

        v1.mostrarPropiedad();

        v1.elimPersona(p2);

        v1.mostrarPropiedad();

        System.out.println("-------------------");

        li1.mostrarPrecioVenta();
        v1.mostrarPrecioVenta();
        lc1.mostrarPrecioVenta();
    }
}
