/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_23;

/**
 * @author Isabel Higuita Giraldo
 */

public class Ecuacion {
    
    // Atributos

    private final double a;
    private final double b;
    private final double c;

    private double solucion1;
    private double solucion2;

    // Métodos

    /**
     * Constructor de la clase Ecuacion
     * 
     * @param a | El valor de A
     * @param b | El valor de B
     * @param c | El valor de C
     */
    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Método para calcular las soluciones de la ecuación
     */
    public void calcularSoluciones() {
        this.solucion1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        this.solucion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    /**
     * Método para obtener la solución 1
     * 
     * @return double | La solución 1
     */
    public double getSolucion1() {
        return solucion1;
    }

    /**
     * Método para obtener la solución 2
     * 
     * @return double | La solución 2
     */
    public double getSolucion2() {
        return solucion2;
    }
    
}
