/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E.servicio;

import ejercicio2E.entidades.Asientos;
import ejercicio2E.entidades.Cine;
import ejercicio2E.entidades.Espectador;
import ejercicio2E.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CineServicio {
    
    Scanner leer;
    private Asientos asientos[][];
    private double precio;
    private Pelicula pelicula;
    private int filas ,columnas;
   
    /*Constructor*/
    public CineServicio() {
       
        this.leer= new Scanner(System.in).useDelimiter("\n");
        asientos = new Asientos[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        
    }
    public void crearPelicula(){
        Pelicula peli =new Pelicula();
        
        String opc="";
        System.out.println("   bienvenidos al cine we bare bears "+"\n");
        System.out.println("   lista de peliculas en la cartelera");
        do{
            System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
            System.out.println("El Escuadrón Suicida - Trailer Oficial"+"\n" );
            System.out.println("Free Guy "+"\n");
            System.out.println("Cuestion de sangre" +"\n");
            System.out.println(" Candyman"+"\n");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
          
            System.out.println("elija opcion de pelicula");
            System.out.println("..........................................");
          
            peli.setTitulo(opc);
            
            opc=leer.nextLine();
           
        }while(opc.equalsIgnoreCase("pelicula : "+ opc+"\n"));

    }
    public void llenarSalaPorDefecto() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos.length; j++) {
                System.out.println( asientos.length +"X");
            }
        }
    }
   
}
