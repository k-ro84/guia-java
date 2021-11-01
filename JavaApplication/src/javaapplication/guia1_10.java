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
public class guia1_10 {

    
//ejercicio 10 : Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("              Manos a la obra !!!!           ");
       
        String cadena1="";
        
        
        System.out.println(" Introduzca una palabra de 8 caracteres : ");
        cadena1=leer.next();
        int longitudP = cadena1.length();
        
        if (longitudP==8)
            System.out.println("    CORRECTO    ");
        else
            System.out.println("    INCORRECTO   ");
        
        
       /* boolean cond;    SE PUEDE CREAR SOLO APENAS DOY LA INSTRUCIION DE COND TRUE O FALSE
         if (longitudP==8)
            cond =true;
        else
            cond= false;
        
        if (cond)
            System.out.println(" CORRECTO ");
        else
            System.out.println(" INCORRECTO ");*/
        
        
    }
    
    
}
