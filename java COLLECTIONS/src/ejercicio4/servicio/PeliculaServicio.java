/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.servicio;

import ejercicio4.comparadores.comparadores4;
import ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class PeliculaServicio {
    
    private Scanner leer;
    private ArrayList<Pelicula>pelicula;

    public PeliculaServicio( ) {
        this.leer = new Scanner(System.in).useDelimiter("\n");;
        this.pelicula = new ArrayList();
    }
    
    public void crearPelicula(){
      String respuesta = "";
          do {
                Pelicula p1=new Pelicula();
                System.out.println("titulo de la pelicula");
                String titulo = leer.next();
                
                System.out.println("nombre del director");
                String director=leer.next();
                
                System.out.println("duracion de la peliculas (en horas)");
                Integer duracion =leer.nextInt();
                
                p1.setTitulo(titulo);
                p1.setDirector(director);
                p1.setDuracionHs(duracion);
                
                 pelicula.add(p1);
                System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
                System.out.println("Quiere ingresar otra pelicula?");
                respuesta = leer.next();

            } while (respuesta.equalsIgnoreCase("Si"));
       
    }
            
     public void mostrarLista(){
        System.out.println("            _______________________________");
        System.out.println("                 grilla de peliculas ");
        for (Pelicula peli :  pelicula) { // Aca los mostramos en un for each

            System.out.println("   peliculas ingresadas:  "  
                    + "\n"  +   pelicula);
           
       }
          System.out.println( "            _______________________________   ");
          System.out.println("             la lista actual de peliculas es  : ");
          Iterator<Pelicula> it = pelicula.iterator();

        while (it.hasNext()) {
                System.out.println( it.next());
               
       }
          System.out.println(" La grilla es de tamaño: " + "["+ pelicula.size()+ "]");
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
     }
     

    public void ordenarPeliPorTitulo() {
        System.out.println("__________________________________________");
        System.out.println(" Mostrar las peliculas ordenadas por el Titulo alfabeticamente ");
        Collections.sort(pelicula, comparadores4.porTitulo);

        pelicula.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }

  
    public void ordenarPeliPorDirector() {
        System.out.println("__________________________________________");
        System.out.println(" Mostrar las Peliculas ordenadas por el Director alfabeticamente");
        Collections.sort(pelicula, comparadores4.porDirector);//ordena con el Comparator porDirector

        pelicula.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }
    
    public void mostrarPeliculasde1Hs() {
        System.out.println("** Mostrar en pantalla todas las películas con una duración mayor a 1 hora ");//lambda
        pelicula.stream().filter(peli -> (peli.getDuracionHs() > 60)).forEachOrdered(peli -> {
            System.out.println(peli);
        });
        System.out.println("");
    }
     
    public void ordenarPeliPorDuracionMayor() {
        System.out.println("__________________________________________");
        System.out.println(" Mostrar películas de acuerdo a su duración de mayor a menor ");
        Collections.sort(pelicula, comparadores4.porDuracionMayor);

        pelicula.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }


    public void ordenarPeliPorDuracionMenor() {
        System.out.println("__________________________________________");
        System.out.println(" Mostrar películas de acuerdo a su duración de menor a mayor ");
        Collections.sort(pelicula, comparadores4.porDuracionMenor);//ordena con el Comparator porDuracionMenor

        pelicula.forEach(peli -> {
            System.out.println(peli);
        });//muestra lo ordenado
        System.out.println("");
    }


}
