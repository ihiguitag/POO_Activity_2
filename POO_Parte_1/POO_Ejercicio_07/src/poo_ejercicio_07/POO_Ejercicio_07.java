/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_07;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #7
    Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
    si A es mayor, menor o igual a B
*/

import java.util.Scanner;

public class POO_Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double A;
        double B;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de A: ");
        A = entrada.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        B = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Comparador
        Comparador comparador = new Comparador(A, B);

        // Mostrar el resultado de la comparación
        System.out.println(comparador.comparar());
    }
    
}
