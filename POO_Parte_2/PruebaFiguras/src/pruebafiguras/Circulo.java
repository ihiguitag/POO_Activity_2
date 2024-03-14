/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafiguras;

/**
 * @author Isabel Higuita Giraldo
 */

public class Circulo {

    // Atributos

    double radio; // Radio de un círculo

    // Métodos

    /**
     * Constructor de la clase Círculo
     * 
     * @param radio | Parámetro que define el radio de un círculo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    /**
     * Método que calcula y devuelve el área de un círculo como pi
     * multiplicado por el radio al cuadrado
     * 
     * @return double | Área de un círculo
     */
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * Método que calcula y devuelve el perímetro de un círculo como la
     * multiplicación de pi por el radio por 2
     * 
     * @return double | Perímetro de un círculo
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
    
}
