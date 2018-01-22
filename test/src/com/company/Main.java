package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String variableString;

        Scanner entrada=new Scanner(System.in);// se declara e inicializa una instancia  de la clase Scanner.

        System.out.print("Ingrese un texto: ");

        variableString = entrada.next();

        System.out.println("Texto ingresado: "+variableString);

    }
}
