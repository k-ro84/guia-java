/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;
/**
 *
 * @author K-RITO
 */
public class guia1_16_E {
//ejercicio 16 extra : Crea una aplicación que nos pida un número por teclado y con una función se lo
//pasamos por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, 
//ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*num primos:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97. */
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("           ||             NUMEROS PRIMOS           || ");
        
         int numero;
         
        System.out.println("Ingrese un numero : ");
        numero = leer.nextInt();
        
        leer.close();
  
        if(numprimo(numero)){
            System.out.println("el numero :  " +numero+ " es un numero primo.");
        }else{
            System.out.println("el numero :  " +numero+ " no es un numero primo.");
        }
        System.out.println("");
        
    }
     public static boolean numprimo(int numero) {
         
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont += 1;
            }
        }
        if (cont != 2) {
            return false;
        } else {
            return true;
        }
     }
}
