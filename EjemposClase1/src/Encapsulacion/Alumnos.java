package Encapsulacion;

import java.util.Scanner;

public class Alumnos {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int salario = 0;
        String elNombre = teclado.next();
        cProfesor profe     = new cProfesor("Gerardo", "@", "123456");
        cProfesor profe2    = new cProfesor();

        System.out.println( profe2.CalcularSalario() );
    }
}
