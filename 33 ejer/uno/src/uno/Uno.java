/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner pres = new Scanner (System.in);
        
        double prestamo = 10000;
        double tasa = 0.27;
        double meses = 12;
        double días = 365;
        double interes = 88.77;
        
        System.out.println("El prestamo que realizo es de :."+prestamo);
        //interes = pres.nextDouble();
        //System.out.println("El tiempo es:."+meses);
        //interes = prestamo*tasa/365*meses;
        System.out.println("el interes anual es de:."+interes);
        
        
        
    }
    
}
