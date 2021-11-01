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
public class guia1_6 {
//   ejercicio 6 : Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("bienvenido a su nuevo ejercicio : ");
        
        int num ;
         int num_doble ;
         int num_triple ;
        int sqrt;
        
        System.out.println("Ingrese un numero tipo entero y calculare su doble, triple y hasta su raiz cuadrada!!!");
       
        num = leer.nextInt();
        
         num_doble= num * 2 ;
         num_triple=num * 3 ;
        
        System.out.println("el doble de su numero es : " + num_doble);
        
        System.out.println("el triple de su numero es : " + num_triple);
        
        System.out.println("la raiz cuadrada de su numero es : " + Math.sqrt(num));
        
    }
        
    
}
