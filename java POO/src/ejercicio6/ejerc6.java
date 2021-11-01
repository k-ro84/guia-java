/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicio.CafeteraServicio;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Cafetera cafetera=new Cafetera();-----asi se llama la clase, ya no lo hago por que todas mis op estan en servicio
        
        CafeteraServicio cafetera=new CafeteraServicio();

//       
        cafetera.llenarCafetera();
      
        cafetera.servirTaza(0);//de esta manera en 0 le permito al usuario entrar un valor
        System.out.println("------");
        cafetera.servirTaza(0);
        System.out.println("------");
        cafetera.servirTaza(0);
        System.out.println("-------");
        cafetera.servirTaza(0);
        
        cafetera.vaciarCafetera();
        
        cafetera.agregarCafe();
        
       
             
    } 
    
}
