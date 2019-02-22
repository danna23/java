/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

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
        Scanner monto= new Scanner (System.in);
        float hora = 0;
        float COSTO = (float) 1.5;
        float total = 0;
        float resto = 0;
        
        
        System.out.println("Ingrese el monto a pagar");
        hora = monto.nextFloat();
        
        if(hora < 5)
        {
            total = hora * COSTO;
            System.out.println("El total a pagar es de :."+total);
        }
        else if (hora > 5)
        {
            resto = hora -1;
            total = (float) (resto * 1.5);
            System.out.println("Se le regala una hora gratis por exceder las 5:-3");
            System.out.println("EL total a pagar es de:. Q."+total);
        }
        else
        {
            System.out.println("Por favor ingrese lo solicitado");
        }
        
        
        
    }
    
}
