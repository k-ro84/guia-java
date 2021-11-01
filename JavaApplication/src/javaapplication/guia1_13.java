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
public class guia1_13 {
//ejercicio 13: bucles__Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        int nota;
        System.out.println("      Bienvenida a bucles !!!     ");
        
        do {
            System.out.println(" Califique la atencion recibida de 1 a 10 ");
        nota = leer.nextInt();
        
        } while(nota<0|| nota>10);
               System.out.println(" La nota ingresada es " + nota);
         
        leer.close();
    }
    
}
