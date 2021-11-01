/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E.entidades;

/**
 *
 * @author K-RITO
 */
public class Asientos {
    
    private char letra;
    private int fila;
    private Espectador espectador;

    public Asientos() {
    }

    public Asientos(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
    }
    
    public Asientos(char letra, int fila, Espectador espectador) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = espectador;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    public boolean ocupado() {

        return espectador != null;
    }
 
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letra + " y " + espectador;
        }
 
        return "Asiento: " + fila + letra + " y este asiento está vacio ";
//    @Override
//    public String toString() {
//        return "Asientos{" + "letra=" + letra + ", fila=" + fila + ", espectador=" + espectador + '}';
//    }
    
    }
}
