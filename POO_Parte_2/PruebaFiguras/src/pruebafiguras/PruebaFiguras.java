/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebafiguras;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    Se requiere un programa que modele varias figuras geométricas: el círculo,
    el rectángulo, el cuadrado y el triángulo rectángulo.
    • El círculo tiene como atributo su radio en centímetros.
    • El rectángulo, su base y altura en centímetros.
    • El cuadrado, la longitud de sus lados en centímetros.
    • El triángulo, su base y altura en centímetros.
    Se requieren métodos para determinar el área y el perímetro de cada
    figura geométrica. Además, para el triángulo rectángulo se requiere:
    • Un método que calcule la hipotenusa del rectángulo.
    • Un método para determinar qué tipo de triángulo es:
        - Equilátero: todos sus lados son iguales.
        - Isósceles: tiene dos lados iguales.
        - Escaleno: todos sus lados son diferentes.
    Se debe desarrollar una clase de prueba con un método main para
    crear las cuatro figuras y probar los métodos respectivos.
 */

import java.util.Scanner;

public class PruebaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double radio;
        double base;
        double altura;
        double lado;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        // Crear las figuras geométricas

        System.out.print("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();
        Circulo figura1 = new Circulo(radio);

        System.out.print("Ingrese la base del rectángulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        altura = entrada.nextDouble();
        Rectangulo figura2 = new Rectangulo(base, altura);

        System.out.print("Ingrese el lado del cuadrado: ");
        lado = entrada.nextDouble();
        Cuadrado figura3 = new Cuadrado(lado);

        System.out.print("Ingrese la base del triángulo: ");
        base = entrada.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = entrada.nextDouble();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(base, altura);

        entrada.close();

        // Mostrar el resultado

        System.out.println("CIRCULO");
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());

        System.out.println("\nRECTÁNGULO");
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());

        System.out.println("\nCUADRADO");
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());

        System.out.println("\nTRIÁNGULO");
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
    }
    
}
