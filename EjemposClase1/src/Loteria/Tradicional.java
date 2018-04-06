package Loteria;


public class Tradicional {

    public int numero;
    public int serie;

    public String numString;

    public void GenerarNumeroSerie()
    {
        numero      = (int)(Math.random() * 99);
        numString   = Integer.toString(numero);
        if (numString.length() == 2) {
            numString = "0" + numString;
        }

        System.out.println(numString);

    }



}
