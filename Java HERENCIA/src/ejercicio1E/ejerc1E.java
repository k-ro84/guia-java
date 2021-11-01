/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E;

import ejercicio1E.entidades.Alquiler;
import ejercicio1E.entidades.Barco;
import ejercicio1E.servicio.alquilerServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Alquiler al= new Alquiler();
        Barco barc= new Barco();
        
       alquilerServicio sa = new alquilerServicio();
        sa.creaPuerto();
         
        al.embarcadero();
    } 
    
}
