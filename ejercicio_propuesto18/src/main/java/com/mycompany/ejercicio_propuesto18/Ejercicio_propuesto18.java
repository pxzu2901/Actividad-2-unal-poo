/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto18;

import java.util.Scanner;
public class Ejercicio_propuesto18 {

    public static void main(String[] args) {
        int nhoras_mes;
        String nombre, codigo;
        float vhora, porc_retefuente, salario_bruto, salario_neto, retencion;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite el codigo del trabajador: ");
        codigo=entrada.next();
        
        System.out.print("Digite el nombre del trabajador: ");
        nombre=entrada.next();
        
        System.out.print("Digite el numero de horas que laboro el trabajador "+ nombre +" : ");
        nhoras_mes=entrada.nextInt();
        
        System.out.print("Digite cual es el valor de cada hora laborada: ");
        vhora=entrada.nextFloat();
        
        System.out.print("Digite el porcentaje de la retencion de fuente: ");
        porc_retefuente=entrada.nextFloat();
        
        salario_bruto=nhoras_mes*vhora;
        retencion=salario_bruto*(porc_retefuente/100);
        salario_neto=salario_bruto-retencion;
        
        System.out.println("El trabajador "+nombre+" con codigo "+codigo);
        System.out.println("Tiene un salario bruto de: "+salario_bruto+"$");
        System.out.println("y quedo con un salario bruto de: "+salario_neto+"$");
    }
}
