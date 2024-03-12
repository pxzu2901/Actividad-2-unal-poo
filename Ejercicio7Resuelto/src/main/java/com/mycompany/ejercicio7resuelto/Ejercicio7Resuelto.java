/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7resuelto;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Ejercicio7Resuelto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los valores de A y B
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        // Crear una instancia de ComparadorNumeros
        ComparadorNumeros comparador = new ComparadorNumeros(A, B);

        // Obtener y mostrar el mensaje de comparación
        String mensaje = comparador.compararNumeros();
        System.out.println(mensaje);

        scanner.close();
    }
}