package com.mycompany.ejercicio18;

class Empleado {
    private int codigoEmpleado;
    private String nombres;
    private double horasTrabajadas;
    private double valorHoraTrabajada;
    private double porcentajeRetencion;

    // Constructor
    public Empleado(int codigoEmpleado, String nombres, double horasTrabajadas, double valorHoraTrabajada, double porcentajeRetencion) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHoraTrabajada = valorHoraTrabajada;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    // Métodos para cálculos
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHoraTrabajada;
    }

    public double calcularRetencionFuente() {
        return calcularSalarioBruto() * (porcentajeRetencion / 100);
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularRetencionFuente();
    }

    // Método para imprimir la información del empleado
    public void imprimirInformacion() {
        System.out.println("Código empleado: " + codigoEmpleado);
        System.out.println("Nombres: " + nombres);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor hora trabajada: " + valorHoraTrabajada);
        System.out.println("Porcentaje retención en la fuente: " + porcentajeRetencion + "%");
        System.out.println("Salario bruto: " + calcularSalarioBruto());
        System.out.println("Retención en la fuente: " + calcularRetencionFuente());
        System.out.println("Salario neto: " + calcularSalarioNeto());
    }
}