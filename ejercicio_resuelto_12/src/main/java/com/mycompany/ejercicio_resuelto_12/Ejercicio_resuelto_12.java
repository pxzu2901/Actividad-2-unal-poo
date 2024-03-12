/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_resuelto_12;
import java.util.Scanner;
public class Ejercicio_resuelto_12 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nombre, apellido;
        double salario;
        int nhoras, vhora;
        System.out.println("escriba el nombre del trabajador: ");
        nombre=entrada.next();
        System.out.println("escriba el apellido del trabajador: ");
        apellido=entrada.next();
        System.out.println("digite el numero de horas laboradas por el trabajador: ");
        nhoras=entrada.nextInt();
        System.out.println("digite el valor de cada hora laborada: ");
        vhora=entrada.nextInt();
        
        if (nhoras>40 && nhoras<=48){
            salario=(40*vhora)+(vhora*2*(nhoras-40));
            
        }else if (nhoras>48){
            salario=(vhora*40)+(vhora*2*8)+((vhora*3)*(nhoras-48));
            
            
        }else{
            salario=vhora*nhoras;
            
        
        }
        System.out.println(nombre+" "+apellido+" devenga un salario de: "+salario+"$");
         
        
        
    }
}
