/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.entidades;


import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Perro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private int edad;
    private String Raza;
    private String Tamanio;
    
    private boolean tienePropietario; 
    

    public Perro() {
    }

    public Perro(String nombre, int edad, String Raza, String Tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.Raza = Raza;
        this.Tamanio = Tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getTamanio() {
        return Tamanio;
    }

    public void setTamanio(String Tamanio) {
        this.Tamanio = Tamanio;
    }

   public boolean isTienePropietario() {
        return tienePropietario;
    }

    public void setTienePropietario(boolean tienePropietario) {
        this.tienePropietario = tienePropietario;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + ", Raza=" + Raza + ", Tamanio=" + Tamanio + ", tienePropietario=" + tienePropietario + '}';
    }

    
    
}
