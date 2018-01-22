package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int resultado = 1;
        int valor = 0;

        System.out.print("Ingrese un numero: ");
        Scanner teclado = new Scanner(System.in);
        valor = teclado.nextInt();

        // Con un cilo while

        while (valor > 0) {
            resultado = resultado * valor;
            valor --;
        }
        System.out.println("Con el ciclo WHILE el resultado es: " + resultado);

        // Con ciclo for
        for (int i = valor; i > 0; i--) {
            resultado = resultado * valor;
        }
        System.out.println("Con el ciclo FOR el resutado es: " + resultado);
    }
}
