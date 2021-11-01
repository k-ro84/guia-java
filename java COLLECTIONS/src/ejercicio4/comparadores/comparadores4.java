/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.comparadores;

import ejercicio4.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author K-RITO
 */
    public class comparadores4 {
        
        
    public static Comparator<Pelicula> porTitulo = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o2.getTitulo().compareTo(o1.getTitulo());
            }
    };
     
   public static Comparator<Pelicula> porDirector= new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o2.getDirector().compareTo(o1.getDirector());
            }
    };
         
    public static Comparator<Pelicula> porDuracionMayor = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o2.getDuracionHs().compareTo(o1.getDuracionHs());
            }
    };
    
    public static Comparator<Pelicula> porDuracionMenor = new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o2, Pelicula o1) {
                return o1.getDuracionHs().compareTo(o2.getDuracionHs());
            }
    };
     
}
