/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public abstract class Edificio {
    Scanner leer;
    
    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Edificio(double ancho, double alto, double largo) {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
// no hacen fala ya que en cada case hija se van a redifinir
//    public double getAncho() {
//        return ancho;
//    }
//
//    public void setAncho(double ancho) {
//        this.ancho = ancho;
//    }
//
//    public double getAlto() {
//        return alto;
//    }
//
//    public void setAlto(double alto) {
//        this.alto = alto;
//    }
//
//    public double getLargo() {
//        return largo;
//    }
//
//    public void setLargo(double largo) {
//        this.largo = largo;
//    }

    // las clases abstractas no tiene cuerpo por eso desaclaras se pone ; ya que da paso
    // a poder relenarlas e otras claess
    public abstract double calcularSuperficie() ;  //        : calcula la superficie del edificio
    
    public abstract double calcularVolumen() ; //calcula el volumen del edifico.
        
    
}
