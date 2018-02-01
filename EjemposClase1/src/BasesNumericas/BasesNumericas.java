package BasesNumericas;
import java.util.Scanner;
public class BasesNumericas {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            cBases base = new cBases();
            int numero = 0;

            System.out.print("Digite un número en base decimal: ");
            numero = teclado.nextInt();
            System.out.println("El número en binario es: " + base.Binario(numero));
            System.out.println("El número en octal es: " + base.Octal(numero));
            System.out.println("El número en hexadecimal es: " + base.Hexadecimal(numero));
        }
}
