/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_11;

/**
 * @author Isabel Higuita Giraldo
 */

public class Comparador {

    // Atributos

    private final double A;
    private final double B;
    private final double C;

    // Métodos

    /**
     * Constructor de la clase Comparador
     * 
     * @param A | El valor de A
     * @param B | El valor de B
     * @param C | El valor de C
     */
    public Comparador(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    /**
     * Método para comparar los valores de A, B y C
     * 
     * @return double | El resultado de la comparación
     */
    public double comparar() {
        return Math.max(A, Math.max(B, C));
    }
    
}
