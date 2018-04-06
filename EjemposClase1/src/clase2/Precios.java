package clase2;

import java.util.Scanner;

public class Precios {

    public static void main(String[] args) {
        int [] precios = new int[5];
        Scanner teclado = new Scanner(System.in);
        int numIng;
        int sum = 0;
        for(int i = 1; i <= precios.length; i++)
        {

            System.out.println("Ingrese el precio " + i);
            numIng = teclado.nextInt();
            precios[i] = numIng;
            //System.out.println(precios[i]);
        }

        for (int ii = 0; ii <= precios.length; ii++)
        {
            sum += precios[ii];
        }

        System.out.println(sum);
    }
}
