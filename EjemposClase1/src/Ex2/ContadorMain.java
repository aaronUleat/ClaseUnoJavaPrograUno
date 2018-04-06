package Ex2;

import javax.swing.*;
import java.util.Scanner;

public class ContadorMain {

    public static void main(String[] args)
    {
        String resp = "";
        Vehiculos[] autos = new Vehiculos[24];
        Reportes report = new Reportes();

        Scanner ing = new Scanner(System.in);

        Vehiculos miVeh = new Vehiculos();
        while (! resp.equals("3"))
        {
            System.out.println("1. Ingreso de numero de Vehiculos cada hora.");
            resp = JOptionPane.showInputDialog("Ingrese alguna de las opciones del menu");
            System.out.println(resp);
            if (resp.equals("1"))
            {

                int moto = 0;
                int liv = 0;
                int pes = 0;

                for (int i = 0; i <= autos.length; i++ ){
                    int hora = i + 1;
                    System.out.println("Ingrese el numero de Motos en la hora" + " " + i);
                    moto = ing.nextInt();
                    autos[i].setMoto(moto);

                    System.out.println("Ingrese el numero de Vehiculos livianos en la hora" + " " + i);
                    liv = ing.nextInt();
                    autos[i].setLivianos(liv);

                    System.out.println("Ingrese el numero de Vehiculos Pesados " + " " + i);
                    pes = ing.nextInt();
                    autos[i].setLivianos(pes);
                }



            }

            if (resp.equals("2"))
            {
                CantVehi( autos );
            }
        }
    }

    public static Vehiculos[] CantVehi(Vehiculos lAutos[])
    {
        int contMot = 0;
        int contLiv = 0;
        int contPes = 0;

        for (int i = 0; i < lAutos.length; i++) {

        }

        return lAutos;
     }

     public static Vehiculos[] Promedio(Vehiculos lVehiculos[])
     {
        return lVehiculos;
     }

     public static void CantidadPorHora()
     {

     }
}
