package com.mycompany.ejerciciopropuesto23;

import java.util.Scanner;

public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario los valores de A, B y C
        System.out.println("Ingrese el valor de A:");
        double a = scanner.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double b = scanner.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double c = scanner.nextDouble();
        
        // Crear un objeto de la clase Ecuacion
        Ecuacion ecuacion = new Ecuacion(a, b, c);
        
        // Calcular y mostrar las soluciones
        ecuacion.calcularSoluciones();
        
        scanner.close();
    }
}
