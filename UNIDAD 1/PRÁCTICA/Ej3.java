import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca el número de personas que sois");
        int personas = sc.nextInt();
        System.out.println("Por favor, introduzca el día de la semana que iréis");
        String dia = sc.next();
        System.out.println("¿Tiene tarjeta de cine Campa? (s/n)");
        String tarjeta=sc.next();
        double preciobase=8;
        double descuento=0;
        double total=0;
        int individuales=0;

        switch (dia){
            case "Lunes":
                total=personas*preciobase;
                individuales=personas;
            case "Martes":
                total=personas*preciobase;
                individuales=personas;
            case "Miércoles":
                preciobase=5;
                total=personas*preciobase;
                individuales=personas;
            case "Jueves":
                total=(personas/2)*11;
                int pico=(personas%2)*8;
                total+=pico;
            case "Viernes":
                total=personas*preciobase;
                individuales=personas;
            case "Sábado":
                total=personas*preciobase;
                individuales=personas;
            case "Domingo":
                total=personas*preciobase;
                individuales=personas;
        }

        if (tarjeta.equals("s")){
            descuento=personas*preciobase*0.1;
        }


        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas:                  "+personas);
        System.out.println("¿Tiene tarjeta de cine Campa? (s/n)  "+tarjeta);
        System.out.println();
        if (dia.equals("Jueves")){
            System.out.println("Entrada de parejas:                  "+(personas/2));
            System.out.println("Precio por entrada de pareja         "+11);
        }else {
            System.out.println("Entradas individuales:               "+individuales);
            System.out.println("Precio por entrada individual:       "+preciobase);
        }
        System.out.println("Total:                               "+total);
        System.out.println("Descuento:                           "+descuento);
        System.out.println("A pagar:                             "+(total-descuento));
    }
}
