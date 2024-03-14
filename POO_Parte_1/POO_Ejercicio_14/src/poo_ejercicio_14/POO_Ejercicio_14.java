/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_14;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #14
    Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
    vendedores. Al final del período, a cada departamento se le pide el importe global de las
    ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
    salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
    nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
    • Ventas del departamento 1
    • Ventas del departamento 2
    • Ventas del departamento 3
    • Salario de los vendedores de cada departamento
    Hacer un algoritmo que determine cuánto recibirán los vendedores de cada departamento
    al finalizar el período. 
 */

import java.util.Scanner;

public class POO_Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double salarioVendedores;
        double ventasDepartamento;

        // Crear un objeto de tipo Scanner para leer los datos y un objeto de tipo Departamento por cada departamento

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el salario de los vendedores: ");
        salarioVendedores = entrada.nextDouble();

        System.out.print("Ingrese el valor de las ventas del departamento #1: ");
        ventasDepartamento = entrada.nextDouble();
        Departamento departamento1 = new Departamento(ventasDepartamento, salarioVendedores);

        System.out.print("Ingrese el valor de las ventas del departamento #2: ");
        ventasDepartamento = entrada.nextDouble();
        Departamento departamento2 = new Departamento(ventasDepartamento, salarioVendedores);

        System.out.print("Ingrese el valor de las ventas del departamento #3: ");
        ventasDepartamento = entrada.nextDouble();
        Departamento departamento3 = new Departamento(ventasDepartamento, salarioVendedores);

        entrada.close();

        // Crear un objeto de tipo Ventas

        Ventas ventas = new Ventas(departamento1.ventasDepartamento, departamento2.ventasDepartamento, departamento3.ventasDepartamento);

        // Calcular el salario de los vendedores de cada departamento

        ventas.asignarAumentos(departamento1);
        ventas.asignarAumentos(departamento2);
        ventas.asignarAumentos(departamento3);

        // Mostrar la información del departamento

        System.out.println("Salario de los vendedores del departamento 1: " + departamento1.getSalario());
        System.out.println("Salario de los vendedores del departamento 2: " + departamento2.getSalario());
        System.out.println("Salario de los vendedores del departamento 3: " + departamento3.getSalario());
    }
    
}
