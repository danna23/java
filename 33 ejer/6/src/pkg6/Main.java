/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

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
        Scanner nuevo = new Scanner (System.in);
        
        float salario = 0;
        float servicios = 0;
        float INCREMENTO = (float) 0.8;
        float DES = (float) 2.5;
        
        System.out.println("Ingrese el salio del empleado");
        salario = Integer.valueOf(nuevo.next());
        INCREMENTO = (float) (salario * INCREMENTO);
        System.out.println("EL total de incremento es:."+INCREMENTO);
        servicios = (float) (INCREMENTO - DES);
        System.out.println("Su descuento por los servicios son:"+servicios);
        
                
        
    }
    
}
