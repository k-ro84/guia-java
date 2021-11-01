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
public class Cine {
    private double entrada;
    
    private Pelicula pelicula;
    private Asientos asientos[][];

    public Cine() {
    }

    public Cine(double entrada, Pelicula pelicula,int filas, int columnas) {
        this.entrada = entrada;
        this.pelicula = pelicula;
        asientos = new Asientos[filas][columnas];
    }

    public Cine(double entrada, Pelicula pelicula, Asientos[][] asientos) {
        this.entrada = entrada;
        this.pelicula = pelicula;
        this.asientos = asientos;
    }
    
    public Asientos[][] getAsientos() {
        return asientos;
    }
 
    public void setAsientos(Asientos[][] asientos) {
        this.asientos = asientos;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Cine{" + "entrada=" + entrada + ", pelicula=" + pelicula + ", asientos=" + asientos + '}';
    }

}
