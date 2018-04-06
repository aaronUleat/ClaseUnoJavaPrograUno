package Bingo;

public class cBingo {

    int numeros[] = new int[25];

    public cBingo()
    {
        for (int i = 0; i < 25; i++) {
            numeros[i] = 0;
        }
    }

    public String GenerarNumero()
    {
        int Columna         = 0;
        int Numero          = 0;
        String Letra        = "";

        Columna             = (int)(Math.random() * 5) + 1;

        switch (Columna)
        {
            case 1:
                Letra       = "B";
                Numero      = (int)(Math.random() * 15) + 1;
                break;

            case 2:
                Letra       = "I";
                Numero      = (int)(Math.random() * 15) + 16;
                break;

            case 3:
                Letra       = "N";
                Numero      = (int)(Math.random() * 15) + 31;
                break;

            case 4:
                Letra       = "G";
                Numero      = (int)(Math.random() * 15) + 46;
                break;

            case 5:
                Letra       = "O";
                Numero      = (int)(Math.random() * 15) + 60;
                break;
        }

        return Letra + Numero;
    }

    public void GenerarCarton()
    {
        String Cadena       = "B I N G O";
        String Letra        = "";
        int Numero          = 0;
        int Columna         = 0;

        System.out.println("");
        System.out.println("");
        System.out.println(Cadena);

        for (int i = 1; i <= 5; i++) {
            Cadena      = "";
            Columna     = (int)(Math.random() * 15 + 1);
            Cadena      = Formatear(Integer.toString(Columna), 4);

            Columna     = (int)(Math.random() * 15) + 16;
            Cadena      = Cadena + Formatear(Integer.toString(Columna), 4);

            Columna     = (int)(Math.random() * 15) + 31;

            if (i == 3) {
                Cadena      = Cadena  + "   ";
            } else {
                Cadena      = Cadena  + Formatear(Integer.toString(Columna), 4);
            }

            Columna      = (int)(Math.random() * 15) + 46;
            Cadena       = Cadena + Formatear(Integer.toString(Columna), 4);

            Columna      = (int)(Math.random() * 15) + 60;
            Cadena       = Cadena + Formatear(Integer.toString(Columna), 4);
            System.out.println(Cadena);

        }
        System.out.println("");
        System.out.println("");
    }

    public String Formatear(String Cadena, int largo)
    {
        int Falta       = (largo - Cadena.length());

        if (Falta > 0) {
            for (int i = 1; i <= Falta; i++) {
                Cadena = Cadena + " ";
            }
        }
        return Cadena;
    }

}
