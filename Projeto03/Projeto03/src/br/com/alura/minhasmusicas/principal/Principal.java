package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();

        }
        Podcast meuPodcat = new Podcast();
        meuPodcat.setTitulo("BolhaDev");
        meuPodcat.setApresentador("Marcus");

        for (int i = 0; i < 5000; i++) {
            meuPodcat.reproduz();

        }
        for (int i = 0; i < 1000; i++) {
            meuPodcat.curte();

        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcat);
        preferidas.inclui(minhaMusica);

    }
}
