package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int result;


        for(int i = 0; i <= 10; i++)
        {
            result = a * i;
            System.out.println( a + " x " + i + " = " + result  );
        }

        for(int i = 0; i <= 10; i++)
        {
            result = b * i;
            System.out.println( b + " x " + i + " = " + result  );
        }

    }
}
