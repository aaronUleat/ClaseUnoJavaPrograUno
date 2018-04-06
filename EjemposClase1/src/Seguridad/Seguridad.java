package Seguridad;

import java.util.Scanner;

public class Seguridad {
    public static void main(String[] args)
    {
        String ingCorreo;
        Scanner entrada = new Scanner(System.in);

        Usuario usuario = new Usuario();
        System.out.println("Ingrese un correo:");
        ingCorreo = entrada.next();

        usuario.setCorreo( ingCorreo);

    }

}
