package ArrayTridimensional;

import java.util.Scanner;

public class Tridimensional {
    public static void main(String[] args)
    {
        int opcion = 1;
        Scanner teclado = new Scanner(System.in);
        cTiquete Datos[][][] = new cTiquete[20][10][5];

        while (opcion != 0)
        {
            System.out.print("1. Vender");
            System.out.print("2. Devolver");
            System.out.print("3. Consultar");
            System.out.print("4. Limpiar");

            opcion = teclado.nextInt();

            switch (opcion)
            {
                case 1:
                    Datos = venderTiquete(Datos);
            }
        }
    }

    public static cTiquete[][][] venderTiquete(cTiquete lDatos[][][])
    {
        cCliente nuevoCliente = new cCliente();
        cTiquete nuevoTiquete = new cTiquete();

        Scanner teclado = new Scanner(System.in);
        int Asiento;
        int Fila;
        int Sala;

        System.out.print("Nombre del cliente");
        nuevoCliente.Nombre = teclado.next();
        nuevoTiquete.Cliente = nuevoCliente;

        System.out.print("Ingrese el asciento");
        Asiento = teclado.nextInt();

        System.out.print("Ingrese la Fila");
        Fila = teclado.nextInt();

        System.out.print("Ingrese la sala");
        Sala = teclado.nextInt();


        lDatos[Asiento][Fila][Sala] = nuevoTiquete;

        return lDatos;
    }
}
