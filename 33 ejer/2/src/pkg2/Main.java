/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

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
        Scanner bol = new Scanner (System.in);
        
        float precio = 0;
        float boleto = 0;
        double KI = 10.50;
        
        System.out.println("Ingrese el kilometros recorridos");
        precio = Integer.valueOf(bol.next());
        KI = (float)(precio * KI);
        System.out.println("el precio del boleto es:."+KI);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
