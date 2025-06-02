public class Principal {
    public static void main(String[] args) {
        int quantidadePassos = 500;
        double alturaEmMetros = 1.65;
        String nome = "João";

        if (quantidadePassos < 1000) {
            String sugestao = "Sugiro que você tente aumentar a meta!";
            System.out.println(sugestao);
        }

        //Nao pode usar uma variavel que foi criada dentro do if, fora dela
        sugestao = "Parabens";
    }
}
