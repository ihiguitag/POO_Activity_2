/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_18;

/*
 * @author Isabel Higuita Giraldo
 */

public class Empleado {

    // Atributos

    private final int codigo;
    private final String nombres;
    public int horasTrabajadas;
    public double valorHora;
    public float reteFuente;

    // Métodos

    /**
     * Constructor de la clase Empleado.
     * 
     * @param codigo            | El código del empleado
     * @param nombres           | Los nombres del empleado
     * @param horasTrabajadas   | Las horas trabajadas por el empleado
     * @param valorHora         | El valor por hora del empleado
     * @param reteFuente        | La tasa de retención de fuente del empleado
     */
    public Empleado(int codigo, String nombres, int horasTrabajadas, double valorHora, float reteFuente) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.reteFuente = reteFuente;
    }

    /**
     * Devuelve una cadena de texto que contiene el código y los nombres.
     * 
     * @return String | El código y los nombres concatenados.
     */
    public String printInfo () {
        return "Codigo: " + this.codigo + "\nNombres: " + this.nombres;
    }

}
