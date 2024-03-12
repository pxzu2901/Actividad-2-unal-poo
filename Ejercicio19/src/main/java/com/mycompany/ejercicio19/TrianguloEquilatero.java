package com.mycompany.ejercicio19;

public class TrianguloEquilatero {
    private double lado;


    TrianguloEquilatero(double lado){
        this.lado=lado;
    }
        // Método para calcular el perímetro
        public double calcularPerimetro() {
            return lado * 3;
        }
    
        // Método para calcular la altura
    public double calcularAltura() {
        return lado * Math.sqrt(3) / 2;
    }
    
    // Método para calcular el área
    public double calcularArea() {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }

}
