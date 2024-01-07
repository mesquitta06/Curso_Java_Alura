import java.util.Scanner;

public class CalcArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha uma figura para calcular a área: [1] quadrado [2] circulo");

        int opcaoEscolhida = leitura.nextInt();

        if(opcaoEscolhida == 1){
            System.out.println("Opção escolhida: Quadrado");
            System.out.println("Digite o valor do Lado (l):");

            int ladoQuadrado = leitura.nextInt();
            double areaQuadrado = ladoQuadrado *ladoQuadrado;
            System.out.println("A area do quadrado é: " + areaQuadrado);

        }else{
            System.out.println("Opção escolhida: Circulo");
            System.out.println("Digite o valor do raio  (r):");

            int raioCirculo = leitura.nextInt();
            double areaCirculo = 3.14 * (raioCirculo*raioCirculo);
            System.out.println("A area do circulo é: " + areaCirculo);


        }
    }
}
