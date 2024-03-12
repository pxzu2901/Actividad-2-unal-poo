/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();
        
        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        
        double perimetro = triangulo.calcularPerimetro();
        double altura = triangulo.calcularAltura();
        double area = triangulo.calcularArea();

        
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Asrea del triángulo: " + area);

        scanner.close();
    }
}
