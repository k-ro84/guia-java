/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.servicio;

import ejercicio10.entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author K-RITO
 */
public class arregloServicio {
    
    Scanner leer = new Scanner(System.in);
  
         private double[] vectorA= new double[50];
         private double[] vectorB= new double[20];
         Arreglo vector=new Arreglo();
         //este vector es el arreglo renombrado de la clase 
         public void crearArreglo(){
              for (int i = 0; i < vectorA.length; i++) {
		vectorA[i] = Math.round(Math.random() * 100+0);
              // System.out.println("[" + vectorA[i] +"]");  no pide mostrar el vector armado
             }
         }
         
  
        public void ordenarArreglo (){
           Arrays.sort(vectorA);//ordena el vector
           System.out.println(" VectorA en forma ordenada se ve asi: ");//mostrar arreglo
          for (int i = 0; i < vectorA.length; i++) {
             System.out.print("[" + vectorA[i] + " ]");
          }  
        }
        
         //llenar arreglo b
         public void crearVectorB(){
         
          for (int i = 0; i < 20; i++) {
             if(i<10){   //si i hasta el num9 copiar los valores de a
                 vectorB[i]=vectorA[i];
             }
             if(i>=10 && i<20){//los valores entre 10 y 20 se redefinen
                 vectorB[i]=0.5;
             } 
          } 
            System.out.println("");
         } 
         //mostrar arreglo b
         public void MostrarB(){
             System.out.println(" VectorB :");
              for (int i = 0; i < vectorB.length; i++) {
            
             System.out.print("[" + vectorB[i] + " ]");//mestar el vector por pantalla
          }
              System.out.println("");//salto de linea 
         }
   
}
