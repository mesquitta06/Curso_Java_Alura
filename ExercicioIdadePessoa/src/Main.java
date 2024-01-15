import br.com.estudos.pessoa.IdadePessoa;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    IdadePessoa pessoa1 = new IdadePessoa();

        System.out.println("Digite o nome da pessoa");
        pessoa1.setNome(leitura.next());
        System.out.println("Digite a idade da pessoa");
        pessoa1.setIdade(leitura.nextInt());

        if(pessoa1.getIdade()>= 18){
            System.out.println("O nome da pessoa é: "+pessoa1.getNome()+
                    " e essa pesosa é maior de idade com " + pessoa1.getIdade() + " anos");

        }else{
            System.out.println("O nome da pessoa é: "+pessoa1.getNome()+
                    " e essa pesosa é menor de idade com " + pessoa1.getIdade() + " anos");

        }

    }
}