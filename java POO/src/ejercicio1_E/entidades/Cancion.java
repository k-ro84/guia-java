/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Cancion {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     private String autor;
     private String cancion;

    public Cancion() {//const vacios par ambos
        this.autor = " ";
        this.cancion = " ";
    }

    public Cancion(String autor, String cancion) {//construc recibe datos por parametros
        this.autor = autor;
        this.cancion = cancion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

   
     
     
         
}
