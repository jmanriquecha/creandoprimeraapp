package com.aluracursos.screenmatch.modulos;

public class Titulo {
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean hasPlan;
    private double sumaCalificaciones;
    private int totalCalificaciones;

    public void muestraFichaTecnica(){
        var detalle = """
                Nombre: %s
                Fecha de lanzamiento: %d
                Duración: %d minutos
                Incluida en el plan: %s
                """.formatted(this.nombre, this.fechaLanzamiento, this.getDuracionMinutos(), this.hasPlan ? "Sí" : "No");
        System.out.print(detalle);
    }

    public void evalua(double calificacion){
        this.sumaCalificaciones += calificacion;
        this.totalCalificaciones++;
    }

    public double calculaMedia(){
        return this.sumaCalificaciones / this.totalCalificaciones;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaLanzamiento() {
        return this.fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return this.duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public boolean isHasPlan() {
        return this.hasPlan;
    }

    public void setHasPlan(boolean hasPlan) {
        this.hasPlan = hasPlan;
    }

    public int getTotalCalificaciones(){
        return this.totalCalificaciones;
    }
}
