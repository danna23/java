/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tipo = new Scanner (System.in);
        
        float DOLAR = (float)2.150;
        float EURO = (float)1.45;
        float cambio = 0;
        float cambio2 = 0;
        
        System.out.println("Ingrese tipo de cambio para dolar");
        cambio = Integer.valueOf(tipo.next());
        DOLAR = (float) cambio* DOLAR;
        System.out.println("SU cambio es $:."+DOLAR);
        System.out.println("Ingrese tipo de cambio para EURO");
        cambio2 = Integer.valueOf(tipo.next());
        EURO= (float) cambio2* EURO;
        System.out.println("Su cambio es de $:."+EURO);
        
        
        
    }
    
}
