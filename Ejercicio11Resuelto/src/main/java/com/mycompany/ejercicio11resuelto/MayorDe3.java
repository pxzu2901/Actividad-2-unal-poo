package com.mycompany.ejercicio11resuelto;

public class MayorDe3 {
    public static int encontrarMayor(int N1, int N2, int N3) {
        if (N1 > N2 && N1 > N3) {
            return N1;
        } else if (N2 > N1 && N2 > N3) {
            return N2;
        } else {
            return N3;
        }
    }
}
