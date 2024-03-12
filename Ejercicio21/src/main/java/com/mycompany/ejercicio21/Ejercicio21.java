package com.mycompany.ejercicio21;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese lado 1: ");
        double lado1 = scanner.nextDouble();     
        System.out.println("Ingrese lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese lado 3: ");
        double lado3 = scanner.nextDouble();
        
        // Crear una instancia de la clase Triangulo
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        // Calcular el perímetro, el semiperímetro y el área del triángulo
        double perimetro = triangulo.calcularPerimetro();
        double semiperimetro = triangulo.calcularSemiperimetro();
        double area = triangulo.calcularArea();
        
        // Mostrar los resultados
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Semiperímetro del triángulo: " + semiperimetro);
        System.out.println("Area del triángulo: " + area);
        
        scanner.close();
    }
}
