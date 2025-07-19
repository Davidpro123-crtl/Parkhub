package com.mycompany.parkhub;

public class estiloVehiculo extends Vehiculo {

    private String estilo; 

    public estiloVehiculo(String tipo, String color, int tamaño, String orientacion, boolean moviendose, String estilo) {
        super(tipo, color, tamaño, orientacion, moviendose); 
        this.estilo = estilo; 
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}

