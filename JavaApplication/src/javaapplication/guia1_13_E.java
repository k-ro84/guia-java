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
public class guia1_13_E {
//ejercicio 13 extra : Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
//cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
//cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
//todas las familias.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" familias y media de las edades:  ");
        
        int familias;
        int hijos=0; 
        int totaldehijxs=0;//cont
        double media;
        double edad=0;
        
        System.out.println("ingrese la cantidad de familias de su encuesta:");
        familias=leer.nextInt();
        
        for (int i = 0; i < familias; i++) {
            System.out.println("Ingrese la cantidad de hijos que tiene la familia");
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad de su hijxs " + (int) (j + 1));
                edad += leer.nextInt();
                totaldehijxs += 1;//cant hjos es el cont
            }
        }
        media = Math.round(edad / totaldehijxs);//para devolver el valor redondo mas cercano a ese double
        System.out.println("La media de la edad de todos los hijxs es de " + (int) media);
        leer.close();
           //se podria hacer en dos funciones pro separado,una pide la cantidad de hijos y la otra realiza el promedio   
    }
    
}
