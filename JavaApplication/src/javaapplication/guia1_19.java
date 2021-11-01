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
public class guia1_19 {
//ejercicio 19 : Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
//si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" cuadrado");
        
        
        System.out.println("por favor ingrese el tamaño de cuadrado");
        int num=leer.nextInt();
        
        if (num>=0 && num<= 50){
            for(int i = 0; i < num; i++) {
                System.out.print(" * ");  //printIn escribe todo en linea, salto de linea en pseint
            }
            System.out.println();//salto de linea para hacer el espaciado ele-ene
            
            for(int i=0; i<num-2;i++){
                System.out.print(" * ");
                for(int j=0; j<num-2;j++){
                    System.out.print("   ");
                }
                System.out.println(" * ");//salto de linea para la parte baja
            }
            for(int i=0; i<num; i++) {
                System.out.print(" * ");
            }
        }
        System.out.println("");
    }
    
}
//
//                2: segunda forma con for( con if)
//
//       int num,num2,num3;
//        System.out.println("ingrese un valor ");
//        num=leer.nextInt();//num=4
//        
//         for (int i = 1; i<=num;i++ ) { 
//             
//            for (int j = 1; j <=num;j++ ) {
//                if((i>1 && i<num) && (j>1 && j<num)){
//                
//                             System.out.print("  ");
//                             
//                                                                       
//                        }else
//                    System.out.print("* ");
//            } 
//            System.out.println("");
//            
//            }
  
