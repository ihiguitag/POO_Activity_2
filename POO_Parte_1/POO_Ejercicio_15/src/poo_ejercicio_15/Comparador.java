/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_15;

/**
 * @author Isabel Higuita Giraldo
 */

public class Comparador {

    // Atributos

    private final Esfera esferaA;
    private final Esfera esferaB;
    private final Esfera esferaC;
    private final Esfera esferaD;

    private final double mayor;
    private final double menor;

    // Métodos

    /**
     * Constructor de la clase Comparador
     * 
     * @param pesoA | Peso de la esfera A
     * @param pesoB | Peso de la esfera B
     * @param pesoC | Peso de la esfera C
     * @param pesoD | Peso de la esfera D
     */
    public Comparador(double pesoA, double pesoB, double pesoC, double pesoD) {
        this.esferaA = new Esfera("A", pesoA);
        this.esferaB = new Esfera("B", pesoB);
        this.esferaC = new Esfera("C", pesoC);
        this.esferaD = new Esfera("D", pesoD);

        this.mayor = Math.max(pesoA, Math.max(pesoB, Math.max(pesoC, pesoD)));
        this.menor = Math.min(pesoA, Math.min(pesoB, Math.min(pesoC, pesoD)));
    }

    /**
     * Método para establecer la propiedad de la esfera
     * 
     * @param esfera | La esfera a la que se le establecerá la propiedad
     */
    public void setPropiedad(Esfera esfera) {
        if (esfera.peso == this.mayor) {
            esfera.propiedad = "mayor";
        } else if (esfera.peso == this.menor) {
            esfera.propiedad = "menor";
        }
    }

    /**
     * Método para comparar los pesos de las esferas
     * 
     * @return Esfera | El resultado de la comparación
     */
    public Esfera comparar() {
        if (this.esferaA.peso == this.esferaB.peso && this.esferaA.peso == this.esferaC.peso) {
            return this.esferaD;
        } else if (this.esferaA.peso == this.esferaB.peso && this.esferaA.peso == this.esferaD.peso) {
            return this.esferaC;
        } else if (this.esferaA.peso == this.esferaC.peso && this.esferaA.peso == this.esferaD.peso) {
            return this.esferaB;
        } else {
            return this.esferaA;
        }
    }
    
}
