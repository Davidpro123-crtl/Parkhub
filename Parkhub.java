package com.mycompany.parkhub;

public class Parkhub {

    public static void main(String[] args) {
        Parkhub sistema = new Parkhub();
        sistema.abrir();
        sistema.cerrar();
        
    }

    public void abrir() {
        System.out.println("Sistema Parkhub abierto.");
    }

    public void cerrar() {
        System.out.println("Sistema Parkhub cerrado.");
    }
}