import java.util.Scanner;
import java.util.Random;
public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int numeroTentativas = 0;

        int numeroDigitado = 0;
        System.out.println("Jogo de adivinhação, tente advinhar um numero aleatorio entre 1 e 100!");
        System.out.println("Qual numero voce acha que é? ");


        while (numeroTentativas <= 4) {
            numeroDigitado = leitura.nextInt();

            if (numeroAleatorio == numeroDigitado) {
                System.out.println("Numero correto!");
            } else {
                System.out.println("numero errado!");
                numeroTentativas ++;
                if(numeroTentativas >4){
                    System.out.println("Voce ultrapassou " +numeroTentativas+" tentativas, o numero correto é:" + numeroAleatorio);
                }
            }

        }

        
    }
}
