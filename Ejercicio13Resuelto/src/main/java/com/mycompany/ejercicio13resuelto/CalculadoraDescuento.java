package com.mycompany.ejercicio13resuelto;

public class CalculadoraDescuento {
    // Método estático para calcular el descuento según el color de la bolita
    public static double calcularDescuento(String color, double valorCompra) {
        double porcentajeDescuento;
        porcentajeDescuento = switch (color.toUpperCase()) {
            case "BLANCO" -> 0;
            case "VERDE" -> 10;
            case "AMARILLO" -> 25;
            case "AZUL" -> 50;
            default -> 100;
        };
        return porcentajeDescuento * valorCompra / 100;
    }
}
