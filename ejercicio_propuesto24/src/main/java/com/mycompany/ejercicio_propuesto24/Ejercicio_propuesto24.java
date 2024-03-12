/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_propuesto24;

import java.util.Scanner;
public class Ejercicio_propuesto24 {

    public static void main(String[] args) {
        double A, B, C;
        int contador;
        contador=0;
        Scanner entrada= new Scanner(System.in);
        //pedimos el peso de cada esfera
        System.out.println("peso de la esfera A en Kg: ");
        A=entrada.nextDouble();
        System.out.println("peso de la esfera B en Kg: ");
        B=entrada.nextDouble();
        System.out.println("peso de la esfera C Kg: ");
        C=entrada.nextDouble();
        //Realizamos un while True, por si el usuario digita pesos iguales
        while (true){
            if (A==B || A==C || B==C){
                contador+=1;
                if (contador==2){
                    break;
                    }
                System.out.println();
                System.out.println("Las esferas deben ser de diferente peso");
                System.out.println("Por favor vuelva a ingresar tres pesos diferentes");
                System.out.println();
                System.out.println("peso de la esfera A: ");
                A=entrada.nextDouble();
                System.out.println("peso de la esfera B: ");
                B=entrada.nextDouble();
                System.out.println("peso de la esfera C: ");
                C=entrada.nextDouble();          
            }else{
            break;
            }
            //si el usuario escribe 2 veces pesos iguales, terminamos el programa
        }if(contador==2){
            System.out.println();
            System.out.println("Le pedi tres pesos diferentes");
            System.out.println("Terminando programa...");

            }else if (A>B && A>C){
                System.out.println("la esfera A es la mas pesada, con un peso de: "+A+"Kg");
        
            }else if (B>A && B>C){
                System.out.println("la esfera B es la mas pesada, con un peso de: "+B+"Kg");
        
            }else{
                System.out.println("la esfera C es la mas pesada, con un peso de: "+C+"Kg");
        
            }
        
        
    }
}
