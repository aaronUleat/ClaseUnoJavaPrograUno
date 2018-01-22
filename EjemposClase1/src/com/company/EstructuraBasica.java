package com.company;

import java.util.Scanner;

public class EstructuraBasica {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número:   ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese otro número: ");
        numero2 = teclado.nextInt();

        suma            = numero1 + numero2;
        resta           = numero1 - numero2;
        multiplicacion  = numero1 * numero2;
        division        = numero1 / numero2;    // Considere el error que se puede presentar si el segundo número es cero

        System.out.println("El resultado de la suma es:           " + suma);
        System.out.println("El resultado de la resta es:          " + resta);
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
        System.out.println("El resultado de la división es:       " + division);

    }
}
