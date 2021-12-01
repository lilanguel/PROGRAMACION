import java.util.Arrays;

public class PracticaEj2 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];


        for (int i = 0; i < numero.length; i++) {
            int randomNum = (int)(Math.random() * 101);
            numero[i]=randomNum;
        }

        System.out.println(Arrays.toString(numero));

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i]=numero[i]*numero[i];
        }

        System.out.println(Arrays.toString(cuadrado));

        for (int i = 0; i < cubo.length; i++) {
            cubo[i]=numero[i]*numero[i]*numero[i];
        }

        System.out.println(Arrays.toString(cubo));

        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]+" ");
            System.out.print(cuadrado[i]+" ");
            System.out.print(cubo[i]+" ");
            System.out.println();
        }
    }
}
