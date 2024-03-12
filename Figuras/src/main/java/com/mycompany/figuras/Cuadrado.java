package com.mycompany.figuras;

public class Cuadrado {
    public double lado; 

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro() {
        return (4 * lado);
    }  
}
