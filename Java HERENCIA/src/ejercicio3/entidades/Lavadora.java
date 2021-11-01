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
public final class Lavadora extends Electrodomestico implements AccionFunciona{
    
   protected Double carga;

    public Lavadora() {
        
    }

    public Lavadora(Double carga, double precio, Color color, ConsumoEnergetico ConsEnerg, double peso, int cantidadProductos) {
        super(precio, color, ConsEnerg, peso,cantidadProductos);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public void calcularSuma() {
       super.calcularSuma();
       
       System.out.println("la lavadora cuesta " + this.precio);
    }
   
     //implemento el metodo abstracto con un override
    @Override
    public void conectado(String funciona) {
    ////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           // se elimina esta parte para dare un accionar
        System.out.println( "el eletrodomestico que conecto esta : " + funciona  +"!!!!"+this.carga);
  
    }

}
