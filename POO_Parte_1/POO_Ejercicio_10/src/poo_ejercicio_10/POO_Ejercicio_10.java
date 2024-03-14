/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_10;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #10
    Cierta universidad para liquidar el pago de matrícula de un estudiante le exige los
    siguientes datos:
    • Número de inscripción
    • Nombres
    • Patrimonio.
    • Estrato social.
    La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio
    es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%
    sobre el patrimonio. Hacer un algoritmo que muestre:
    • Número de inscripción.
    • Nombres.
    • Pago de matrícula
 */

import java.util.Scanner;

public class POO_Ejercicio_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        int numeroInscripcion;
        String nombres;
        double patrimonio;
        int estratoSocial;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de inscripción: ");
        numeroInscripcion = entrada.nextInt();

        // Consumir el carácter de nueva línea restante
        entrada.nextLine();

        System.out.print("Ingrese los nombres del estudiante: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        patrimonio = entrada.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        estratoSocial = entrada.nextInt();

        entrada.close();

        // Crear un objeto de tipo Estudiante y Matricula

        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estratoSocial);
        Matricula matricula = new Matricula(estudiante);

        // Mostrar la información del estudiante

        System.out.println("Información del estudiante");
        System.out.println(estudiante.printInfo());
        System.out.println("Pago de matrícula: " + matricula.calcularPagoMatricula());
    }
    
}
