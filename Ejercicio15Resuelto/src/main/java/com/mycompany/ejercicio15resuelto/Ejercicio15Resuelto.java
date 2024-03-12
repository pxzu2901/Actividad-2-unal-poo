package com.mycompany.ejercicio15resuelto;

import java.util.Scanner;

public class Ejercicio15Resuelto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la Esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la Esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la Esfera C: ");
        double pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de la Esfera D: ");
        double pesoD = scanner.nextDouble();

        Esferas esferas = new Esferas(pesoA, pesoB, pesoC, pesoD);
        String resultado = esferas.hallarMayor();
        System.out.println(resultado);

        scanner.close();
    }
}
