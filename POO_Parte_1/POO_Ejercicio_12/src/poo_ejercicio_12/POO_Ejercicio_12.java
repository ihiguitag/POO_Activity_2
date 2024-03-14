/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_12;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #12
    Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
    semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
    de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
    no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
    que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
    datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
    normal de trabajo
 */

import java.util.Scanner;

public class POO_Ejercicio_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        String nombres;
        int horasTrabajadas;
        double valorHora;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese los nombres del empleado: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el valor de la hora: ");
        valorHora = entrada.nextDouble();

        entrada.close();

        // Crear un objeto de tipo Trabajador y Salario
        
        Trabajador trabajador = new Trabajador(nombres, horasTrabajadas, valorHora);
        Salario salario = new Salario(trabajador);

        // Mostrar la información del trabajador y el salario

        System.out.println("Información del trabajador");
        System.out.println(trabajador.printInfo());
        System.out.println("Salario: " + salario.calcularSalario());
    }
    
}
