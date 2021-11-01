/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Libro;
import java.util.Scanner;



/**
 *
 * @author K-RITO
 */
public class clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println(" Libro actual en biblioteca :");
         Libro libro1= new Libro("18272728","establo", "ulises",230);
         //si quiero que me lo muestre tengo que pedirlo desde la entidad
         System.out.println("-------------------------------");
         System.out.println(" Libro actual en biblioteca :");
          Libro libro2= new Libro("30039303","paralelo", "isidro garcia",304);
         System.out.println("-------------------------------");
         System.out.println(" Ingrese otro libro :");
         
         libro1.cargarLibro();
         System.out.println("--------------------------------");
         System.out.println(" Usted ingreso el libro: ");
         libro1.mostrarLibro();
         
        
    }
    
}
