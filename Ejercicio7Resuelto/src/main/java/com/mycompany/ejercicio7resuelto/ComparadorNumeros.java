package com.mycompany.ejercicio7resuelto;


public class ComparadorNumeros {
    private int A;
    private int B;

    // Constructor
    public ComparadorNumeros(int A, int B) {
        this.A = A;
        this.B = B;
    }

    // Método para comparar A con B y devolver el mensaje correspondiente
    public String compararNumeros() {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }
}