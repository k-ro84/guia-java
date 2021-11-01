/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Listado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String raza;

    public Listado() {
    }

    public Listado(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Listado{" + "raza=" + raza + '}';
    }

    
    
}
