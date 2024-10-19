package com.aluracursos.screenmatch.modulos;

public class Serie extends Pelicula {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return this.temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionMinutos(){
        return  this.temporadas * this.minutosPorEpisodio * this.episodiosPorTemporada;
    }
}
