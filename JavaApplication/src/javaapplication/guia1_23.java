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
public class guia1_23 {
//ejercicio 23 : Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
//pida al usuario un numero a buscar en el vector. El programa mostrará donde se
//encuentra el numero y si se encuentra repetido

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  vectores y matrices:determinar tamaño ,no valores ");
        
        int N,posicion,cont=0;
        
        System.out.println("              bienvenidx al vector: ");
       
        System.out.println("ingrese el tamaño de su vector/arreglo :");
         N=leer.nextInt();  
         
         int vector[]= new int[N];
         
         
        for(int i=0;i<N;i++){
            vector[i]=(int)(Math.random()*50+0);
            System.out.println("arreglo["+i+"]  -->  "+ "[" +vector[i]+"]");
        }
        System.out.println(" Ingrese un numero a buscar dentro del vector :");
        posicion=leer.nextInt(); //debe ir vacio, si coloco NO ME DEJA AVANZAR PERO NO ME LARGA LA POSCION DEL ARRGELO BUSCADO
        for(int i=0;i<vector.length;i++){
            if (vector[i]==posicion){
                cont+=1;
                System.out.println(" El numero ingresado " +posicion+ " se encuentro : " +cont+ " veces ");
                System.out.println(" Y se encontro en la posicion : "  +i);
                break;
            }else{
                
               System.out.println("numero no encontrado");
                break;
               //preguntar como hacerlo con boolean;
               
            }
        }
            
    }
    
}
