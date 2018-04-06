package Teatro;

import java.util.Scanner;

public class Teatro {
    public static void main(String[] args)
    {
        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        Tiquete Datos[][][] = new Tiquete[20][10][5];

        while (opcion != 0)
        {
            System.out.print("1. Vender");
            System.out.print("2. Devolver");
            System.out.print("3. Consultar");
            System.out.print("4. Limpiar");

            opcion = teclado.nextInt();


        }
    }


}
