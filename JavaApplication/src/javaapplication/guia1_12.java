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
public class guia1_12 {
//ejercicio 12 : Considera que estás desarrollando una web para una empresa que fabrica motores
//(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
//Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
//El programa debe mostrar lo siguiente:
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in);
        System.out.println(" vamos terminando la parte simple de bucles :  ");
       
        
        System.out.println("bienvenido, interesado en comprar una bomba?, siga las instrucciones a continuacion :");
        System.out.println("ingrese un valor del 1 al 4 segun el tipo de motor de que desea : ");
        
       int tipo_de_motor=leer.nextInt();
      
       
       switch (tipo_de_motor){
               case 1 :
                   System.out.println(" La bomba es una bomba de agua ");
                   break;
               case 2 :
                   System.out.println(" La bomba es una bomba de gasolina ");
                   break;
               case 3 :
                   System.out.println(" La bomba es una bomba de hormigón ");
                   break;
               case 4 :
                   System.out.println(" La bomba es una bomba de pasta alimenticia ");
                   break;
               default :
                   System.out.println(" No exite un valor valido para tipo de bomba ");
               
       }

//if(tipo_de_motor ==1)
//            System.out.println(" La bomba es una bomba de agua ");
//else if(tipo_de_motor==2)
//            System.out.println(" La bomba es una bomba de gasolina ");
//else if(tipo_de_motor==3)
//            System.out.println(" La bomba es una bomba de hormigón ");
//else if(tipo_de_motor==4)
//            System.out.println(" La bomba es una bomba de pasta alimenticia ");
//else 
//            System.out.println(" No exite un valor valido para tipo de bomba ");
    }
    
}
