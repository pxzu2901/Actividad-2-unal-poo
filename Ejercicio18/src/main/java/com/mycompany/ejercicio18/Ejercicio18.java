package com.mycompany.ejercicio18;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese los datos para el empleado 2:");
        System.out.print("Código del empleado: ");
        int codigoEmpleado2 = scanner.nextInt();

        
        System.out.print("Nombre del empleado: ");
        String nombreEmpleado2 = scanner.nextLine();
        
        System.out.print("Horas trabajadas del empleado: ");
        double horaTrabajadas = scanner.nextDouble();
        
        System.out.print("Valor de horas trabajadas del empleado: ");
        double Valor_horas_Trabajadas = scanner.nextDouble();
        
        System.out.print("Porcentaje de retención del empleado: ");
        double porcentaje_retencion = scanner.nextDouble();
        
        Empleado empleado2 = new Empleado(codigoEmpleado2, nombreEmpleado2, horaTrabajadas, Valor_horas_Trabajadas, porcentaje_retencion);

        System.out.println("\nInformación del empleado 2:");
        empleado2.imprimirInformacion();

        scanner.close();
    }
}
