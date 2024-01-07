import java.sql.SQLOutput;
import java.util.Scanner;

public class tabiada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Entre com um numero para calculo da tabuada");

        int numero = leitura.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Segue a tabuada do " +(numero*i));

        }
    }
}
