package com.alura.screenmatch.principal;

import com.alura.screenmatch.calculos.CalculadoraDeTempo;
import com.alura.screenmatch.calculos.FiltroRecomendacao;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Filme;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme f = new Filme("Fuga das galinhas", 2001);
        f.setDuracaoEmMinutos(200);
        System.out.println("Duração do filme: " + f.getDuracaoEmMinutos());

        f.exibeFichaTecnica();
        f.avalia(8);
        f.avalia(5);
        f.avalia(10);
        System.out.println("Total de avaliações: " + f.getTotalDeAvaliacoes());
        System.out.println(f.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Filme outroF = new Filme("Avatar", 2012);
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

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); // cria uma lista
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(f);
        listaDeFilmes.add(outroF);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("To string do filme: " + listaDeFilmes.get(0).toString());


    }
}
