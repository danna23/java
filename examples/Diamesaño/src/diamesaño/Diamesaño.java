/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamesaño;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Diamesaño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner dma = new Scanner (System.in);
        
       int día = 0;
       int mes = 0;
       int año = 0;
       
       System.out.println("Ingrese dia");
       día = dma.nextInt();
       System.out.println("Ingrese el mes");
       mes = dma.nextInt();
       System.out.println("Ingrese el año");
       año = dma.nextInt();
        
        if (día <= 31)
        {
            System.out.println("El dia es correcto"+día);
        }
        else if (mes <= 12)
        {
            System.out.println("El mes es correcto"+mes);
       
        }
        else if (año <= 0)
        {
            System.out.println("El año es correcto"+año);
        }
        else
        {
            System.out.println("Incorrecto");
        }
   }
}
