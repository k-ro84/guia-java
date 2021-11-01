/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Pelicula {
    
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     private String titulo;
     private String director;
     private Integer duracionHs;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracionHs) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHs = duracionHs;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracionHs() {
        return duracionHs;
    }

    public void setDuracionHs( Integer duracionHs) {
        this.duracionHs = duracionHs;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionHs=" + duracionHs + '}';
    }
     
     
    
}
