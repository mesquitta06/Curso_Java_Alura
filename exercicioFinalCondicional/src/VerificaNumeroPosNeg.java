import java.util.Scanner;

public class VerificaNumeroPosNeg {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numeroDigitado = leitura.nextInt();

        if(numeroDigitado > 0){
            System.out.println("Numero Positivo");

        }else{
            System.out.println("Numero Negativo");
        }



//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo",
// caso contrário,exiba "Número negativo".


    }
}