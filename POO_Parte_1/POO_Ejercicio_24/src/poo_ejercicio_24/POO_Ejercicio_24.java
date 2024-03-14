/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_24;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO PROPUESTO #24
    Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
    la esfera de mayor peso
 */

import java.util.Scanner;

public class POO_Ejercicio_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double pesoA;
        double pesoB;
        double pesoC;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Comparacion

        Comparacion esferas = new Comparacion(pesoA, pesoB, pesoC);

        // Obtener la esfera de mayor peso

        Esfera esfera = esferas.compararPeso();

        // Mostrar el resultado

        System.out.println("La esfera de mayor peso es: " + esfera.getNombre() + " con un peso de " + esfera.getPeso());
    }
    
}
