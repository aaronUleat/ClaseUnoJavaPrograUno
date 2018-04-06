package Loteria;

import javax.swing.*;

public class MainLoteria {
    public static void main(String[] args)
    {

        String resp     = "";
        Tradicional miTiquete = new Tradicional();
        while(! resp.equals("3"))
        {
            System.out.println("1. Loteria");

            resp = JOptionPane.showInputDialog("Ingrese alguna de las opciones del menu");


            if(resp.equals("1")) {
                miTiquete.GenerarNumeroSerie();
            }
        }
    }
}
