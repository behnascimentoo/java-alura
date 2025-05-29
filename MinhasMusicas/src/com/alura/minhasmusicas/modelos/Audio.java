package com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCutidas;
    private int classificacao;

    //Metodos
    public void curte() {
        this.totalCutidas++;
    }
    public void reproduz() {
        this.totalReproducoes++;
    }

    //Metodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCutidas() {
        return totalCutidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
