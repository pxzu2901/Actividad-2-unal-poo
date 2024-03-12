package com.mycompany.ejercicio11resuelto;
import java.util.Scanner;

public class Ejercicio11Resuelto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el primer número: ");
        int N1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int N2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int N3 = scanner.nextInt();

       
        int mayor = MayorDe3.encontrarMayor(N1, N2, N3);

       
        System.out.println("El valor mayor entre " + N1 + ", " + N2 + " y " + N3 + " es: " + mayor);

        scanner.close();
    }
}
