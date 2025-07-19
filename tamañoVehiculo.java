package com.mycompany.parkhub;

public class tamañoVehiculo extends Vehiculo{
    private int alto;
    private int ancho;
    private String orientacion;

    public tamañoVehiculo(String tipo, String color, int tamaño, String orientacion, boolean moviendose) {
        super(tipo, color, tamaño, orientacion, moviendose);
    }
    
    public void cambiarTamaño(double nuevoAlto, double nuevoAncho, String nuevaOrientacion) {
        this.alto = alto;
        this.ancho = ancho;
        this.orientacion = nuevaOrientacion;
    }

    public void mostrarTamaño() {
        System.out.println("Alto: " + alto);
        System.out.println("Ancho: " + ancho);
        System.out.println("Orientación: " + orientacion);
    }
}
