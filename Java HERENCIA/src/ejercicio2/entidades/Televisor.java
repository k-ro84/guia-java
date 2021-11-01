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
public final class Televisor extends Electrodomesticos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
 private double resolucion;
 private boolean sintonizadorTDT;

    public Televisor() {
        super();
        
    }
    
    public Televisor(double resolucion, boolean sintonizadorTDT, double precio, Color color, ConsumoEnergetico ConsEnerg, double peso) {
        super(precio, color, ConsEnerg, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double resolucion, boolean sintonizadorTDT) {
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
    
    
    public void crearTelevisor() {
        String opc="";
        
        System.out.println("    televisor");
        
        System.out.println("indique la resolucion buscada");
        this.resolucion=leer.nextDouble();
      
         System.out.println("tiene sintonizador(s/n):");
         opc =leer.next().toUpperCase();
         
         if (opc.equals("s")){
             System.out.println(" tiene sintonizador");
         }else{
             System.out.println(" no tiene sintonizador");
         }
           super.creaElectrodomestico();
    }   
    
  
    public void precioFinal() {
        double vPrecio = super.getPrecio();

        if (this.resolucion > 40)
        {
            super.setPrecio(vPrecio + vPrecio * 0.30);
        }

        if (this.sintonizadorTDT)
        {
            super.setPrecio(super.getPrecio() + 500);
        }

    }

   
    @Override
    public void listaFinal() {
        System.out.println("Televisor de  : {" + "resolucion=" + resolucion + 
                "\n pulgadas  , sintonizadorTDT=" + this.getResolucion() + 
                "\n"+this.precio );
    }


    
}
