package br.com.alura.screematch.modelos;

public class Filme {

    //Declaração de variáveis.
    private String nome;
    private int anoLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    double mediaAvaliacoes;
    private int totalAvaliacoes;
    private int getTotalAvaliacoes;
    private int duracaoEmMinutos;



    //Métodos para acessar os dados
    public void exibeFichaTecnica (){
        System.out.println("O nome do filme é: "+nome);
        System.out.println("A data de lançamento é: "+anoLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }

    public double pegaMedia(){
        return mediaAvaliacoes= (somaDasAvaliacoes/totalAvaliacoes);
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }


    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getGetTotalAvaliacoes() {
        return getTotalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
