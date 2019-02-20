/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicúa;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Capicúa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner poli = new Scanner (System.in);
        
        int numero,centena,decena,unidad;
        
        System.out.println("Ingrese un número");
        numero = poli.nextInt();
        centena = numero/100;
        decena = (numero %100)/10;
        unidad = (numero %100)%10;
        
        if (centena == unidad)
            System.out.println("El numero es capicúa");
        else
            System.out.println("EL numero no es capicúa");
            
        
    }
    
}
