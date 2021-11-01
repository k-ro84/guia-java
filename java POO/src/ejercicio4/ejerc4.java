/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Rectangulo rectangulo=new Rectangulo();
        
        rectangulo.cargarValores();
        
        System.out.println("la base es de : " +rectangulo.getBase());
        System.out.println("la altura es :" +rectangulo.getAltura());
      
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro()); 
        
        System.out.println("su rectangulo se ve asi :");
        rectangulo.dibujarRectangulo();
    }
    
}
