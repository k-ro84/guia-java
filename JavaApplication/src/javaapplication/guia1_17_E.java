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
public class guia1_17_E {
// ejercio 17. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
//tamaño N, con los valores ingresados por el usuario.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("       vector  :suma de sus posiciones     ");
        
        int num;
        int suma=0;
        int n;
       
        System.out.println(" Ingrese el tamaño de su vector : ");
          n=leer.nextInt();
         int [] vector= new int [n];
      
    
        for(int i=0;i<n;i++){
            System.out.println(" Ingrese el valor del vector en la posicion : [" +i+ "]");
              vector[i]=leer.nextInt(); // se ingresa en el vector por eso se lee el i del vector
             suma+=vector[i];
            
        }

     System.out.println("    La suma de sus valores es  : "+ suma);
    
    }
    
}
