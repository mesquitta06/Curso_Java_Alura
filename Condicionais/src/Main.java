public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean inclusoNoPlano = false;
        double notaFilme = 8.1;
        String tipoPlano= "Padrao";

        if(anoDeLancamento >= 2022){
            System.out.println("lançamento atual");
        } else {
            System.out.println("retro");
        }


        if (inclusoNoPlano == true  && tipoPlano.equals("Plus") ){
            System.out.println("filme liberado");
        }else{
            System.out.println("Filme bloqueado");
        }

        int dia = 5;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("Odia " + dia + " é " + nomeDia);
    }
}