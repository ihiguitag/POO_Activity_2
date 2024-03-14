/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_22;

/**
 * @author Isabel Higuita Giraldo
 */

public class Salario {

    // Atributos

    private final double salarioBasico;
    private final double horasTrabajadas;
    private double salarioMensual;

    // Métodos

    /**
     * Constructor de la clase Salario
     * 
     * @param salarioBasico   | El salario básico por hora
     * @param horasTrabajadas | El número de horas trabajadas en el mes
     */
    public Salario(double salarioBasico, double horasTrabajadas){
        this.salarioBasico = salarioBasico;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Método para calcular el salario mensual
     * 
     * @return double | El salario mensual
     */
    public double calcularSalarioMensual(){
        this.salarioMensual = salarioBasico * horasTrabajadas;
        return this.salarioMensual;
    }
    
}
