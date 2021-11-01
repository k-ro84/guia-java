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
public class guia1_9 {
//ejercicio 9 : Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
//investigar la función equals() en Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" lista para seguir trabajando???? ");
        
        String clave="";

        System.out.println(" Ingrese su palabra clave ");
        clave=leer.next();/* si es clave y contraseña se piden por separado bajo estos terminos*/
        
        if (clave.equals("eureka") )/* si es clave y cotraseña se compara todo en la misma linea*/
            System.out.println(" CORRECTO ");
        else
            System.out.println(" INCORRECTO ");
        
            
       System.out.println(" recuerde nunca dar su clave a un extraño, ADIOS ");
       
       
    }
    
}
