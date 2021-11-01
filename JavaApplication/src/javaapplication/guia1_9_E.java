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
public class guia1_9_E {
//ejercicio 9 extra: Simular la división usando solamente restas. Dados dos números enteros mayores
//que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
//restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
//que el divisor, este resultado es el residuo, y el número de restas realizadas es el
//cociente. Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //el scanner leer no se utiliza aca por que no toma la busqueda sino hasta la funcion
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  division sucesiva(restas):");
        
         int divisor=0;
         int dividendo=0;
         double resto=0;
         double cociente=0;
         
         
         RestaSucesiva( dividendo,divisor,cociente);
    }    
    public static void RestaSucesiva(int dividendo, int divisor, double cociente){
   
        
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese un valor para su dividendo");
        dividendo=leer.nextInt();
        
         System.out.println("ingrese un valor para el divisor(debe ser menor a su dividendo)");
        divisor=leer.nextInt();
        
        while(dividendo>=divisor){
            dividendo=dividendo-divisor;
            cociente+=1;
            
        }
         System.out.println("el resto es : " +dividendo);  
         System.out.println("el cociente es "+ cociente);
     
        return;
    
    }
    
}
//
//       2:solo da el resultado final
//
//        int cont=0;
//        
//   
//   
//        System.out.println("ingrese un valor para su dividendo");
//        dividendo=leer.nextInt();
//        
//         System.out.println("ingrese un valor para el divisor(debe ser menor a su dividendo)");
//        divisor=leer.nextInt();
//        
//        dividendo=dividendo-divisor;
//        
//        while(dividendo>=0){
//            cont=cont+1;
//            dividendo=dividendo-divisor; 
//        }
//        System.out.println("la division es igual a: "+cont);