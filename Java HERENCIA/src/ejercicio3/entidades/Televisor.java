/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.entidades;

import ejercicio3.enumeradores.Color;
import ejercicio3.enumeradores.ConsumoEnergetico;

/**
 *
 * @author K-RITO
 */
public final class Televisor extends Electrodomestico{
    
   private double resolucion;
   private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, Color color,
            ConsumoEnergetico ConsEnerg, double peso, int cantidadProductos) {
        super(precio, color, ConsEnerg, peso,cantidadProductos);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsEnerg() {
        return ConsEnerg;
    }

    public void setConsEnerg(ConsumoEnergetico ConsEnerg) {
        this.ConsEnerg = ConsEnerg;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void calcularSuma() {
       super.calcularSuma();
      
        System.out.println("el televisor cuesta: "+ this.precio);
       
    }

   
}
