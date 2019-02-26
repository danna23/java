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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int numero = 0;
        int cuadrado = 0;
        int cubo = 0;
        System.out.println("Calculador del cubo y cuadrado de un numero");
        System.out.print("Ingrese el numero a calcular: ");
        numero = dato.nextInt();
        
        cuadrado = numero * numero;
        cubo = numero * numero * numero;
        System.out.println("El numero ingresado es: "+numero);
        System.out.println("El cuadrado del numero ingresado es: "+cuadrado);
        System.out.println("El cubo del numero ingresado es: "+cubo);
    }
    
}
