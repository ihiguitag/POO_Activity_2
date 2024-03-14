/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_24;

/**
 * @author Isabel Higuita Giraldo
 */

public class Comparacion {

    // Atributos

    private final Esfera esferaA;
    private final Esfera esferaB;
    private final Esfera esferaC;

    // Métodos

    /**
     * Constructor de la clase Comparacion
     * 
     * @param pesoA | El peso de la esfera A
     * @param pesoB | El peso de la esfera B
     * @param pesoC | El peso de la esfera C
     */
    public Comparacion(double pesoA, double pesoB, double pesoC) {
        this.esferaA = new Esfera("A", pesoA);
        this.esferaB = new Esfera("B", pesoB);
        this.esferaC = new Esfera("C", pesoC);
    }

    /**
     * Método para comparar el peso de las esferas
     * 
     * @return Esfera | La esfera de mayor peso
     */
    public Esfera compararPeso() {
        if (esferaA.getPeso() > esferaB.getPeso() && esferaA.getPeso() > esferaC.getPeso()) {
            return esferaA;
        } else if (esferaB.getPeso() > esferaA.getPeso() && esferaB.getPeso() > esferaC.getPeso()) {
            return esferaB;
        } else if (esferaC.getPeso() > esferaA.getPeso() && esferaC.getPeso() > esferaB.getPeso()) {
            return esferaC;
        } else {
            return null;
        }
    }
    
}
