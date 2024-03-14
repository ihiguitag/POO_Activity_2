/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_19;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 3 | EJERCICIO PROPUESTO #19
    Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
    perímetro, el valor de la altura y el área del triángulo.
*/

import java.util.Scanner;

public class POO_Ejercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double lado;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        lado = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo TrianguloEquilatero

        TrianguloEquilatero triangulo = new TrianguloEquilatero(lado);

        // Calcular el perímetro, la altura y el área del triángulo

        triangulo.calcularPerimetro();
        triangulo.calcularAltura();
        triangulo.calcularArea();

        // Mostrar la información del triángulo

        System.out.println("Resultado de las Operaciones:");
        System.out.println("Perímetro: " + triangulo.perimetro);
        System.out.println("Altura: " + triangulo.altura);
        System.out.println("Área: " + triangulo.area);
    }
    
}
