package Bingo;

import javax.swing.*;

public class Bingo {
    public static void main(String[] args)
    {
        String respuesta = "";
        cBingo miBingo = new cBingo();

        while (! respuesta.equals("3"))
        {
            System.out.println("1. Mostrar un numero");
            System.out.println("2. Mostrar un Carton");
            System.out.println("3. Salir");

            respuesta       = JOptionPane.showInputDialog("Seleccione una opcion");

            if(respuesta.equals("1")){
                System.out.println(miBingo.GenerarNumero());
            }
            if(respuesta.equals("2")) {
                miBingo.GenerarCarton();
            }

        }
    }
}
