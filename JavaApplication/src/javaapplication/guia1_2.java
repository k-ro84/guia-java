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
public class guia1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer;
        leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("hola, empiece a trabajar");
        System.out.println("ingrese dos numeros enteros");
        int num=leer.nextInt();       
        int num2=leer.nextInt();
        /*modo simple */
        
       /* modo con variables
        int suma=num+num2;
        System.out.printIn("suma:  "+suma); estoy invocando la suma */
        
        System.out.println("suma: "+ (num+num2));
        
        
    }
    
}
