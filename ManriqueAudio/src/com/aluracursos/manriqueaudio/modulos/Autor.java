package com.aluracursos.manriqueaudio.modulos;

public class Autor {
    private String nombre;
    private String apellido;

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getNombreCompleto(){
        return this.nombre.concat(" ").concat(this.apellido);
    }
}
