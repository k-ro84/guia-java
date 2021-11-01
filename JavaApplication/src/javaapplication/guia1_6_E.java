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
public class guia1_6_E {
//ejercicio 6 extra :Leer la altura de N personas y determinar el promedio de estaturas que se
//encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("    altura promedio (no apto para claudias)    ");
       
        double alturas=0;
        int personas ;
        double promedioAltura=0;
        int cont=0;
        double media= 1.60;
        double promedioMedia=0;
        double suma=0;
        while(true){
            System.out.println("Ingrese el total de personas de la muestra");
             personas=leer.nextInt();
            
            if(personas>0){
                
                for(int i=0;i<personas;i++){
                    
                     System.out.println(" ingrese la altura de cada persona :"  +i);
                 alturas=leer.nextDouble();
                 
                 if(personas>0){
                      cont+=1;
                    suma+=alturas;
                     promedioAltura=suma/cont;//si lo divido de las ersonas me saca un promedio que no corresp
                  } 
                 if(alturas <1.6){
                     cont+=1;
                     suma+=alturas;
                  promedioMedia=suma/cont;// cuenta todas las alturas
                }
      
                }
               System.out. println("el promedio de altura de las personas de la muestra es : "+ promedioAltura);
                System.out.println("el promedio de las personas de menos de 1,60 es de :"+promedioMedia);
               break; 
            }else{
                System.out.println("cantidad incorrecta de peronas"
                + "intentelo nuevamente");
             
            } 

            
        }
   
    }
    
}
