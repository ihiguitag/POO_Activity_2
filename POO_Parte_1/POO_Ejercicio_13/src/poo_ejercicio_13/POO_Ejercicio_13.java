/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_ejercicio_13;

/**
 * @author Isabel Higuita Giraldo
 */

/*
    CAPITULO 4 | EJERCICIO RESUELTO #13
    Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
    compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
    es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
    amarilla un 25%, si es azul un
    50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
    cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
    mencionados. 
 */

import java.util.Scanner;

public class POO_Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Variables

        double valorCompra;
        String colorBolita;

        // Crear un objeto de tipo Scanner para leer los datos

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        valorCompra = entrada.nextDouble();

        System.out.print("Ingrese el color de la bolita: ");
        colorBolita = entrada.next();

        entrada.close();

        // Crear un objeto de tipo Promocion

        Promocion promocion = new Promocion(valorCompra, colorBolita);

        // Calcular el descuento de la compra

        double descuento = promocion.calcularDescuento();

        // Mostrar el valor final de la compra
        
        System.out.println("Valor final de la compra: " + promocion.calcularValorFinal(descuento));
    }
    
}
