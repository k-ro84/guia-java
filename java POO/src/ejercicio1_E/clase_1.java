/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_E;

import ejercicio1_E.entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class clase_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         
        System.out.println("playlist");
        System.out.println("Primer cancion");
        Cancion cancion=new Cancion( "interprete :within temptation",
         "cancion : ice queen");//trae entidades
        System.out.println(cancion.getCancion());
        System.out.println(cancion.getAutor());
        
        System.out.println("siguiente cancion:");
        cancion.setCancion("cancion :500 letters");//cambio los datos a partir de los parametrso creados
        cancion.setAutor("interprete: Tarja Turunen");//con get redefino y con get largo los nuevos datos
        System.out.println(cancion.getCancion());
        System.out.println(cancion.getAutor());
        
        System.out.println("siguiente cancion:");
        cancion.setCancion("cancion :Nemo");
        cancion.setAutor("interprete: Nightwish");
        System.out.println(cancion.getCancion());
        System.out.println(cancion.getAutor());
    }
    
}
