/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.comparadores.comparadores4;
import ejercicio4.entidades.Pelicula;
import ejercicio4.servicio.PeliculaServicio;
import java.util.ArrayList;
import java.util.Collections;
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
         
         PeliculaServicio pelis= new PeliculaServicio();
         
         ArrayList<String> peliculas = new ArrayList(); // Creamos una lista de Strings

         pelis.crearPelicula();
         pelis.mostrarLista();
        
         pelis.ordenarPeliPorDirector();
         pelis.ordenarPeliPorTitulo();
         pelis.ordenarPeliPorDuracionMayor();
         pelis.ordenarPeliPorDuracionMenor();
         pelis.mostrarPeliculasde1Hs();
    }
    
}
