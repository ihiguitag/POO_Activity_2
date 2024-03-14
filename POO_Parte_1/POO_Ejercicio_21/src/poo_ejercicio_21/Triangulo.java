/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_21;

/**
 * @author Isabel Higuita Giraldo
 */

public class Triangulo {

    // Atributos

    private final double lado1;
    private final double lado2;
    private final double lado3;
    
    public double semiperimetro;
    public double perimetro;
    public double area;

    // Métodos

    /**
     * Constructor de la clase Triangulo
     * 
     * @param lado1 | El valor del lado 1 del triángulo
     * @param lado2 | El valor del lado 2 del triángulo
     * @param lado3 | El valor del lado 3 del triángulo
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro de un triángulo y lo asigna al atributo 'perimetro'.
     */
    public void calcularPerimetro() {
        this.perimetro = this.lado1 + this.lado2 + this.lado3;
    }

    /**
     * Calcula el semiperímetro de un triángulo y lo asigna al atributo 'semiperimetro'.
     */
    public void calcularSemiperimetro() {
        this.semiperimetro = this.perimetro / 2;
    }

    /**
     * Calcula el área de un triángulo y lo asigna al atributo 'area'.
     */
    public void calcularArea() {
        this.area = Math.sqrt(this.semiperimetro * (this.semiperimetro - this.lado1) * (this.semiperimetro - this.lado2)
                * (this.semiperimetro - this.lado3));
    }
    
}
