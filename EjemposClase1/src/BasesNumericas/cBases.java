package BasesNumericas;

public class cBases {

    public String Binario(int valor)
    {
        String binary="";
        while(valor>0)
        {
            binary  = ( valor % 2)+binary;
            valor   = valor / 2;

        }
        return binary;
    }

    public String Octal(int valor) {

        String result = "";
        while(valor> 0)
        {
            result = (valor % 8) + result;
            valor /= 8;
        }
        return result;
    }

    public String Hexadecimal(int valor) {
        String hex = "";

        while (valor != 0)
        {
            if (valor % 16 < 10)
            {
                hex = Integer.toString(valor % 16) + hex;
            }

            else
            {
                hex = (char)((valor % 16)+55) + hex;
            }

            valor = valor / 16;
        }

        return hex;
    }
}