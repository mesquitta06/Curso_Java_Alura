import java.util.Scanner;
import br.com.estudos.aplicacaoBancaria.ContaBancaria;
public class Main {

    public static void main(String[] args) {
    Scanner Leitura = new Scanner(System.in);
    ContaBancaria contaItau = new ContaBancaria();


        System.out.println("Digite a opção desejada:  ");
        System.out.println("[1]Deposito");
        System.out.println("[2]Saque");
        System.out.println("[3]Saldo");
        System.out.println("[4] Informaçoes Conta");
        System.out.println("[5]Sair");

        contaItau.setSaldo(500);

        int opcao = Leitura.nextInt();



        if (opcao == 1){
            System.out.println("Digite o valor do deposito: ");
            contaItau.setSaldo(Leitura.nextInt());
            System.out.println(" Seu depósito de "
                    + contaItau.getSaldo()+
                    " foi realizado com sucesso! Seu saldo é:"+ contaItau.getSaldo());
        }if (opcao==2){

        }if (opcao==3){
            System.out.println("Seu saldo é: " + contaItau.getSaldo());
        }
    }
}