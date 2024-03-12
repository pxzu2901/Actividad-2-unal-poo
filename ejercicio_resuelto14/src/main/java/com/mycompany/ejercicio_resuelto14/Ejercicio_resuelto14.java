/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto14;

import java.util.Scanner;

public class Ejercicio_resuelto14 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double ventas_dept1, ventas_dept2, ventas_dept3,salario_vendedores;
        double salario_dept1, salario_dept2, salario_dept3;
        double suma_ventas;
        System.out.println("¿Cuales fueron las ventas totales del departamento de ventas numero 1: ");
        ventas_dept1=entrada.nextDouble();
        System.out.println("¿Cuales fueron las ventas totales del departamento de ventas numero 2: ");
        ventas_dept2=entrada.nextDouble();
        System.out.println("¿Cuales fueron las ventas totales del departamento de ventas numero 3: ");
        ventas_dept3=entrada.nextDouble();
        //Aca terminamos de pedir el valor de las ventas de los departamentos
        //a continuacion pedimos el sueldo de los vendedores 
        System.out.println("Salario de los vendedores: ");
        salario_vendedores=entrada.nextDouble();
        salario_dept1=salario_vendedores;
        salario_dept2=salario_vendedores;
        salario_dept3=salario_vendedores;
        //igualamos el salario de cada departamento al que nos dio el usuario
        suma_ventas=ventas_dept1+ventas_dept2+ventas_dept3;
        //hacemos el promedio de las ventas
        
        if (((ventas_dept1*100)/suma_ventas) >33){
            salario_dept1+=(salario_dept1*0.2);
            System.out.println("El salario de los vendedores del departamento 1, tuvo un aumento del 20%: "+salario_dept1+"$");
            
        }else{
            System.out.println("El salario de los vendedores del departamento 1 es de: "+salario_dept1+"$");
        }
        if (((ventas_dept2*100)/suma_ventas) >33){
            salario_dept2+=(salario_dept2*0.2);
            System.out.println("El salario de los vendedores del departamento 2, tuvo un aumento del 20%: "+salario_dept2+"$");
        }else{
            System.out.println("El salario de los vendedores del departamento 2 es de: "+salario_dept2+"$");
        
        }
        if (((ventas_dept3*100)/suma_ventas) >33){
            salario_dept3+=(salario_dept3*0.2);
            System.out.println("El salario de los vendedores del departamento 3, tuvo un aumento del 20%: "+salario_dept3+"$");
        }else{
        System.out.println("El salario de los vendedores del departamento 3 es de: "+salario_dept3+"$");
        }
        
        
    }
}
