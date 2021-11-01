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
public class guia1_5 {
//   ejercicio 5 : Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Bienvenido al conversor de temperatura :");
       
        double F,C ;
        
        System.out.println("Ingrese los grados a convertir :");
        
        C = leer.nextDouble();
        
        F= 32 + 9* C/5 ;
        
        System.out.println( C + " Grados Celsius  equivalen a " + F + "grados Farhrenheit" );
        
    }
    
    
}
