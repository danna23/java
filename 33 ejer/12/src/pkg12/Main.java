/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

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
        Scanner sal = new Scanner (System.in);
        
        int salario = 0;
        float descuento = (float) 0.20;
        
        System.out.println("Ingrese salio de empleado");
        salario = Integer.valueOf(sal.next());
        descuento = (float) (descuento * salario);
        System.out.println("EL nuevo salio es de:."+descuento);
    }
    
}
