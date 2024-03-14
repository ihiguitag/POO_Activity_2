/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_10;

/**
 * @author Isabel Higuita Giraldo
 */

public class Matricula {

    // Atributos

    private final Estudiante estudiante;

    // Métodos

    /**
     * Constructor de la clase Matricula
     * 
     * @param estudiante | Objeto de tipo Estudiante
     */
    public Matricula(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    /**
     * Método para calcular el pago de la matrícula
     * 
     * @return double | Pago de la matrícula
     */
    public double calcularPagoMatricula() {
        double pagoMatricula = 50000;

        if (estudiante.patrimonio > 2000000 && estudiante.estratoSocial > 3) {
            pagoMatricula += estudiante.patrimonio * 0.03;
        }

        return pagoMatricula;
    }
    
}
