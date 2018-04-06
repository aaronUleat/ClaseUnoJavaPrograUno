package Citas;

import java.util.Scanner;

public class Citas {

    public static void main(String[] args)
    {
        String sNombre = "";
        String sCedula = "";
        String sTelefono = "";
        String sCorreo = "";
        String sPadecimiento = "";



        Scanner teclado = new Scanner(System.in);
        Pasiente pasiente1 = new Pasiente();
        System.out.println("Ingrese el nombre del paciente:");
        sNombre = teclado.next();
        pasiente1.setNombre( sNombre );

        System.out.println("Ingrese el nombre el correo del pasiente:");
        sCedula = teclado.next();
        pasiente1.setCorreo( sCedula );

        System.out.println("Ingrese el telefono del pasciente");
        sTelefono = teclado.next();
        pasiente1.setCorreo( sTelefono );

        System.out.println("Ingrese el correo de pasiente");
        sCorreo = teclado.next();
        pasiente1.setCorreo( sCorreo );


        System.out.println("Ingrese el padecimiento del pasiente");
        sPadecimiento = teclado.next();
        pasiente1.setCorreo( sPadecimiento);


    }

    public static String CalcularFecha()
    {

        int mMonth = (int)((Math.random() * 12) + 1);
        int mDay = (int)((Math.random() * 30) + 1);

        String sYear = "2019";
        String sMonth = Integer.toString( mMonth);
        String sDay = Integer.toString(mDay);
        String date = sMonth + "/" + sDay + "/" + sYear;
        return date;
    }
}
