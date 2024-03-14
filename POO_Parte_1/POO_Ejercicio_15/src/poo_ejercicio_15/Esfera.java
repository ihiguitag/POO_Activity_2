/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_15;

/**
 * @author Isabel Higuita Giraldo
 */

public class Esfera {

    // Atributos

    public String nombre;
    public double peso;
    public String propiedad;

    // Métodos

    /**
     * Constructor de la clase Esfera
     * 
     * @param nombre | Nombre de la esfera
     * @param peso   | Peso de la esfera
     */
    public Esfera(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    /**
     * Método para obtener la información de la esfera
     * 
     * @return String | Información de la esfera
     */
    public String printInfo() {
        return "La esfera " + this.nombre + " es la diferente y es de " + this.propiedad + " peso";
    }
    
}
