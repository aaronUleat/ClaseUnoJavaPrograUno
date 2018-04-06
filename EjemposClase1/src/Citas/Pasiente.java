package Citas;

public class Pasiente {


    public String nombre = "";
    private String cedula = "";
    private String telefono = "";
    private String correo = "";
    private String padecimiento = "";

    public Pasiente(){}

    public Pasiente(String nNombre, String nCedula, String nTelefono, String nCorreo, String nPadecimiento)
    {
        nombre = nNombre;
        cedula = nCedula;
        telefono = nTelefono;
        correo = nCorreo;
        padecimiento = nPadecimiento;

    }


    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setNombre(String nombre) {

        if( nombre == "")
        {
            System.out.println("El nombre no debe ser vacio");
        }
        else
        {
            this.nombre = nombre;
        }

    }

    public void setCedula(String cedula) {

        if(cedula == "")
        {
            System.out.println("El numero de cedular no puede estar vacio");
        }
        else
        {
            this.cedula = cedula;
        }

    }

    public void setTelefono(String telefono) {
        if(telefono.length() != 8)
        {
            System.out.println("El telefono tiene que tener al menos 8 Caracteres");
        }
        else
        {
            this.telefono = telefono;
        }
    }

    public void setCorreo(String correo) {

        if(correo.indexOf("@") == - 1 || correo.indexOf(".") == -1 )
        {
            System.out.println("El correo debe contener al menos un arroba o un punto");
        }
        else
        {
            this.correo = correo;
        }

    }

    public void setPadecimiento(String padecimiento) {

        if( padecimiento.length() < 40 )
        {
            System.out.println("Usted debe ingresar al menos 40 caracteres");
        }
        else
        {
            this.padecimiento = padecimiento;
        }

    }
}
