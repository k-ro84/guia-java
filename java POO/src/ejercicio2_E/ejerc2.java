/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_E;

import ejercicio2_E.entidades.Puntos;
import ejercicio2_E.servicio.puntosServicio;
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
   
        puntosServicio p= new puntosServicio();
       
         Puntos p1=p.crearPuntos();
        p.calcularDist(p1);
       
        
        //ej 3,2/7,8=7,...--- 100,100/200,200=141,.....
    }
    
}

