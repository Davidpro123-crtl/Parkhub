package com.mycompany.parkhub;

public class Vehiculo {
    private String tipo;
    private String color;
    private int tamaño;
    private String orientacion;
    private boolean moviendose;

    public Vehiculo(String tipo, String color, int tamaño, String orientacion, boolean moviendose) {
        this.tipo = tipo;
        this.color = color;
        this.tamaño = tamaño;
        this.orientacion = orientacion;
        this.moviendose = moviendose;
    }
}

