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
public class guiia1_23_E {
//ejercicio 23 extra: Realizar un programa que complete un vector con los N primeros números de la
//sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de
//los siguientes números:
//1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" SERIE FIBONACCI ");
       
       
        int a = 1, b = 0, c=0, n;
       
        System.out.print("Por favor ingrese cantidad de elmentos para la serie: ");
        n = leer.nextInt();
       
        for (int i = 0; i < n; i++) {
           
            b=c;
            c = a + b;
            a=b;
            System.out.println(c);
        }
    }
    
}
