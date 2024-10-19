package com.aluracursos.manriqueaudio.modulos;

public class Cancion extends Audio{
    private String autor;
    private String album;
    private String genero;

    @Override
    public int getClasificacion() {
        if(getMeGusta() >= 200){
            return 8;
        }else {
            return 4;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor.getNombreCompleto();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album.getNombre();
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero.getNombre();
    }
}
