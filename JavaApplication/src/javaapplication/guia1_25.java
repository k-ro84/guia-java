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
public class guia1_25 {
//ejercicio 25 : Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
//muestre traspuesta. ¿Que es una matriz traspuesta?
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("                     llenado de matrices!!!!!!         ");
        
        System.out.println("        Matriz traspuesta (llenado aleatorio) :       ");
        
        int Matriz[][]=new int[4][4];  /// recordar aca se llena i , j
        
        // se hace en tres pasos:
        
          for(int i=0;i<4;i++){    ///aca se llena de forma aleatoria
             for(int j=0;j<4;j++){
             Matriz[i][j]=(int)(Math.random()*20+0);// tambien existe otra forma de llenado aleatorio
             }
             
          }
         System.out.println("la matriz quedo armada asi : ");// aca se arma y se muestra
         for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 System.out.print("["  +Matriz [i][j]+  "]" + "  " );// el espaciado final es para separar cada subindice
             }
             System.out.println("");  // salto de linea sino pone todo en una sola columna
          }
         System.out.println("la matriz traspuesta se ve asi : ");// aca se arama la traspuesta
          for(int i=0;i<4;i++){
             for(int j=0;j<4;j++){
                 System.out.print("["  +Matriz [j][i]+  "]" +  "  " );
             }
             System.out.println("");    // salto de linea sino pone todo en una sola columna
          }
          System.out.println("");
    }
    
}
