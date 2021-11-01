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
public final class Lavadora extends Electrodomesticos {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double carga;

    public Lavadora() {
        super();
    }
    
    public Lavadora(double carga, double precio, Color color, ConsumoEnergetico ConsEnerg, double peso) {
        super(precio, color, ConsEnerg, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    
    public void crearLavarropa() {
       
        System.out.println("   LAVARROPA: ");
        System.out.println(" Cuantos Kilos de ropa carga?");
        this.carga = leer.nextDouble();
        super.creaElectrodomestico();// me trae los datos ya tomados
        precioFinal();
    }   
    
    private void precioFinal(){
        double precioFinal = super.getPrecio();
        if(this.carga>30){
            super.setPrecio(precioFinal+500);
        }
    }
    

    @Override
    public void listaFinal() {
        System.out.println("Lavarropa de " + carga + " kilos de carga "
                + "\n"+ this.precio +super.toString());
              
    }
}
