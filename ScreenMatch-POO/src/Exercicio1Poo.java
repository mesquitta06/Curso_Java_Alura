public class Exercicio1Poo {

    String nome;
    double preco;
    double descontoPix;

    boolean pagamentoNoPix;

    void caculaPreçoFinal(){
        if(pagamentoNoPix == true){
            double precofinal = preco - descontoPix;

        }else{
            double precofinal = preco;
        }

    }
}
