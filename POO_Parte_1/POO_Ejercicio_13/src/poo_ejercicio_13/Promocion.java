/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_13;

/**
 * @author Isabel Higuita Giraldo
 */

public class Promocion {

    // Atributos

    private final double valorCompra;
    private final String colorBolita;

    // Métodos

    /**
     * Constructor de la clase Promocion
     * 
     * @param valorCompra | El valor de la compra
     * @param colorBolita | El color de la bolita
     */
    public Promocion(double valorCompra, String colorBolita) {
        this.valorCompra = valorCompra;
        this.colorBolita = colorBolita;
    }

    /**
     * Método para calcular el descuento de la compra
     * 
     * @return double | El valor del descuento
     */
    public double calcularDescuento() {
        switch (colorBolita) {
            case "blanca":
                return 0;
            case "verde":
                return valorCompra * 0.1;
            case "amarilla":
                return valorCompra * 0.25;
            case "azul":
                return valorCompra * 0.5;
            case "roja":
                return valorCompra;
            default:
                return 0;
        }
    }

    /**
     * Método para calcular el valor final de la compra
     * 
     * @param descuento | El valor del descuento
     * @return double | El valor final de la compra
     */
    public double calcularValorFinal(double descuento) {
        return valorCompra - descuento;
    }
    
}
