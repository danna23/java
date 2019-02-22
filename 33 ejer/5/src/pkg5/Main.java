/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

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
        Scanner pa = new Scanner (System.in);
        
        float DES = (float) 0.35;
        float pago = 0;
        float medicamento = 0;
        
        System.out.println("Ingrese el precio del medicamento:.");
        medicamento = Integer.valueOf(pa.next());
        pago = (float)(DES* medicamento);
        System.out.println("El descuento fue de:."+pago);
        
        
        
    }
    
}
