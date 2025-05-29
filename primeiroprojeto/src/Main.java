public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Rei leão");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notadoFilme = 8.1f;
        //Media calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Rei leão 
                Filme de aventura sobre o reino de Mufasa.
                Muito bom!
                Ano de lancamento: """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
    }
}