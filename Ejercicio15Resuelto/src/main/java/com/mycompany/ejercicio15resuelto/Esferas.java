package com.mycompany.ejercicio15resuelto;

public class Esferas {
    private double pesoA;
    private double pesoB;
    private double pesoC;
    private double pesoD;

    public Esferas(double pesoA, double pesoB, double pesoC, double pesoD) {
        this.pesoA = pesoA;
        this.pesoB = pesoB;
        this.pesoC = pesoC;
        this.pesoD = pesoD;
    }

    public String hallarMayor() {
        if (pesoA == pesoB && pesoB == pesoC) {
            if (pesoA != pesoD) {
                if (pesoA > pesoD) {
                    return "La esfera D es de menor peso que las otras tres.";
                } else {
                    return "La esfera D es de mayor peso que las otras tres.";
                }
            } else {
                return "La esfera D tiene el mismo peso que las otras tres.";
            }
        } else if (pesoA == pesoB && pesoB == pesoD) {
            if (pesoA != pesoC) {
                if (pesoA > pesoC) {
                    return "La esfera C es de menor peso que las otras tres.";
                } else {
                    return "La esfera C es de mayor peso que las otras tres.";
                }
            } else {
                return "La esfera C tiene el mismo peso que las otras tres.";
            }
        } else if (pesoA == pesoC && pesoC == pesoD) {
            if (pesoA != pesoB) {
                if (pesoA > pesoB) {
                    return "La esfera B es de menor peso que las otras tres.";
                } else {
                    return "La esfera B es de mayor peso que las otras tres.";
                }
            } else {
                return "La esfera B tiene el mismo peso que las otras tres.";
            }
        } else if (pesoB == pesoC && pesoC == pesoD) {
            if (pesoB != pesoA) {
                if (pesoB > pesoA) {
                    return "La esfera A es de menor peso que las otras tres.";
                } else {
                    return "La esfera A es de mayor peso que las otras tres.";
                }
            } else {
                return "La esfera A tiene el mismo peso que las otras tres.";
            }
        } else {
            return "No se puede determinar cuál es la esfera de diferente peso.";
        }
    }
}
