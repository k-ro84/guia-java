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
public class RevolverDeAgua {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
       private int  posicionActual;
       private int posicionDelTambor ;
       private boolean disparar;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionDelTambor) {
        this.posicionActual = posicionActual;
        this.posicionDelTambor = posicionDelTambor;//donde esta la bala
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDelTambor() {
        return posicionDelTambor;
    }

    public void setPosicionDelTambor(int posicionDelTambor) {
        this.posicionDelTambor = posicionDelTambor;
    }
 
    public boolean disparar() {
 
        boolean exito = false;
 
        if (this.getPosicionActual() == this.getPosicionDelTambor()) {
            exito = true; //Alguien va a morir...
        }
        siguienteChorro();
 
        return exito;
 
    }
 
    //Cambia a la siguiente posicion
    public void siguienteChorro() {
 
        if (this.getPosicionActual()< 7) {
            this.setPosicionActual(+1); //posicion incial
        } else {
            this.setPosicionActual(1);
        }
    }
    
    
    public boolean muerto() {
        return this.posicionActual == this.posicionDelTambor;
    }

    public static int generaNumeroAleatorio(int minimo, int maximo) {
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }
 
    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posici\u00f3nActual=" + posicionActual + ", posici\u00f3nDelTambor=" + posicionDelTambor + '}';
    }  
}   

