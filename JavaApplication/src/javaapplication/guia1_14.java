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
public class guia1_14 {
//ejercicio 14 : Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        
        int suma = 0;
        System.out.println(" hola de nuevo :");
       System.out.println("ingrese un valor a su limite maximo, recuerde debe ser un numero positivo :");
           int lim_positivo=leer.nextInt(); 
           
            System.out.println(" Ingrese  el primer numero"); 
           int num =leer.nextInt();
        
            
           suma+=num;
           if   (num > lim_positivo){
              while(num>lim_positivo){
               System.out.println("ingrese un numero, menor a su limite  maximo : " + lim_positivo);
               num=leer.nextInt();
           }
           }  else{

               if (suma>= lim_positivo){
                   System.out.println(" La suma de sus valores es : " + suma);
               } else{
                   while(suma<lim_positivo){
                     System.out.println("Por favor ,ingrese otro numero ");
                    num=leer.nextInt();
                    suma+= num;

                    }
                    
            } 
        } 
     System.out.println(" la suma de todos sus valores es . " + suma);
        suma=leer.nextInt();   
    }
   
}
    
    
 
