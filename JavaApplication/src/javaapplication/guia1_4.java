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
public class guia1_4 {
//   ejercicio 4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*lectura del scanner siempre aca*/
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("hola,nuevo proyecto!!!!"); 
        System.out.println("ingrese una palabra en minuscula a convertir");
        String cadena1= leer.next() ;
        
        System.out.println(cadena1.toUpperCase());
       
        System.out.println("ingrese una plabra en mayuscula a convertir");
        String cadena2= leer.next() ;
        
         System.out.println(cadena2.toLowerCase());
         
         /*AUN TENIENDO CARACTERES EN MINUS O MAYUSCULA EN EL MEDIO FUNCIONA*/
    }
    
}
