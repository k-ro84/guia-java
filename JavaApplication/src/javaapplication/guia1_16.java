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
public class guia1_16 {
//ejercicio 16: Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
//salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
//deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
//número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" sumas con diferencias ");
        
        double num;
        double suma =0;
        int cont=0;
        
        while(cont<20){
          cont+=1;//ya que el cero no me lo va a tomar
          System.out.println("introduzca un numero");
           num=leer.nextDouble();
           if(num==0) {
               System.out.println("se capturo el cero");
               break;//corta en cero
           }else{
             if(num>0) { //no cuenta los negativos
                 suma+=num;
             }
           }    
           
         }        
           
         System.out.println("la suma de sus valores es : " + suma);  
            suma=leer.nextDouble();     //pido por fuera sino no me deja proceder       
        
       
        
                
     
           
    }
    
}
