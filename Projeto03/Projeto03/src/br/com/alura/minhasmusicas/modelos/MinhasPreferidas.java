package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void  inclui(Audio audio ){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + "sucesso garantido e favorito por todos");
        } else {
            System.out.println(audio.getTitulo() + "Geral curte pore nada demais");
        }
    }
}
