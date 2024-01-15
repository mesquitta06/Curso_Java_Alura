//Crie uma classe idadePessoa com os atributos privados nome e idade.
// Utilize métodos getters e setters para acessar e modificar esses atributos.
// Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

package br.com.estudos.pessoa;

public class IdadePessoa {
    //Decalaração de variáveis
    private String nome;
    private int idade;
    //Fim declaracao de Variaveis

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
