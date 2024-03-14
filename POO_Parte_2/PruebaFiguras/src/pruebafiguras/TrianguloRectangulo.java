/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebafiguras;

/**
 * @author Isabel Higuita Giraldo
 */

public class TrianguloRectangulo {

    // Atributos

    double base; // La base de un triángulo rectángulo
    double altura; // La altura de un triángulo rectángulo

    // Métodos

    /**
     * Constructor de la clase TriánguloRectángulo
     * 
     * @param base   | Base de un triángulo rectángulo
     * @param altura | Altura de un triángulo rectángulo
     */
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un triángulo rectángulo
     * como la base multiplicada por la altura sobre 2
     * 
     * @return double | Área de un triángulo rectángulo
     */
    public double calcularArea() {
        return ((base * altura) / 2);
    }

    /**
     * Método que calcula y devuelve el perímetro de un triángulo
     * rectángulo como la suma de la base, la altura y la hipotenusa
     * 
     * @return double | Perímetro de un triángulo rectángulo
     */
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }

    /**
     * Método que calcula y devuelve la hipotenusa de un triángulo
     * rectángulo utilizando el teorema de Pitágoras
     * 
     * @return double | Hipotenusa de un triángulo rectángulo
     */
    double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    /**
     * Método que determina si un triángulo es:
     * • Equilátero: si sus tres lados son iguales
     * • Escaleno: si sus tres lados son todos diferentes
     * • Escaleno: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
    public void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero"); /* Todos sus lados son iguales */

        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno"); /* Todos sus lados son diferentes */

        } else {
            System.out.println("Es un triángulo isósceles"); /* De otra manera, es isósceles */
        }
    }
    
}
