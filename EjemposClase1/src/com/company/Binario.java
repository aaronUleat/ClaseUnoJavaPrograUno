package com.company;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args)
    {
        int numIng;
        int res;
        String strBin = "";


        System.out.println("Ingrese un numero");
        Scanner inp = new Scanner(System.in);
        numIng = inp.nextInt();

        while(numIng > 1)
        {
            //numIng = numIng / 2;
            res = numIng % 2;
            String numInt =  Integer.toString( res  );
            strBin +=  numInt;
        }
        System.out.println("Binario:" + strBin);

    }
}
