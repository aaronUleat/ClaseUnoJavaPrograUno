package Menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args)
    {
        int numIng;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1 Para mostrar los numeros ascendentemente del 1 al 100");
        numIng = teclado.nextInt();
        String menuDat;
        switch (numIng)
        {
            case 1: System.out.println("Lo hize");
            break;
            default: System.out.println("No hizo nada");
            break;
        }


    }
}
