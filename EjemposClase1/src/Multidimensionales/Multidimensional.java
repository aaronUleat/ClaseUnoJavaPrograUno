package Multidimensionales;

import java.util.Scanner;

public class Multidimensional {

    public static void main( String[] args)
    {
        Scanner leer = new Scanner(System.in);
        Alumno arr[] = new Alumno[2];

        String nombre = "";
        int matricula = 0;
        char grupo = ' ';
        int grado = 0;

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Ingresa tu nombre");
            nombre = leer.nextLine();
            System.out.print("Ingresa tu matricula");
            matricula = leer.nextInt();
            System.out.print("Ingresa tu grupo");
            grupo = leer.next().charAt(0);
            System.out.print("Ingresa tu grado");
            grado = leer.nextInt();
        }

    }
}
