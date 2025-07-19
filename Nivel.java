package com.mycompany.parkhub;

public class Nivel{
    public int posObstaculo;
    public int posEstacionamientos;

    public Nivel(int posObstaculo, int posEstacionamientos) {
        this.posObstaculo = posObstaculo;
        this.posEstacionamientos = posEstacionamientos;
    }
    
    public void Iniciar(){
        System.out.println("El nivel ha iniciado");
    }
    
    public void Finalizar(){
        System.out.println("El nivel ha finalizado");
    }
}
