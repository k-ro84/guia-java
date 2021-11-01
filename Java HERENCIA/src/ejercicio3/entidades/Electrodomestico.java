/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.entidades;

import ejercicio3.enumeradores.Color;
import ejercicio3.enumeradores.ConsumoEnergetico;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Electrodomestico {
    protected double precio;
    protected Color color;
    protected ConsumoEnergetico ConsEnerg;
    protected double peso;
    protected int cantidadProductos;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, ConsumoEnergetico ConsEnerg, double peso,int cantidadProductos) {
        this.precio = precio;
        this.color = color;
        this.ConsEnerg = ConsEnerg;
        this.peso = peso;
        this.cantidadProductos= cantidadProductos;
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

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    

    public void calcularSuma( double preciofinal, int cantidad){
        
        this.precio=  preciofinal * cantidadProductos;  
    }
    
     public double precioFinal(char consumo, double peso) {
        double precioC, precioP = 0;

        switch (consumo) {
            case 'A':
                precioC = 2000;
                break;
            case 'B':
                precioC = 1800;
                break;
            case 'C':
                precioC = 1600;
                break;
            case 'D':
                precioC = 1500;
                break;
            case 'E':
                precioC = 1300;
                break;
            case 'F':
                precioC = 1100;
                break;
            default:
                precioC = 1000;
        }

        if (peso > 0 && peso < 20) {
            precioP = 100;
        } else if (peso > 19 && peso < 50) {
            precioP = 500;
        } else if (peso > 49 && peso < 80) {
            precioP = 800;
        } else if (peso >= 80) {
            precioP = 1000;
        }

        return precioC + precioP;
    }
    
   private ConsumoEnergetico compruebaConsumo(char consumo) {
        ConsumoEnergetico rConsumo;
        switch (consumo) {
            case 'A':
                rConsumo = ConsumoEnergetico.A;
                break;
            case 'B':
                rConsumo = ConsumoEnergetico.B;
                break;
            case 'C':
                rConsumo = ConsumoEnergetico.C;
                break;
            case 'D':
                rConsumo = ConsumoEnergetico.D;
                break;
            case 'E':
                rConsumo = ConsumoEnergetico.E;
                break;
            case 'F':
                rConsumo = ConsumoEnergetico.F;
                break;
            default:
                rConsumo = ConsumoEnergetico.F;
        }
        return rConsumo;
    }

    private Color compruebaColor(String color) {
        Color rColor;
        switch (color) {
            case "BLANCO":
                rColor = Color.BLANCO;
                break;
            case "NEGRO":
                rColor = Color.NEGRO;
                break;
            case "GRIS":
                rColor = Color.GRIS;
                break;
            case "AZUL":
                rColor = Color.AZUL;
                break;
            case "ROJO":
                rColor = Color.ROJO;
                break;
            default:
                rColor = Color.BLANCO;
        }
        return rColor;
    }

    
    public void creaElectrodomestico() {

            System.out.println("ingreso de electrodomestico");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Color");
        String vColor = leer.next().toUpperCase();
        System.out.println("Ingrese el Consumo (A,B,C,D o F)");
        char consumo = leer.next().toUpperCase().charAt(0);
        System.out.println("Cuanto Pesa?");
        double vPeso = leer.nextDouble();
        //double precio, Color color, Consumo conEnerg, double peso
        this.precio = precioFinal(consumo, vPeso);
        this.color = compruebaColor(vColor);
        this.ConsEnerg = compruebaConsumo(consumo);
        this.peso = vPeso;

        
    }
   
   public void calcularSuma(){
       
       System.out.println("precio final de la compra  : $      "+ (this.precio)      + "  total sin iva");
   }
   
}
   