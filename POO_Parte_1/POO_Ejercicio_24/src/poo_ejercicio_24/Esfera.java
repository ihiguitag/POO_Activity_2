/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_24;

/**
 * @author Isabel Higuita Giraldo
 */

public class Esfera {
    
    // Atributos

    private final double peso;
    private final String nombre;

    // Métodos

    /**
     * Constructor de la clase Esfera
     * 
     * @param nombre | El nombre de la esfera
     * @param peso   | El peso de la esfera
     */
    public Esfera(String nombre, double peso) {
        this.peso = peso;
        this.nombre = nombre;
    }

    /**
     * Devuelve el peso de la esfera
     * 
     * @return double | El peso de la esfera
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Devuelve el nombre de la esfera
     * 
     * @return String | El nombre de la esfera
     */
    public String getNombre() {
        return nombre;
    }
    
}
