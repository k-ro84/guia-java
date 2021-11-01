/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Cafetera {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double capacidadMaxima=1000;//le introduzco el valor aca para que sepa a cuanto equivale
    private double cantidadActual;//empieza equiparado or ende tambien empieza en 1000

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    
}
