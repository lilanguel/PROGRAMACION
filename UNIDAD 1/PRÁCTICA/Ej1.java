import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de las Z");
        int alturaIntroducida = sc.nextInt();
        int espacios = alturaIntroducida - 1;

        while (alturaIntroducida % 2 == 0 || alturaIntroducida <= 3) {
            System.out.println("Error");
            System.out.println("Por favor, vuelva a introducir la altura de las Z");
            alturaIntroducida = sc.nextInt();
        }

        for (int i = 0; i < alturaIntroducida; i++) {
            if (i == 0 || i == alturaIntroducida-1) {
                for (int j = 0; j < alturaIntroducida; j++) {
                    System.out.print("*");
                }
                System.out.print("   ");
                for (int j = 0; j < alturaIntroducida; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j <espacios; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j <alturaIntroducida+2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
            espacios--;
        }
    }
}
