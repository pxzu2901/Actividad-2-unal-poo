package com.mycompany.ejercicio21;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    // Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
    // Método para calcular el semiperímetro
    public double calcularSemiperimetro() {
        return calcularPerimetro() / 2;
    }
    
    // Método para calcular el área utilizando la fórmula de Herón
    public double calcularArea() {
        double s = calcularSemiperimetro();
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
