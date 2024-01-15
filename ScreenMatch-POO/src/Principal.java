import br.com.alura.screematch.modelos.Filme;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("007 - Contra Golden Eyes");
        meuFilme.setAnoLancamento(2009);
        meuFilme.setDuracaoEmMinutos(183);
        meuFilme.setInclusoNoPlano(true);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.pegaMedia());
    }
}
