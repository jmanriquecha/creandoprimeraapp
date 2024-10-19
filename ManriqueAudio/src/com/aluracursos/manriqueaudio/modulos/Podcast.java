package com.aluracursos.manriqueaudio.modulos;

public class Podcast extends Audio {
    private String autor;
    private String descripcion;

    @Override
    public int getClasificacion() {
        if(getTotalReproducciones() >= 2000){
            return 9;
        }else {
            return 2;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor.getNombreCompleto();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
