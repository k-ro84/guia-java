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
public class guia1_21_E {
//ejercicio 21 extra. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
//y muestre la suma de sus elementos.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" matriz N x M ");
        int N;
        int M;
        int suma=0;
        int cont=0;
         
         System.out.println("ingrese la cantidad de filas");
          N=leer.nextInt();
        System.out.println("ingrese la cantidad de columnas");
          M=leer.nextInt();
          
         int matriz[][]=new int[N][M];
         
        relleno( matriz, N, M);//no ingresar los indices de vectores, ya estan tomados
        
        sumar(matriz, N, M);
        
        
        
    }
     public static void relleno(int matriz[][], int N, int M) {
         for(int i=0;i<N;i++){
           for(int j=0;j<M;j++) {
               matriz[i][j]=(int)(Math.random()*15+0);
            }
        }
                System.out.println(" su matriz :");
        for(int i=0;i<N;i++){
           for(int j=0;j<M;j++) {
             
               System.out.print("[" +  matriz[i][j]+ "]");
            }
            System.out.println("");
        }
        return ;
        
        
     }
     
     public static void sumar(int matriz[][], int N, int M) {
         double suma=0;
         
         for(int i=0;i<N;i++){
           for(int j=0;j<M;j++) {
             
               suma+=matriz[i][j];
               
               System.out.println("la suma es : "+suma);
            }
            System.out.println("");
        }   
     }
    
}
