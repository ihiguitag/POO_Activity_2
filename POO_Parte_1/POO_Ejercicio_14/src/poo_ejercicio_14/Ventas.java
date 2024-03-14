/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_14;

/**
 * @author Isabel Higuita Giraldo
 */

public class Ventas {

    // Atributos

    private final double totalVentas;

    // Métodos

    /**
     * Constructor de la clase Ventas
     * 
     * @param ventasDepartamento1 | El valor de las ventas del departamento 1
     * @param ventasDepartamento2 | El valor de las ventas del departamento 2
     * @param ventasDepartamento3 | El valor de las ventas del departamento 3
     */
    public Ventas(double ventasDepartamento1, double ventasDepartamento2, double ventasDepartamento3) {
        this.totalVentas = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
    }

    /**
     * Método para asignar aumentos a los vendedores
     * 
     * @param departamento | El departamento al que se le asignará el aumento
     */
    public void asignarAumentos(Departamento departamento) {
        if (departamento.ventasDepartamento > (this.totalVentas * 0.33)) {
            departamento.salarioVendedores += departamento.salarioVendedores * 0.20;
        }
    }
    
}
