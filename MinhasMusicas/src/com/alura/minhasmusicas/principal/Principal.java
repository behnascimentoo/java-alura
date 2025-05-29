package com.alura.minhasmusicas.principal;

import com.alura.minhasmusicas.modelos.MinhasPreferidas;
import com.alura.minhasmusicas.modelos.Musica;
import com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica music = new Musica();
        music.setTitulo("Nokia");
        music.setCantor("Drake");

        for (int i = 0; i < 1000; i++) {
            music.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            music.curte();
        }

        Podcast pod = new Podcast();
        pod.setTitulo("Ingles no ouvido");
        pod.setApresentador("Blue ingles");

        for (int i = 0; i < 5000; i++) {
            pod.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            pod.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(pod);
        preferidas.inclui(music);
    }
}
