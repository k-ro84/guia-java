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
public class guia1_19_E {
//ejercicio 19 extra: Crear una función rellene un vector con números aleatorios, pasándole un arreglo
//por parámetro. Después haremos otra función o procedimiento que imprima el
//vector.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("           ||  vector-arreglo  || ");
        
        int[] vector=new int[9];
                     
             llenar(vector);
           
             imprimir(vector); 
    }
   
    public static void llenar(int[]vector) {
         for (int i = 0; i < 9; i++) {
            vector[i]=(int)(Math.random()*15+0);
        }
       return;
    }

     public static void imprimir(int[] vector) {
        
        for (int i = 0; i < 9; i++) {
            if (i < (int) (10-1)) {
                System.out.print("[" +vector[i]+ "]");
            } else {
                System.out.print(vector[i]);
            }  
        }
         System.out.println("");
         
       return; 
    }    

}
