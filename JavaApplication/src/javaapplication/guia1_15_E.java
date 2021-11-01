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
public class guia1_15_E {
//ejercicio 15 extra : Diseñe una función que pida el nombre y la edad de N personas e imprima los
//datos de las personas ingresadas por teclado e indique si son mayores o menores
//de edad. Después de cada persona, el programa debe preguntarle al usuario si
//quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
//“No”.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("           ||     Mayoria de edad( si/no):    || ");
        int mayoria=18;
        
        String opcion;
        
        System.out.println("ingrese la cantidad de personas que desea ingresar");
         int personas=leer.nextInt();
    
         int edad[]=new int[personas];
        
         String nombre;
        System.out.println("Complete todos los datos requeridos:");
        for (int i = 0; i < personas; i++) {
              
              System.out.println("Apellido/s y nombre/s: ");
              nombre = leer.next();
            
              System.out.println("Ingrese la edad : ");
              edad[i] = leer.nextInt();
                 if (edad[i]>mayoria){
                  System.out.println("La persona es mayor  de edad!!!");
                 }else{
                   System.out.println("La persona es menor de edad!!!");
            if (i<(int)(personas-1)){
                    System.out.println("Desea seguir mostrando personas? (Si/No)");
                 opcion = leer.next();
                
                if (opcion.equals("Si")) {
                    continue;
                }
                if (opcion.equals("No")) {
                    break;
                } 
                 }
                
            }    
        }
      
        System.out.println("                    FIN EL PROGRAMA!!!!!");
    }
    
}
