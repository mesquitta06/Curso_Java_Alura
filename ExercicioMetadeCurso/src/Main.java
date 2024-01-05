public class Main {
    public static void main(String[] args) {


        //exericio 1: Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1= 7.3;
        double nota2 = 8.9;

        double media = (nota1 +nota2)/2;

        System.out.println(" a media é: " + media);

//exercicio 2: Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.

        double variavel1 = 7.87;
        int varConvertida = (int) (variavel1);

        System.out.println( varConvertida);


//exercicio3:Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.

    char letra = 872;
    String palavra = "teste";

        System.out.println( "a palavra armazenada na variavel string foi: " + palavra + " e na variavel char foi: " + letra);


//Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de
// 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double cotacaoDolar = 4.94;
        double valorEmDolares = 10;
        double valorEmReais = 150;

        double valorConvertido = (int)(valorEmReais * cotacaoDolar);

        System.out.println("O valor de conversão de R$ " + valorEmReais +"  reais ,em dolares é igual a: $ " + valorConvertido +"doláres americanos");

//Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 722;
        double percentualDesconto = 0.1;

        double valorDesconto = precoOriginal * percentualDesconto;

        double valorFinal = (int)(precoOriginal - valorDesconto);

        System.out.println("O valor de desconto para um produto de: "+ precoOriginal +"é igual a: " +valorDesconto + " reais. Logo, o valor final é:" +valorFinal );

        
    }
}