import com.alura.screenmatch.calculos.CalculadoraDeTempo;
import com.alura.screenmatch.calculos.FiltroRecomendacao;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Filme;
import com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme f = new Filme();
        f.setNome("Fuga das galinhas");
        f.setAnoDeLancamento(2001);
        f.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + f.getDuracaoEmMinutos());

        f.exibeFichaTecnica();
        f.avalia(8);
        f.avalia(5);
        f.avalia(10);
        System.out.println("Total de avaliações: " + f.getTotalDeAvaliacoes());
        System.out.println(f.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroF = new Filme();
        outroF.setNome("Avatar");
        outroF.setAnoDeLancamento(2012);
        outroF.setDuracaoEmMinutos(100);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(f);
        calculadora.inclui(outroF);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(f);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setNome("Lost");
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

    }
}
