/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_23;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO PROPUESTO #23
    Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
    elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 
 */

import java.util.Scanner;

public class POO_Ejercicio_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double numA;
        double numB;
        double numC;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        numA = entrada.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        numB = entrada.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        numC = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Ecuacion

        Ecuacion ecuacion = new Ecuacion(numA, numB, numC);
        ecuacion.calcularSoluciones();

        // Mostrar las soluciones de la ecuación

        System.out.println("Solución 1: " + ecuacion.getSolucion1());
        System.out.println("Solución 2: " + ecuacion.getSolucion2());
    }
    
}
