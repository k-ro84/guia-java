/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.entidades;

/**
 *
 * @author K-RITO
 */
public class Cartas {
    
    private int valor;
    private Palos palos;

    public Cartas() {
    }

    public Cartas(int valor, Palos palos) {
        this.valor = valor;
        this.palos = palos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Cartas{" + "valor=" + valor + ", palos=" + palos + '}';
    }

    
    
}
