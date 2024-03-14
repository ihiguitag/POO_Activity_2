/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_12;

/**
 * @author Isabel Higuita Giraldo
 */

public class Trabajador {

    // Atributos

    private final String nombres;
    public int horasTrabajadas;
    public double valorHora;

    // Métodos

    /**
     * Constructor de la clase Trabajador
     * 
     * @param nombres           | Los nombres del trabajador
     * @param horasTrabajadas   | Las horas trabajadas por el trabajador
     * @param valorHora         | El valor de la hora trabajada
     */
    public Trabajador(String nombres, int horasTrabajadas, double valorHora) {
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    /**
     * Método para mostrar la información del trabajador
     * 
     * @return String | La información del trabajador
     */
    public String printInfo() {
        return "Nombres: " + nombres + "\nHoras trabajadas: " + horasTrabajadas + "\nValor hora: " + valorHora;
    }
    
}
