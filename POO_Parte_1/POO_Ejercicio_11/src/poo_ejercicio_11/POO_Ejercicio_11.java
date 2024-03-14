/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_11;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #11
    Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
    ellos. 
 */

import java.util.Scanner;

public class POO_Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double A;
        double B;
        double C;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor del primer número: ");
        A = entrada.nextDouble();

        System.out.print("Ingrese el valor del segundo número: ");
        B = entrada.nextDouble();

        System.out.print("Ingrese el valor del tercer número: ");
        C = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Comparador

        Comparador comparador = new Comparador(A, B, C);

        // Mostrar el resultado de la comparación
        
        System.out.println("El valor mayor entre " + A + ", " + B + " y " + C + " es: " + comparador.comparar());
    }
        
}
