/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerclase;

import java.util.Scanner;

/**
 *
 * @author Gerson
 */
public class ejerclase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t=new Scanner(System.in);
        int[] arreglo=new int[5];
        
        for (int i=0; i<arreglo.length; i++){
            System.out.println("dame un numero");
            arreglo[i]=t.nextInt();
        }
        System.out.println("--Los numeros son--");
        
        for(int i: arreglo){
            System.out.println(i);
        }
    }
    
}
