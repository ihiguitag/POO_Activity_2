/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_07;

/**
 * @author Isabel Higuita Giraldo
 */

public class Comparador {

    // Atributos

    private final double A;
    private final double B;

    // Métodos

    /**
     * Constructor de la clase
     * 
     * @param A | Valor numérico A
     * @param B | Valor numérico B
     */
    public Comparador(double A, double B) {
        this.A = A;
        this.B = B;
    }

    /**
     * Compara dos valores A y B y devuelve un mensaje indicando la relación entre ellos.
     * 
     * @return String | Un mensaje indicando la relación entre los valores A y B
     */
    public String comparar() {
        if (A > B) {
            return "A es mayor que B";
        } else if (A < B) {
            return "A es menor que B";
        } else {
            return "A es igual a B";
        }
    }
}
