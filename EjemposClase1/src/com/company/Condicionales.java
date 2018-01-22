package com.company;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        int edad;

        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();

        // Formato #1
        if (edad < 18) {
            System.out.println("Usted es menor de edad");
        }
        if (edad >= 18 && edad < 65) {
            System.out.println("Usted es adulto");
        }
        if (edad >= 65) {
            System.out.println("Usted es adulto mayor");
        }

        // Formato #2
        if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else {
            if (edad < 65) {
                System.out.println("Usted es adulto");
            } else {
                System.out.println("Usted es adulto mayor");
            }
        }

        // Formato #3
        if (edad < 18) {
            System.out.println("Usted es menor de edad");
        } else if(edad < 65) {
            System.out.println("Usted es adulto");
        } else {
            System.out.println("Usted es adulto mayor");
        }

    }
}
