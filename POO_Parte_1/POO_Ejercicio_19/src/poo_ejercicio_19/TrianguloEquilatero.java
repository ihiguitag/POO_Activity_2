/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_19;

/**
 * @author Isabel Higuita Giraldo
 */

public class TrianguloEquilatero {

    // Atributos

    private final double lado;
    public double altura;
    public double perimetro;
    public double area;

    // Métodos

    /**
     * Constructor de la clase TrianguloEquilatero
     * 
     * @param lado | El valor del lado del triángulo equilátero
     */
    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el perímetro de un triángulo equilátero y lo asigna al atributo 'perimetro'.
     */
    public void calcularPerimetro() {
        this.perimetro = 3 * lado;
    }

    /**
     * Calcula la altura de un triángulo equilátero y lo asigna al atributo 'altura'.
     */
    public void calcularAltura() {
        this.altura = (Math.sqrt(3) / 2) * this.lado;
    }

    /**
     * Calcula el area de un triángulo equilátero y lo asigna al atributo 'area'.
     */
    public void calcularArea() {
        this.area = (this.lado * this.altura) / 2;
    }
    
}
