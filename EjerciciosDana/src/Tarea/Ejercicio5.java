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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int precio = 0;
        int acumulador = 0;
        int total = 0;
        double d1 = (float) 0.05;
        double d2 = (float) 0.10;
        System.out.println("Solicitar al usuario que ingrese el precio de un producto, repetir hasta que ingrese un numero negativo, acumulando los precios\n" +
                            "de los productos ingresados, \n" +
                            "   si el acumulado es mayor a 500 realizar un descuento del 5%, si es mayor a 1500 realizar un descuento\n" +
                            "del 10%\n" +
                            "");
        System.out.print("Ingrese precio del producto: ");
        precio = dato.nextInt();
        while(precio != 0){
            if(precio > 0){
                acumulador = (int) (precio + acumulador);
            }
            else if(precio < 0){
                System.out.println("Numero ingresado es negativo");
                if(acumulador > 500){
                    total = (int) (acumulador - (acumulador * d1));
                    System.out.println("Total de la suma de todos los productos: "+acumulador);
                    System.out.print("El total de los productos más descuento del 5% es: "+total);
                }
                else if(acumulador > 1500){
                    total = (int) (acumulador - (acumulador * d2));
                    System.out.println("Total de la suma de todos los productos: "+acumulador);
                    System.out.println("El total de los productos más descuento del 10% es: "+total);
                }
            }
            else{
                System.out.println("Dato incorrecto, vuelva a intentar");
            }
            System.out.println("Ingrese precio del producto: ");
            precio = dato.nextInt(); 
        }            
    }        
}
