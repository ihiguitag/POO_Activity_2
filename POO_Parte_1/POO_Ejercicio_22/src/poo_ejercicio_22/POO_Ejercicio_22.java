/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_22;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO PROPUESTO #22
    Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
    número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
    de $450.000, de lo contrario escriba sólo el nombre
 */

import java.util.Scanner;

public class POO_Ejercicio_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        String nombre;
        double salarioBasico;
        double horasTrabajadas;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese el salario básico por hora: ");
        salarioBasico = entrada.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        horasTrabajadas = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Empleado
        Empleado empleado = new Empleado(nombre, salarioBasico, horasTrabajadas);

        // Mostrar el resultado
        System.out.println(empleado.mostrarResultado());
    }
    
}
