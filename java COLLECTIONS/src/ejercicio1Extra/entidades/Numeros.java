/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1Extra.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Numeros {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
      private ArrayList<Integer >numero;

    public Numeros() {
    }

    public Numeros(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "NumerosEntidades{" + "numero=" + numero + '}';
    }
      
    
}
