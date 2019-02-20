/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner number = new Scanner (System.in);
        
        int numero = 0;
        System.out.println("Ingrese un numero para determinar en que rango esta");
        numero = number.nextInt();
        
        if (numero >=0 && numero<=10)
        {
            System.out.println("El numero ingresado es de  digito");
        
        }
        else if (numero >= 10 && numero <=100)
        {
            
            System.out.println("El numero ingresado es de dos digitos");                   
                
        }
        else if (numero >=100 && numero <=1000)
        {
                    System.out.println("El numero ingresado es de tres digitos");
        }
        else if (numero >=1000 && numero <=10000)
        {
            System.out.println("El numero es de 4 digitos");
        }   
        else
        {
            System.out.println("porfavor ingrese lo que se le esta mostrando");
        }
    }
    
}
