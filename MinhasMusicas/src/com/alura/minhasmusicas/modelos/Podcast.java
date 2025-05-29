package com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    //Metodos Especiais
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Metodos


    @Override
    public int getClassificacao() {
        if (this.getTotalCutidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
