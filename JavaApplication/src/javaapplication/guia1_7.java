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
public class guia1_7 {
//  ejecicio 7 :  Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Hola, a continuacion se dara la instruccion a seguir :  ");
       
        int num1 ;
        int num2 ;
        
        
        System.out.println(" Ingrese dos numeros tipo entero y determinaremos cual es mayor");
        
        System.out.println(" Ingrese el Primer numero : ");
        
        num1 = leer.nextInt();
        
        System.out.println(" Ingrese el segundo numero : ");
        
        num2 = leer.nextInt();
        
        if(num1>num2)
            System.out.println( num1 + " es mayor que " + num2 );
        else 
            System.out.println( num2 + " es mayor que " + num1 );
        
        System.out.println("       Es todo por ahora         ");
   }
    
}
