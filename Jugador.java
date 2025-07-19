package com.mycompany.parkhub;

public class Jugador {
    private int vidas;
    private boolean usuario;

    public Jugador(int vidas, boolean Usuario) {
        this.vidas = vidas;
        this.usuario = usuario;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }   
    
    public void verificarNivel() {
        if (usuario) {
            System.out.println("¡Has ganado el nivel!");
        } else {
            System.out.println("Has perdido el nivel.");
        }
    }
    
    public int getVidas(){
        return vidas;
    }
}
