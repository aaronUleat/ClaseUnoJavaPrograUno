package Encapsulacion;

public class cProfesor {
    private String nombre = "";
    private String telefono = "";
    private String correo = "";
    private String clave = "";


    // Metodo constructor
    public cProfesor()
    {

    }

    public cProfesor(String miNombre, String miCorreo, String miTelefono)
    {
        nombre = miNombre;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre()
    {
        return nombre;
    }
    // Todos lo setters van como voids

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public double CalcularSalario()
    {
        return 0;
    }

    public double CalcularSalario(String mNombre)
    {
        return 0;
    }



}

