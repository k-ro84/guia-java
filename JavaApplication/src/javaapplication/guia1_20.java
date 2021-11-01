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
public class guia1_20 {
//ejercicio 20: Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
//número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" numeros y asteriscos ");
        
        
         int num ;
         String cadena;   
            
            for(int i = 0; i < 4; i++) { //me limita el ingreso a 4 numeros
                 System.out.print(" ingrese un numero : ");
                 num=leer.nextInt();
                
             while(num>20){
                 System.out.println("ingrese un numero entre 1 y 20!!!!"); //me limita el valor de los numeros
                 num=leer.nextInt();
             }
             cadena="";//aca toma el numero
             for (int j = 0; j<num; j++){

                   cadena+="*"; //le agraga *

            }
             System.out.print(num + " : "+ cadena);
                System.out.println(" ");
     
            }    
    }
    
}
//
//             2:segunda forma (con for e if)
//
//        int num,num2,num3,num4;
//        System.out.println("ingrese un valor ");
//        num=leer.nextInt();
//        System.out.println("ingrese un valor ");
//        num2=leer.nextInt();
//        System.out.println("ingrese un valor ");
//        num3=leer.nextInt();
//        System.out.println("ingrese un valor ");
//        num4=leer.nextInt();
//         System.out.println("");
//         System.out.println("");
//        //primer numero
//        if(num>0 && num<20){//&& (num2>0 && num2<20)&& (num3>0 && num3<20)&& (num4>0 && num4<20))
//            System.out.print(num+ " ");
//        for (int i=0;i<num;i++)
//            System.out.print( " *");
//            System.out.println("");
//    } else {
//      System.out.println("error,numero fuera de rango");
//      //segundo numero
//        }
//      if(num2>0 && num2<20){//&& (num3>0 && num3<20)&& (num4>0 && num4<20))
//            System.out.print(num2+ " ");
//        for (int i=0;i<num2;i++)
//            System.out.print( " *");
//            System.out.println("");
//            
//    } else {
//      System.out.println("error,numero fuera de rango"); 
//      }
//      //tercer numero
//      if(num3>0 && num3<20){//&& (num4>0 && num4<20))
//            System.out.print(num3+ " ");
//        for (int i=0;i<num3;i++)
//            System.out.print( " *");
//            System.out.println("");
//            
//    } else {
//      System.out.println("error,numero fuera de rango"); 
//      }
//      //cuarto numero
//      
//      if(num4>0 && num4<20){
//            System.out.print(num4+ " ");
//        for (int i=0;i<num4;i++)
//            System.out.print( " *");
//            System.out.println("");
//            
//    } else {
//      System.out.println("error,numero fuera de rango"); 
//      }