package com.mycompany.parkhub;

public class Obstaculo extends Nivel{
    private String tipo;
    private int tamaño;
    private String color;
    private boolean tocado;
    
    public Obstaculo(String tipo, int tamaño, String color, int posObstaculo, int posEstacionamientos) {
        super(posObstaculo, posEstacionamientos);
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.color = color;
        this.tocado = false;
    }
    
    public void setRestarVida(boolean tocado, Jugador jugador) {
    if (tocado) {
        int vidasActuales = jugador.getVidas();
        jugador.setVidas(vidasActuales - 1);
        }
    }
}
