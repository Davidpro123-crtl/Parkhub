package com.mycompany.parkhub;

public class Estacionamiento extends Nivel{
    private int tamaño;
    private int posicion;
    private boolean estacionado;

    public Estacionamiento(int tamaño, int posicion, boolean estacionado, int posObstaculo, int posEstacionamientos) {
        super(posObstaculo, posEstacionamientos);
        this.tamaño = tamaño;
        this.posicion = posicion;
        this.estacionado = estacionado;
    }
}
