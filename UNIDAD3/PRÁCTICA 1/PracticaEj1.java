import java.util.Arrays;
import java.util.Scanner;

public class PracticaEj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del array 1");
        int tamano1 = sc.nextInt();
        System.out.println("Introduce la longitud del array 2");
        int tamano2 = sc.nextInt();

        int[] vector1 = new int[tamano1];
        int[] vector2 = new int[tamano2];

        System.out.println("Relleno del array 1: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Cifra de la posicion " + i);
            int num = sc.nextInt();
            vector1[i] = num;
        }

        System.out.println("Relleno del array 2: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Cifra de la posicion " + i);
            int num = sc.nextInt();
            vector2[i] = num;
        }

        System.out.println("Vector 1: "+Arrays.toString(vector1));
        System.out.println("Vector 2:"+Arrays.toString(vector2));

        System.out.println("Vector intersección: "+Arrays.toString(interseccionVectores(vector1,vector2)));

    }

    public static int [] interseccionVectores(int[] a, int[] b){
        int[] resultado=new int[0];
        for (int i = 0; i < a.length; i++) {
            if (esta(a[i],b) && !esta(a[i],resultado)){
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=a[i];
            }
        }
        Arrays.sort(resultado);

        return resultado;
    }
    public static boolean esta(int n, int[] a){
        for (int i = 0; i < a.length; i++) {
            if (n==a[i]){
                return true;
            }
        }
        return false;
    }
}
