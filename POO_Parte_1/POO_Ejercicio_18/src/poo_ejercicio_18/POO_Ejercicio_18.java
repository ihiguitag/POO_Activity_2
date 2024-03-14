/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_18;

/*
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 3 | EJERCICIO PROPUESTO #18
    Se tiene la siguiente información de un empleado:
    · código del empleado,
    · nombres,
    · número de horas trabajadas al mes,
    · valor hora trabajada,
    · porcentaje de retención en la fuente.
    Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto. 
 */

import java.util.Scanner;

public class POO_Ejercicio_18 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        int codigo;
        String nombres;
        int horasTrabajadas;
        double valorHora;
        float reteFuente;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el código del empleado: ");
        codigo = entrada.nextInt();

        // Consumir el carácter de nueva línea restante
        entrada.nextLine();
        
        System.out.print("Ingrese el nombre del empleado: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese el valor de la hora: ");
        valorHora = entrada.nextDouble();

        System.out.print("Ingrese el porcentaje de retención en la fuente: ");
        reteFuente = entrada.nextFloat() / 100;

        entrada.close();

        // Crear un objeto de tipo Empleado y Salario

        Empleado empleado = new Empleado(codigo, nombres, horasTrabajadas, valorHora, reteFuente);
        Salario salario = new Salario(empleado);

        // Mostrar la información del empleado y el salario

        System.out.println("Información del empleado");
        System.out.println(empleado.printInfo());
        System.out.println("Salario Bruto: " + salario.calcularSalarioBruto());
        System.out.println("Salario Neto: " + salario.calcularSalarioNeto());
    }

}
