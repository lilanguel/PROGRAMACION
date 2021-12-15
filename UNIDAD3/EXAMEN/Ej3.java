import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        int dim=sc.nextInt();

        int[][] matriz=new int[dim][dim];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random() * (201-100)*100);
            }
        }

        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Número de celdas de la matriz que son mayores o iguales que todos sus vecinos adyacentes:" + numPicos(matriz));
    }

    public static int numPicos(int[][] matriz){
        int numPicos=0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPico(matriz,matriz[i][j])){
                    numPicos++;
                }
            }
        }

        return numPicos;
    }
    public static boolean esPico(int[][] matriz, int n){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

            }
        }
        return false;
    }
}
