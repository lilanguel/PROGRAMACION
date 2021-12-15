import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int alt=0;

        while(alt<4){
            System.out.println("Introduce la altura del árbol");
            alt=sc.nextInt();
        }
        int espacios=alt-3;
        int longitud=1;
        for (int i = 0; i <= espacios; i++) {
            if (i==espacios){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i <= alt-3; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.print("^");
            }else if (i==alt-3){
                for (int j = 0; j < longitud; j++) {
                    System.out.print("^");
                }
            }else{
                System.out.print("^");
                for (int j = 0; j < longitud-2; j++) {
                    System.out.print(" ");
                }
                System.out.print("^");
            }

            System.out.println();
            espacios--;
            longitud+=2;
        }
        espacios=alt-3;
        for (int i = 0; i <= espacios; i++) {
            if (i==espacios){
                System.out.print("Y");
            }else{
                System.out.print(" ");
            }
        }
    }
}
