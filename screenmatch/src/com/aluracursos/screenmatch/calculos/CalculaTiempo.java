package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modulos.Titulo;

public class CalculaTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return this.tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionMinutos();
    }

}
