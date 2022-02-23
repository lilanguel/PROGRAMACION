import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del vector:");
        int longitud=sc.nextInt();

        int[] v=new int[longitud];

        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduce el número de la posición "+i);
            v[i]=sc.nextInt();
        }

        System.out.println("Vector: "+Arrays.toString(v));

        System.out.println("¿Qué valor quieres introducir?");
        int valor=sc.nextInt();
        System.out.println("¿En qué posición?");
        int pos=sc.nextInt();

        System.out.println("Resultado: "+Arrays.toString(insertarValor(v,valor,pos)));
    }

    public static int[] insertarValor(int[] v, int valor, int pos){
        int[] resultado=new int[v.length+1];

        for (int i = 0; i < resultado.length; i++) {
            if (i<pos){
                resultado[i]=v[i];
            }else if(i==pos){
                resultado[i]=valor;
            }else{
                resultado[i]=v[i-1];
            }
        }
        return resultado;
    }
}
