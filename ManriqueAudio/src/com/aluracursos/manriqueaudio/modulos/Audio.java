package com.aluracursos.manriqueaudio.modulos;

public class Audio {
    private int id;
    private String nombre;
    private int duracion;
    private int meGusta;
    private int totalReproducciones;
    private int clasificacion;

    public void repoducir(){
        this.totalReproducciones++;
    }

    public void meGusta(){
        this.meGusta++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMeGusta() {
        return meGusta;
    }
    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
