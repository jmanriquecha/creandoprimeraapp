package com.aluracursos.screenmatch.modulos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public void setDirector(String director){
        this.director = director;
    }

    public String getDirector(){
        return this.director;
    }

    @Override
    public int getClasificacion(){
        return (int)calculaMedia() / 2;
    }
}
