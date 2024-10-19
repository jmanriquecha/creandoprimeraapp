package com.aluracursos.manriqueaudio.main;

import com.aluracursos.manriqueaudio.modulos.*;

public class Main {
    public static void main(String[] args) {
        // Autores
        var jorgeCeledon = new Autor();
        jorgeCeledon.setNombre("Jorge");
        jorgeCeledon.setApellido("Celedon Calderon");

        var espinosaPaz = new Autor();
        espinosaPaz.setNombre("Espinosa");
        espinosaPaz.setApellido("Paz");

        // Generos musicales

        var vallenato = new Genero();
        vallenato.setNombre("Vallenato");

        var popular = new Genero();
        popular.setNombre("Popular");

        // Albumnes
        var album1 = new Album();
        album1.setNombre("Sin medir distancia!");

        // audios
        var queBonitaVida = new Cancion();
        queBonitaVida.setId(1);
        queBonitaVida.setNombre("Que bonita es esta vida");
        queBonitaVida.setAutor(jorgeCeledon);
        queBonitaVida.setGenero(vallenato);
        queBonitaVida.setAlbum(album1);
        queBonitaVida.setDuracion(10);
        queBonitaVida.setClasificacion(3);

        for (int i = 0; i < 100; i++) {
            queBonitaVida.meGusta();
        }

        for (int i = 0; i < 200000; i++) {
            queBonitaVida.repoducir();
        }

        // Imprimir
        System.out.println("Información de la canción");
        System.out.println("ID: " + queBonitaVida.getId());
        System.out.println("Nombre canción: " + queBonitaVida.getNombre());
        System.out.println("Autor: " + queBonitaVida.getAutor());
        System.out.println("Genero: " + queBonitaVida.getGenero());
        System.out.println("Album: " + queBonitaVida.getAlbum());
        System.out.println("Me gusta: " + queBonitaVida.getMeGusta());
        System.out.println("Repoducciones: " + queBonitaVida.getTotalReproducciones());


        // Podcast
        var podcast = new Podcast();
        podcast.setNombre("Lo que callan los famosos");
        podcast.setAutor(espinosaPaz);
        podcast.setDescripcion("Podcast basada en hechos de la farandula criolla");

        for (int i = 0; i < 160; i++) {
            podcast.meGusta();
        }

        for (int i = 0; i < 12000; i++) {
            podcast.repoducir();
        }

        System.out.println();
        System.out.println("Podcast: " + podcast.getNombre());
        System.out.println("Conversador: " + podcast.getAutor());
        System.out.println("Descripción: " + podcast.getDescripcion());
        System.out.println("Me gusta: " + podcast.getMeGusta());
        System.out.println("Repoducciones: " + podcast.getTotalReproducciones());

        // Favoritos
        var favoritos = new Favorito();
        favoritos.agrega(queBonitaVida);
        favoritos.agrega(podcast);

        System.out.println();
    }
}
