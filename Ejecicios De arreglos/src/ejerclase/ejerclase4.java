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
public class ejerclase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Entrada=new Scanner(System.in);
        
        int a[], b[], c[];
        int i,j;
        a=new int[10];
        b=new int[10];

        c = new int [20];
        System.out.println("Leyendo la tabla a");
        for (i=0;i<10;i++){
            System.out.print("número: ");
            a[i]=Entrada.nextInt();
        }
        
        System.out.println("Leyendo la tabla b");
        for (i=0;i<10;i++){
            System.out.print("número: ");
            b[i]=Entrada.nextInt();
        }
        j=0;
        for (i=0;i<10;i++){
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("La tabla c queda: ");
        for (j=0;j<20;j++) 
            System.out.print(c[j]+" ");
        System.out.println("");
    }
    
}
