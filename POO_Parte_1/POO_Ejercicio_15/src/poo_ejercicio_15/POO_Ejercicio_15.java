/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_15;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #15
    Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
    diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
    o menor peso. 
 */

import java.util.Scanner;

public class POO_Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double pesoA;
        double pesoB;
        double pesoC;
        double pesoD;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();

        System.out.print("Ingrese el peso de la esfera D: ");
        pesoD = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Comparador

        Comparador comparador = new Comparador(pesoA, pesoB, pesoC, pesoD);

        // Identificar la esfera diferente

        Esfera esfera = comparador.comparar();
        comparador.setPropiedad(esfera);

        // Mostrar el resultado de la comparación

        System.out.println(esfera.printInfo());
    }
    
}
