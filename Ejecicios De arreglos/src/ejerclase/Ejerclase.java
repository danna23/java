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
public class Ejerclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[]=new int[5];
        Scanner numero=new Scanner(System.in);
        for (int i = 0; i < num.length;i++) {
            System.out.println("Introduce un numero");
            num[i]=numero.nextInt();
        }
        System.out.println("Imprimiendo orden inverso");
        for (int i = num.length-1; i>=0;i--){
            System.out.println("Indice" + i + "=" + num[i]);
        }
        
    }
    
}
