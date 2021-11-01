/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Cadena {
    
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         private String frase;
         private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = frase.length();//estamos trabajando sobre el otro objeto
    } //por eso se introduce como valor la frase ya que vamos a medir su longitud

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {//se inicienan juntas ya que una depende de la otra
        this.frase = frase;
        this.longitud = this.frase.length();
    }

    public int getLongitud() {//set longitud no, ya que depende de la frase
        return longitud;
    }
  
}
