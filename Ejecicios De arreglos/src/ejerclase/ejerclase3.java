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
public class ejerclase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, t[];
        Scanner Entrada=new Scanner(System.in);
        t = new int[10];
        for (i=0;i<10;i++){
            System.out.print("Introduzca numero: ");
            t[i]=Entrada.nextInt();
        }
        System.out.println("El resultado es:");
        for (i=0;i<=4;i++){
            System.out.print(t[i]+",");
            System.out.println(t[9-i]);
        }
    }
    
}
