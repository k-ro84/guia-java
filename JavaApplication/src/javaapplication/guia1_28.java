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
public class guia1_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  huesped(version profesores ) ");
        
        int[][] matrizM =
          {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
          {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, 
          {56, 78, 87,90, 9, 90, 17, 12, 87, 67},
          {41,87, 24, 56, 97, 74, 87, 42, 64, 35},
          {32, 76,79, 1, 36, 5, 67, 96, 12, 11},
          {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
          {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
          {98, 45, 34, 23, 32, 56, 74, 16, 19, 1}, 
          {24, 67, 97, 46, 87, 13, 67, 89, 93, 24} ,
          {21, 68, 78, 98, 90, 67, 12, 41, 65, 12 }};
        
         int[][] matrizP ={{ 36, 5, 67}, {89, 90, 75}, {14, 22, 26} };
         
         
         System.out.println("primer matriz: matriz de busqueda");
         System.out.println("");
           for (int i = 0; i <matrizM.length; i++) {
               for (int j = 0; j < matrizM.length; j++) {
                    System.out.print("["+matrizM[i][j]+"]");
               } 
               System.out.println("");
           }
           System.out.println("");
            System.out.println("segunda matriz: matriz a buscar");
            for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP.length; l++) {
                        System.out.print("["+matrizP[k][l]+"]");
                 }  
                System.out.println("");
           }   
         encontrarP(matrizM,matrizP);
    }
    
    public static void encontrarP(int[][]matrizM, int[][]matrizP){
        
        boolean aux=true;
        
        for (int i = 0; i <matrizM.length-2; i++) {//hasta posicion 7 ya que necesita 3 num en la fila(3x3)
            for (int j = 0; j < matrizM.length-2; j++) {
                
                aux=true;
                for (int k = 0; k < matrizP.length; k++) {
                    for (int l = 0; l < matrizP.length; l++) {
                       if( matrizM[i+k][j+l]!= matrizP[k][l]){
                           //comprobar si esa posicon de m es distinta de la k ,l de P
                        //va paso a paso con cada inicio y comparando
                        //en cuanto una es diferente a lo que buscas cortamos  seguimos con nueva busqueda
                          aux=false;
                          
                       }
                    }
                }
                if(aux){
                   
                    System.out.println("matriz encontrada con inicio en fila:" +i+  " y columna"   +j  );
                    return; //aca funciona de corte, no como retornno de resultado
                }
            }
        }
        System.out.println("  matriz M no encontrada!!!");// va fuera si no larepite jnton al codigo anterior
    }
}
