package com.aluracursos.manriqueaudio.modulos;

public class Favorito {
    public void agrega(Audio audio){
        if(audio.getClasificacion() >= 7){
            System.out.println(audio.getNombre() + " es tendencia total en el momento!");
        }else{
            System.out.println(audio.getNombre() + " se esta consolidando como favorito!");
        }
    }
}
