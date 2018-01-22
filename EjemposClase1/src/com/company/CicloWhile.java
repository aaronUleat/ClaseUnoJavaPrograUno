package com.company;

public class CicloWhile {
    public static void main(String[]  args) {
        int i = 1;
        int j = 1;
        while (i < 13) {
            while (j < 13) {
                System.out.print(i);
                System.out.print(" x ");
                System.out.print(j);
                System.out.print(" = ");
                System.out.print(i * j + "  ");
                j++;
            }
            i++;
        }
    }
}
