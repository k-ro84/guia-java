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
public class Jugador {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int id ; 
    private String nombre; 
    private boolean mojado;
    private boolean vivo;
    

    public Jugador() {
    }

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador"+ id;
        this.mojado=true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * El jugador dispara el revolver
     * @param r 
     */
    public void disparar(RevolverDeAgua r) {
 
        System.out.println("El jugador  : [" + nombre + "] se apunta con la pistola");
 
        //El jugador se pone el revolver y...
        if (r.disparar()) {
            this.mojado = true; //muere
            System.out.println("El  jugador  : [" + nombre + "] ha muerto...");
            
        } else {
         
            System.out.println("El jugador  : [" + nombre + "] se ha librado..."); //No muere
          
        }
 
    }

    public boolean ismojado() {
       return mojado;
    }

    public Jugador(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
    
    
     
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + '}';
    }
  
  
}
