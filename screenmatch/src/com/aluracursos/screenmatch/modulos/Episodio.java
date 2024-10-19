package com.aluracursos.screenmatch.modulos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizaciones;

    public int getTotalVisualizaciones() {
        return this.totalVisualizaciones;
    }

    public void setTotalVisualizaciones(int totalVisualizaciones) {
        this.totalVisualizaciones = totalVisualizaciones;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return this.serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion(){
        return this.totalVisualizaciones > 100 ? 4 : 2;
    }
}
