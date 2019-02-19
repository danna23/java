/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

/**
 *
 * @author dana
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        int decision = 0;
        float cantidad_q = 0;
        float cantidad_d = 0;
        float valor_q = 0;
        float total_q = 0;
        float total = 0;
        System.out.println("Si desea convertir de dolar a quetzales (1)\n si desea convertir quetzales a dolares (2)");
        decision = ingresar.nextInt();
        
        if (decision == 1)//3
        {
            System.out.println("Ingrese la cantidad en dolares");
            cantidad_d = ingresar.nextFloat();
            System.out.println("Ingrese a como esta el valor del dolar:.");
            valor_q = ingresar.nextFloat();
            total_q = cantidad_d * valor_q;
            System.out.println("El total en quetzales es de:."+ total_q);
            
            
      
        }
        else if (decision == 2)
        {
            System.out.println("Programa para convertir cantidad de quetzales a dolares");
            System.out.println("Ingrese el valor del dolar");
            cantidad_d = ingresar.nextFloat();
            System.out.println("Ingrese la cantidad en quetzales");
            cantidad_q = ingresar.nextFloat();
            total = (cantidad_q/cantidad_d);
            System.out.println("La cantidad en dolares es de:."+total);
        }       
        else
        {
            System.out.println("Opcion invalida");
        }
}
