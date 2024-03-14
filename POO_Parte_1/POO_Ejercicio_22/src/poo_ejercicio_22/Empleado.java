/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_22;

/**
 * @author Isabel Higuita Giraldo
 */

public class Empleado {
    
    // Atributos

    private final String nombre;
    private final double salarioBasico;
    private final double horasTrabajadas;
    private final double salario;

    // Métodos

    /**
     * Constructor de la clase Empleado
     * 
     * @param nombre          | El nombre del empleado
     * @param salarioBasico   | El salario básico por hora
     * @param horasTrabajadas | El número de horas trabajadas en el mes
     */
    public Empleado(String nombre, double salarioBasico, double horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBasico = salarioBasico;
        this.horasTrabajadas = horasTrabajadas;

        // Crear un objeto de tipo Salario
        Salario salario = new Salario(this.salarioBasico, this.horasTrabajadas);

        // Calcular el salario mensual
        this.salario = salario.calcularSalarioMensual();
    }

    /**
     * Método para mostrar el resultado
     * 
     * @return String | El nombre si el salario es menor de $450.000, de lo contrario el nombre y el salario
     */
    public String mostrarResultado() {
        if (salario > 450000) {
            return "El salario mensual de " + nombre + " es de $" + salario;
        } else {
            return nombre;
        }
    }
    
}
