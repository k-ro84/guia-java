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
public class guia1_3 {
/*ejercicio 3 : Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla./*
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*para que ejecute solo este cliquear derecho y poner run file*/
         Scanner leer;
        leer = new Scanner(System.in).useDelimiter("\n");
         
          System.out.println("Hola, empiece a trabajar!!!!");
        System.out.println("ingrese su nombre completo : ");
        String palabras= leer.next();
                
                System.out.println(" Nombre completo : "+ palabras);
    }
    
}
