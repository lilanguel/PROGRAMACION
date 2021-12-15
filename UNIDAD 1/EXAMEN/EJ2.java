import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        int n=sc.nextInt();
        int volteado=0;

        while(n>0){
            volteado=volteado*10+(n%10);
            n/=10;
        }
        System.out.println("El número "+n+" traducido al sistema de asteriscos es:");

        while(volteado>0){
            int ultimaCifra=volteado%10;
            for (int i = 0; i < ultimaCifra; i++) {
                System.out.print("*");
            }

            if (ultimaCifra<volteado){
                System.out.print("_");
            }
            volteado/=10;
        }
    }
}
