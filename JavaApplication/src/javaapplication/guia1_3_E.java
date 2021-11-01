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
public class guia1_3_E {
//ejercicio 3 extra:. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
//vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
//clase String. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("      búsqueda        ");
        
        String letra;
        String vocal;
       
       
        System.out.println("Puede ingresar una letra : ");
       letra = leer.next().toLowerCase();
       
         if (letra.equals("a")){   
            System.out.println("Ingreso la vocal :  A");  //ingreese el ejercicio 11 para probarlo
//            System.out.println(" ingrese una palabra o frase que inicie con la vocal A,a");
//           String palabra=leer.next();
//           String primerletra =palabra.substring(0,1);
//           
//           if (primerletra.toUpperCase().equals("A"))
//               System.out.println("bien, su palabra empieza con A");
//           else
//               System.out.println("su palabra no empieza con A"); 
                   
         }else if (letra.equals("e")){
            System.out.println("ingreso la vocal :  E"); 
         }else if (letra.equals("i")){
            System.out.println("Ingreso la vocal :  I");     
         }else if (letra.equals("o")){
            System.out.println("Ingreso la vocal :  O"); 
         }else if (letra.equals("u")){
            System.out.println("Ingreso la vocal :  U");   
         }else{
            System.out.println("El caracter ingresado no es una vocal");
       }
    
    
    }
    
}
//           2: segunda forma de hacerlo!!!
//
//    switch (letra) {
//            case "a":
//                System.out.println("ingreso la vocal A");
//                break;
//            case "e":
//                System.out.println("ingreso la vocal E");
//                break;
//            case "i":
//                System.out.println("ingreso la vocal I");
//                break;
//            case "o":
//                System.out.println("ingreso la vocal O");
//                break;
//            case "u":
//                System.out.println("ingreso la vocal U");
//                break;
//            default:
//                System.out.println("el caracter ingresado no es una vocal");
//                break;
//        }