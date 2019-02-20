/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mes;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Mes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner amd = new Scanner (System.in);
        
        int día = 0;
        int mes = 0;
        int año = 0;
        
        System.out.println("Ingrese el dia");
        día = amd.nextInt();
        System.out.println("Ingrese el mes");
        mes = amd.nextInt();
        System.out.println("Ingrese el año");
        año = amd.nextInt();
        
        if (día >= 1  && día <= 31){
             System.out.println("El dia es correcto"+día);
        }
        else{
            System.out.println("Incorrecto");
        }
            
        if (mes >1 && mes <= 31)
        {
                
            System.out.println("El mes es correcto"+mes);
        }
        else
        {
            System.out.println("Incorrecto");
                }
        if (año >=0)
        {
            System.out.println("El año es correcto"+año);
                    
        }
        else
        {
            System.out.println("Es incorrecto");
        }
    }
    
}
