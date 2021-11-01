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
public class guia1_8 {
//ejercicio 8 : Crear un programa que dado un numero determine si es par o impar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("    Hola de nuevo !!! ");
        int num ;
        
        System.out.println(" Ingrese un numero entero ");
        
        num =leer.nextInt();
        
        if( num % 2 == 0) 
            System.out.println( num + " el numero ingresado " + num + " es par ");
        else
            System.out.println( " el numero ingresado " + num + " es impar " );
    }
    
}
