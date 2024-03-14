/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_14;

/**
 * @author Isabel Higuita Giraldo
 */

public class Departamento {
    
    // Atributos

    public double ventasDepartamento;
    public double salarioVendedores;

    // Métodos

    /**
    * Constructor de la clase Departamento
    * 
    * @param ventasDepartamento | El valor de las ventas del departamento
    * @param salarioVendedores  | El salario de los vendedores del departamento
    */
    public Departamento(double ventasDepartamento, double salarioVendedores) {
        this.ventasDepartamento = ventasDepartamento;
        this.salarioVendedores = salarioVendedores;
    }

    /**
     * Método para obtener el salario de los vendedores
     * 
     * @return double | El salario de los vendedores
     */
    public double getSalario() {
        return this.salarioVendedores;
    }
    
}
