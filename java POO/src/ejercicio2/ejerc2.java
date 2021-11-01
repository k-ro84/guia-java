/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.circunferencia;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
          circunferencia circulo= new circunferencia();
          
         System.out.println(" Ingrese el tamaño de su radio");
         double radio=leer.nextDouble();
        
         circulo=new circunferencia(radio);
  
        System.out.println("el area de la circunferencia es : "  + circulo.area());
        System.out.println("el perimetro de la circunferencia es  : "  + circulo.perimetro()); 
    }
    
}
