import java.util.Arrays;
import java.util.Scanner;

public class PracticaEj3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del vector");
        int tamano=sc.nextInt();

        int[][] vector=new int[tamano][tamano];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                int randomNum = (int)(Math.random() * (65-18)+18);
                vector[i][j]=randomNum;
            }
        }

        for (int[] row:vector) {
            System.out.println(Arrays.toString(row));
        }

        int[] diagonal=new int[vector.length];

        for(int i=0;i<vector.length;i++){
            for(int j=0;j<vector[i].length;j++){
                if(i==j){
                    diagonal[i] = vector[i][j];
                }
            }
        }
        System.out.println("Diagonal: "+Arrays.toString(diagonal));

        int min=diagonal[0];
        int max=diagonal[0];
        for (int i = 0; i < vector.length ; i++) {
            if (diagonal[i]>max){
                max=diagonal[i];
            }else if (diagonal[i]<min){
                min=diagonal[i];
            }
        }

        double suma=0;

        for (int i = 0; i < diagonal.length; i++) {
            suma+=diagonal[i];
        }

        double media=suma/diagonal.length;

        System.out.println("Máximo: "+max);
        System.out.println("Mínimo "+min);
        System.out.println("Media: "+media);
    }
}
