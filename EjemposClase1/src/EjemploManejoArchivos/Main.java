package EjemploManejoArchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    static String[] nums = new String[10];

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;

        while (opcion != 0)
        {
            System.out.print("Llegue");
            System.out.print("1. Llenar");
            System.out.print("2. Guardar");
            System.out.print("3. Borrar");
            System.out.print("4. Mostrar");
            System.out.print("5. Cargar");
            System.out.print("0. Salir");

            if (opcion == 1)
            {
                LLenar();
            }
            else if (opcion == 2)
            {

            }
            else if (opcion == 3)
            {

            }
            else if (opcion == 4)
            {

            }
            else if (opcion == 5)
            {

            }
        }

    }

    public static void LLenar() {
    }



}
