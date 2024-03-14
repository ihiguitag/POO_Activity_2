/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_18;

/*
 * @author Isabel Higuita Giraldo
 */

public class Salario {

    // Atributos

    private final Empleado empleado;

    // Métodos

    /**
     * Constructor de la clase Salario.
     * 
     * @param empleado | El empleado al que se le calculará el salario.
     */
    public Salario(Empleado empleado) {
        this.empleado = empleado;
    }

    /**
     * Calcula el salario bruto del empleado.
     * 
     * @return double | El salario bruto del empleado.
     */
    public double calcularSalarioBruto() {
        double salarioBruto = empleado.horasTrabajadas * empleado.valorHora;
        return salarioBruto;
    }

    /**
     * Calcula el salario neto del empleado.
     * 
     * @return double | El salario neto del empleado.
     */
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double salarioNeto = salarioBruto - (salarioBruto * empleado.reteFuente);
        return salarioNeto;
    }

}
