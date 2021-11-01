/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Electrodomesticos {
    
    protected double precio;
    protected Color color;
    //protected final static String COLOR_DEF="blanco"; si no quiero usar un enum,sigue abajo
    protected ConsumoEnergetico ConsEnerg;
    //protected final static char CONSUMO_ENERGETICO_DEF='F';si no quiero usar el enum ,sigue abajo
    protected double peso;
    //protected final static double PRECIO_BASE_DEF=1000;

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, Color color, ConsumoEnergetico ConsEnerg, double peso) {
        this.precio = precio;
        this.color = color;
        this.ConsEnerg = ConsEnerg;
        this.peso = peso;
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
    
    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    //    public void comprobarConsumoEnergetico(char consumoEnergetico){
    //         
    //        if(consumoEnergetico>=65 && consumoEnergetico<=70){
    //            this.consumoEnergetico=consumoEnergetico;
    //        }else{
    //            this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
    //        }
    //         
    //    }

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
    
//    public double precioFinal(){
//        double plus=0;
//        switch(consumoEnergetico){
//            case 'A':
//                plus+=100;
//                break;
//            case 'B':
//                plus+=80;
//                break;
//            case 'C':
//                plus+=60;
//                break;
//            case 'D':
//                plus+=50;
//                break;
//            case 'E':
//                plus+=30;
//                break;
//            case 'F':
//                plus+=10;
//                break;
//        }
//   
//        if(peso>=0 && peso<19){
//            plus+=10;
//        }else if(peso>=20 && peso<49){
//            plus+=50;
//        }else if(peso>=50 && peso<=79){
//            plus+=80;
//        }else if(peso>=80){
//            plus+=100;
//        }
//   
//        return precioBase+plus;
//    }
   
    
    private Color compruebaColor(String color) {
        Color rColor;
        switch (color) {
            case "BLANCO":
                rColor = Color.blanco;
                break;
            case "NEGRO":
                rColor = Color.negro;
                break;
            case "GRIS":
                rColor = Color.gris;
                break;
            case "AZUL":
                rColor = Color.azul;
                break;
            case "ROJO":
                rColor = Color.rojo;
                break;
            default:
                rColor = Color.blanco;
        }
        return rColor;
    }
//continua de instanciar por defecto el color
//    private void comprobarColor(String color){
//  
//        //Colores disponibles
//        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
//        boolean encontrado=false;
// 
//        for(int i=0;i<colores.length && !encontrado;i++){
//             
//            if(colores[i].equals(color)){
//                encontrado=true;
//            }
//             
//        }
//         
//        if(encontrado){
//            this.color=color;
//        }else{
//            this.color=COLOR_DEF;
//        }
//         
//         
//    }
    
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
     
        this.color = compruebaColor(vColor);
        this.ConsEnerg = compruebaConsumo(consumo);
        this.peso = vPeso;
        this.precio = precioFinal(consumo, vPeso);
         
         
    }

    public void listaFinal() {
        System.out.println("Electrodomesticos{" + "precio=" + precio + ", color=" + color + ", ConsEnerg=" + ConsEnerg + ", peso=" + peso + '}');
    }
    
}
