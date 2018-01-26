package Matricula;

public class Alumnos {
    public int id = 0;
    public String nombre = "";
    public String correo = "";
    public String telefono = "";
    private double saldo = 0;

    public void  Agregar(int vid, String vnombre, String vcorreo, String vtelefono)
    {
        System.out.println("Agregado");

    }

    public void Modificar(int vid)
    {
        System.out.println("Modificacion");
    }

    public void Eliminar(int vid)
    {
        System.out.println("Eliminar estudiante");
    }

    public double ConsultarSaldo(int vid)
    {
        return 23000;
    }
}
