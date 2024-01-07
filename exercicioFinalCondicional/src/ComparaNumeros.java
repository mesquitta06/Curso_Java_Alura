import java.util.Scanner;

//Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem
// indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um numero:");
        int primeiroNumero = leitura.nextInt();

        System.out.println("digite outro numero:");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero==segundoNumero ){
            System.out.println(primeiroNumero +" e " +segundoNumero + " são iguais." );

        }else{
            System.out.println("Sao numeros diferentes.");
        };


        if(primeiroNumero> segundoNumero){
            System.out.println("O primeiro numero é maior que o segundo");
        }
        else{
            System.out.println("O segundo numero é maior que o primeiro");
        }
    }
}
