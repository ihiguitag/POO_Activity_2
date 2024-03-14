/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_12;

/**
 * @author Isabel Higuita Giraldo
 */

public class Salario {

    // Atributos

    private final Trabajador trabajador;

    // Métodos

    /**
     * Constructor de la clase Salario
     * 
     * @param trabajador | El trabajador al que se le calculará el salario
     */
    public Salario(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    /**
     * Método para calcular el salario del trabajador
     * 
     * @return double | El salario del trabajador
     */
    public double calcularSalario() {
        double salario;
        
        if (trabajador.horasTrabajadas <= 40){
            salario = trabajador.horasTrabajadas * trabajador.valorHora;
        } else {
            salario = 40 * trabajador.valorHora;
        }
        
        int horasExtra = trabajador.horasTrabajadas - 40;

        if (horasExtra > 0 && horasExtra <= 8) {
            salario += horasExtra * (trabajador.valorHora * 2);

        } else if (horasExtra > 8) {
            salario += 8 * (trabajador.valorHora * 2);
            salario += (horasExtra - 8) * (trabajador.valorHora * 3);
        }

        return salario;
    }
    
}
