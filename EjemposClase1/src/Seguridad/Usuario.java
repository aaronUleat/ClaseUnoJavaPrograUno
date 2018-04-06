package Seguridad;

public class Usuario {

    private String nombre = "";
    private String id = "";
    private String clave = "";
    private int token = 0;
    private String correo = "";

    public Usuario(){}

    public Usuario(String nNombre, String nId, String nClave, int nToken, String nCorreo)
    {
        nombre = nNombre;
        id = nId;
        clave = nClave;
        token = nToken;
        correo = nCorreo;

    }


    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        if(nombre == "")
        {
            System.out.println("El nombre no puede ir vacio");
        }
        else
        {
            this.nombre = nombre;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        if (id == "")
        {
            System.out.println("El id no puede ir vacio");
        }
        else
        {
            this.id = id;
        }
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        System.out.println(correo.indexOf("c"));
        System.out.println(correo.length());

        if( correo.charAt(0) == '@' )
        {
            System.out.println("El primer character no puede ser un arroba");
        }
        else if(correo.length() <= 8 )
        {
            System.out.println("El correo tiene que contener al menos 8 caracteres");
        }




    }

    public void validateCorreo(String nCorreo) {


    }
}
