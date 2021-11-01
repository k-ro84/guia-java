/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.RevolverDeAgua;
import ejercicio2.servicio.JuegoServicio;
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
        
        JuegoServicio splash= new JuegoServicio();
         RevolverDeAgua pum=new RevolverDeAgua();
         
        
        splash.llenarJuego();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        splash.mostrarJugadores();
         System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        splash.tamanioPlanilla();
         System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        pum.disparar();
        pum.siguienteChorro();
        splash.ronda();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
       
       //splash.mostrarJugadores();  
       splash.muestraJugadores();
        // splash.finJuego();
        
        
        
        
        
        
        
        

        //        while( !splash.finJuego() ){
        //            splash.ronda();            
        //            //splash.rondaV2();
        //        }
        //         
        //        System.out.println("El juego ha terminado");
    }
    
}
