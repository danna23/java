/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double Valor = 7.77;
        double cantidad = 0;
        double total = 0;
        System.out.println("Bienvenido a Conversor de Dolares a Quetzales");
        System.out.print("Ingrese su cantidad en Dolares: ");
        cantidad = Double.valueOf(dato.next());
        total = cantidad / Valor;
        System.out.println("Su cantidad de Dolares en Quetzales es de: "+total);
    }
    
}
