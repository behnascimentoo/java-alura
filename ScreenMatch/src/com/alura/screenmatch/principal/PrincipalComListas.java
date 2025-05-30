package com.alura.screenmatch.principal;

import com.alura.screenmatch.modelos.Filme;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme f = new Filme("Fuga das galinhas", 2001);
        f.avalia(9);
        Filme outroF = new Filme("Avatar", 2012);
        outroF.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>(); // cria uma lista
        lista.add(filmeDoPaulo);
        lista.add(f);
        lista.add(outroF);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2  ) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }

}
