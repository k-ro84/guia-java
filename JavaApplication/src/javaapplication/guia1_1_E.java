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
public class guia1_1_E {
//ejercicio 1 extra: Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
//el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
//horas.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  tiempo ");
        /*dia=24 horas ---------        /*dia=24 horas --------- en un dia hay 1440 minutos*/

        /*hora=60 minutos                                   */
        
        int minutos;
        int horas;
        int dias;
//        int segundos;   tendria que cambiar y mepzar comparadnno seg= 60 min; =3600hr;=86400 dia
        
        System.out.println(" ingrese en minutos el tiempo a calcular");
        minutos=leer.nextInt();
   
        dias=minutos/1440;
        horas=minutos/60-dias*24;
        minutos=minutos-horas*60-dias*1440;
        
        System.out.println("Los minutos ingresados equivalen a: "+dias +"dia/as: "+horas +"hora/as: "  +minutos +"minuto/os");   
                
    }
    
    
}
