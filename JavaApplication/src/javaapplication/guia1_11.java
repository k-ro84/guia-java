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
public class guia1_11 {
//EJERCICIO 11 : Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
//frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
//pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
//“INCORRECTO”. Nota: investigar la función Substring y equals() de Java
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  A seguir trabajando!!! :  ");
        
  
        System.out.println(" ingrese una palabra o frase que inicie con la vocal A,a");
        String palabra=leer.next();
      
        String primerletra =palabra.substring(0,1);
        
//        boolean cond;
//        
//       if (primerletra.toUpperCase().equals("A"))
//            cond =true;
//        else
//            cond= false;
//       
//       if(cond)
//            System.out.println(" CORRECTO ");
//       else
//            System.out.println(" INCORRECTO ");
       
        
       if (primerletra.toUpperCase().equals("A"))
            System.out.println("correcto");
       else
            System.out.println("incorreecto");      
         
        
    }
    
}
