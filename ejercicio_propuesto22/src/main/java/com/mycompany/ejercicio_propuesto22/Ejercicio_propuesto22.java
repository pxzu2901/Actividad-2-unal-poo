/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto22;
import java.util.Scanner;
public class Ejercicio_propuesto22 {

    public static void main(String[] args) {
        String nombre;
        int horas_trabajadas;
        double valor_hora, salario;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Cual es el nombre del empleado: ");
        nombre=entrada.next();
        System.out.println("cual es el valor de cada hora trabajada: ");
        valor_hora=entrada.nextDouble();
        System.out.println("cuantas horas laboro el trabajador en el mes: ");
        horas_trabajadas=entrada.nextInt();
        //terminamos de pedir los datos del trabajador
        salario=valor_hora*horas_trabajadas;
        if (salario>450000){
        System.out.println(nombre+" tuvo un salario de: "+salario+"$");
        }else{
        System.out.println(nombre+" no obtuvo un salario mayor a 450.000$");
        }
        
    }
}
