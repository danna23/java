/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author dana
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner  (System.in);
        float cantidad_d = 0;
        float valor_q = 0;
        float total_q;
        System.out.println("Programa para convertir de dolares a quetzales");
        System.out.println("Ingrese la cantidad en dolares");
        cantidad_d = ingresar.nextFloat();
        System.out.println("Ingrese el valor del dolar");
        valor_q = ingresar.nextFloat();
        total_q = cantidad_d * valor_q;
        System.out.println("El total en quetzales es de:."+ total_q);
         
   }
   else if (decision ==2);
   {
      System.out.println("Programa para convertir quetzales a dolares");
      System.out.println("Ingresa cantidad el valor del dolar");
      cantidad_d = ingresar.nextFloat();
      total = (cantidad_q/cantidad_d);
      System.out.println("La cantidad en dolares es de:"+ total);
       
   }
   else 
   {
       System.out.println("Opcion invalida");
   }
           
}
