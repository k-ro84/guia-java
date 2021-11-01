/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String name;

    private String apellido;

    private int anios;

    private long dni;
    
    private Perro perrito;

    public Persona() {
        
    }

    public Persona(String name, String apellido, int anios, long dni) {
        this.name = name;
        this.apellido = apellido;
        this.anios = anios;
        this.dni = dni;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }


    public Perro getPerrito() {
        return perrito;
    }

    public void setPerrito(Perro perrito) {
        this.perrito = perrito;
    }

    @Override
    public String toString() {
        return "Adoptante{" + "name=" + name + ", apellido=" + apellido + ", anios=" + anios + ", dni=" + dni + ", su perro es =" + perrito + '}';
    }
 
    
}
