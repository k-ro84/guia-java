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
public class guia1_12_E {
//ej 12 extra: Crear un programa que dibuje una escalera de números, donde cada línea de
//números comience en uno y termine en el número de la línea. Solicitar la altura de
//la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" bienvenidx ");
        
        int escalones;
         System.out.println("ingrese el numero de escalones :");
         escalones=leer.nextInt();
         
         for (int i=1;i<=escalones; i++){
             System.out.println(""); //ln para salto de linea
             for(int j=1;j<=i; j++){
                 System.out.print(j);//mismo de recien si no hago esto de sacar in pone todo en columna
             }
         }
        System.out.println("");
        System.out.println("esta es su escalera!!!!");
        
        
    }
    
}
