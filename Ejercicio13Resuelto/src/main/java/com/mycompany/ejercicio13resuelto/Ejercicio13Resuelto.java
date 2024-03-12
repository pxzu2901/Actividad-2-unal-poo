package com.mycompany.ejercicio13resuelto;
import java.util.Scanner;

public class Ejercicio13Resuelto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de la compra y el color de la bolita
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL): ");
        String color = scanner.next();

        // Calcular el descuento utilizando la clase CalculadoraDescuento
        double descuento = CalculadoraDescuento.calcularDescuento(color, valorCompra);

        // Calcular el valor a pagar después del descuento
        double valorPagar = valorCompra - descuento;

        // Mostrar el valor a pagar
        System.out.println("El cliente debe pagar: $" + valorPagar);

        scanner.close();
    }
}
