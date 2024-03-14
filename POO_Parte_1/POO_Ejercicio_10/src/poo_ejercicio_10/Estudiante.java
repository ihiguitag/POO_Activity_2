/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_10;

/**
 * @author Isabel Higuita Giraldo
 */

public class Estudiante {

    // Atributos

    private final int numeroInscripcion;
    private final String nombres;
    public double patrimonio;
    public int estratoSocial;

    // Métodos

    /**
     * Constructor de la clase Estudiante
     * 
     * @param numeroInscripcion | Número de inscripción del estudiante
     * @param nombres           | Nombres del estudiante
     * @param patrimonio        | Patrimonio del estudiante
     * @param estratoSocial     | Estrato social del estudiante
     */
    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    /**
     * Método para mostrar la información del estudiante
     * 
     * @return String | Información del estudiante
     */
    public String printInfo() {
        return "Número de inscripción: " + numeroInscripcion + "\nNombres: " + nombres + "\nPatrimonio: " + patrimonio
                + "\nEstrato Social: " + estratoSocial;
    }
    
}
