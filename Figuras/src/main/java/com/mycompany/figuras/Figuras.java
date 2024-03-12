package com.mycompany.figuras;

import java.util.Scanner;

public class Figuras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto Círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        Circulo figura1 = new Circulo(radioCirculo);

        // Crear objeto Rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);

        // Crear objeto Cuadrado
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);

        // Crear objeto TriánguloRectángulo
        System.out.print("Ingrese la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);

        // Mostrar resultados
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        // Cerrar el Scanner
        scanner.close();
    }
}
