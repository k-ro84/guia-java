/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author K-RITO
 */
public class guia1_22 {
//ejercicio 22 : Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
//los muestre por pantalla en orden descendente.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  vectores y matrices  ");
        
        //todo vector se inicializa en cero        
        int vector[]= new int [100];//new las construye en memoria
        
        
         Arrays.sort(vector);//sirve para la segunda forma orden del vector de menor a mayor, no esta funcioanndo en los num
         System.out.println("         Ordenando un vector aleatorio en forma decreciente :");
         
         /* asi muestra el vector de la forma en que empieza sin diferenciar menor o mayor*/
//        for( int i=0;i<=99;i++){  //99 ya que empieza en 0
//             vector[i]=(int)(Math.random()*100+0);// el primero es el numero final de arreglo el seguundo donde quiero que empiece a contar
//                                        //puedo definir los numeros a ingresar dentro del vector antes o pedirlos
//            System.out.println("arreglo["+i+"]---->"+ "[" +vector[i]+"]");
            
            for(int i=vector.length-1;i>=0;i--){  
               vector[i]=(int)(Math.random()*100+0);
                System.out.println("arreglo["+i+"]---->"+ "[" +vector[i]+"]");
   
        }
        System.out.println("");
    }
     
}
//       2:    forma
//
//
//         int [] vector;
//        vector= new int[100];
//
//
//                for (int i = 99; i >= 0; i--) {
//                vector[i]=i;
//                System.out.println("[" +vector[i]+"]");
//                }