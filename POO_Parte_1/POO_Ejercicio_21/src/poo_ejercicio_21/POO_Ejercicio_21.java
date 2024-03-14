/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_21;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 3 | EJERCICIO PROPUESTO #21
    Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
    semiperímetro y el área del triángulo. 
 */

import java.util.Scanner;

public class POO_Ejercicio_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double lado1;
        double lado2;
        double lado3;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();

        System.out.print("Ingrese el valor del lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();

        System.out.print("Ingrese el valor del lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Triangulo
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);

        // Calcular el perímetro, el semiperímetro y el área del triángulo

        triangulo.calcularPerimetro();
        triangulo.calcularSemiperimetro();
        triangulo.calcularArea();

        // Mostrar la información del triángulo

        System.out.println("Resultado de las Operaciones:");
        System.out.println("Perímetro: " + triangulo.perimetro);
        System.out.println("Semiperímetro: " + triangulo.semiperimetro);
        System.out.println("Área: " + triangulo.area);
    }
    
}
