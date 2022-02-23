import java.util.Arrays;
import java.util.Scanner;

public class PracticaEj4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nº de filas del vector:");
        int filas=sc.nextInt();
        System.out.println("Nº de columnas del vector:");
        int columnas=sc.nextInt();

        int[][] vector=new int[filas][columnas];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                int randomNum = (int)(Math.random() * 16);
                vector[i][j]=randomNum;
            }
        }

        for (int[] row:vector) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Introduce el número de columnas a desplazar: ");
        int numCols=sc.nextInt();

        System.out.println("Vector desplazado: ");
        for (int[] row:desplazarMatriz(vector,numCols)) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] desplazarMatriz(int[][] a, int numCols){
        int[][] resultado=new int[a.length][a[0].length];
        while (numCols>=a[0].length){
            numCols-=a[0].length;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (j+numCols<a[i].length){
                    resultado[i][j+numCols]=a[i][j];
                }else{
                    resultado[i][j+numCols-a[i].length]=a[i][j];
                }
            }
        }
        return resultado;
    }
}
