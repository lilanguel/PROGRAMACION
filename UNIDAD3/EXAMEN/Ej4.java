import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nº de filas de la matriz:");
        int filas=sc.nextInt();
        System.out.println("Introduce el nº de columnas de la matriz:");
        int cols=sc.nextInt();

        int[][] matriz=new int[filas][cols];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= (int)(Math.random() * 101);
            }
        }

        System.out.println("Matriz generada: ");
        for (int[] row:matriz) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Matriz generada sin las filas pares: ");
        for (int[] row:eliminarFilasPares(matriz)) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Matriz generada sin las filas impares: ");
        for (int[] row:eliminarFilasImpares(matriz)) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][] matrizSinFilasPares=new int[matriz.length/2][matriz[0].length];

        for (int i = 0; i < matrizSinFilasPares.length; i++) {
            for (int j = 0; j < matrizSinFilasPares[0].length; j++) {
                matrizSinFilasPares[i][j]=matriz[i*2+1][j];
            }
        }

        return matrizSinFilasPares;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] matrizSinFilasImpares=new int[matriz.length/2][matriz[0].length];

        for (int i = 0; i < matrizSinFilasImpares.length; i++) {
            for (int j = 0; j < matrizSinFilasImpares[0].length; j++) {
                matrizSinFilasImpares[i][j]=matriz[i*2][j];
            }
        }

        return matrizSinFilasImpares;
    }
}