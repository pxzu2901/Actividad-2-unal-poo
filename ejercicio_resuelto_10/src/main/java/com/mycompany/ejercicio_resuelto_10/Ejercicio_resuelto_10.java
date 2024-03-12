/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_10;

import java.util.Scanner;
public class Ejercicio_resuelto_10 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int estrato,valor_matricula;
        long patrimonio;
        String nombre, apellido, numero_inscripcion;
        //la matricula tiene un valor constante de 50000
        valor_matricula=50000;
        
        System.out.println("Ingrese el numero de incripcion: ");
        numero_inscripcion=entrada.next();
        
        System.out.println("Ingrese el valor del patrimonio: ");
        patrimonio=entrada.nextLong();
        
        System.out.println("Ingrese el estrato del estudiante: ");
        estrato=entrada.nextInt();
        
        System.out.println("ingrese el nombre del estudiante: ");
        nombre=entrada.next();
        
        System.out.println("ingrese el apellido del estudiante: ");
        apellido=entrada.next();
        
        if (patrimonio>2000000 && estrato>3){
            valor_matricula+=0.03*patrimonio;
            
        }
        System.out.print("El estudiante "+nombre+" "+apellido+" con numero de inscripcion ");
        System.out.print(numero_inscripcion +" debe pagar "+valor_matricula+"$ de maricula");
            
            
        }
        
        
        
        
    }

