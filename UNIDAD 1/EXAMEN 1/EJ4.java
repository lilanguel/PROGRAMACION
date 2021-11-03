import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura de la bandera en cm:");
        double alt=sc.nextDouble();
        System.out.println("Ahora introduzca la anchura:");
        double anc=sc.nextDouble();
        System.out.println("¿Quiere el escudo bordado? (s/n)");
        String escudo=sc.next();
        double envio=3.25;
        double area=alt*anc;
        double preciobase=0.01;
        double total;
        if (escudo.equals("s")){
            total=preciobase*area+envio+2.50;
        }else{
            total=preciobase*area+envio;
        }

        System.out.println("Gracias aquí tiene el desglose de su compra");
        System.out.println("Bandera de "+area+" cm2:  "+(preciobase*area)+" €");
        if (escudo.equals("s")){
            System.out.println("Con escudo: 2,50 €");
        }else{
            System.out.println("Sin escudo: 0,00 €");
        }
        System.out.println("Gastos de envío: "+envio+" €");
        System.out.println("Total: "+total+" €");
    }
}
