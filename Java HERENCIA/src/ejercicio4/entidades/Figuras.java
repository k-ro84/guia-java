/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.logging.Logger;

/**
 *
 * @author K-RITO
 */
public class Figuras {
    
   
    protected double area;
    protected double perimetro;
    protected double PI=3.14;
    private static final Logger LOG = Logger.getLogger(Figuras.class.getName());

    public Figuras() {
    }

    public Figuras(double area, double perimetro) {
       
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void ingresoValores(){
        System.out.println(" ingrese los valores de referencia");
      
    }
    
   public void calcularArea(){
       System.out.println(""+this.area );
       System.out.println(""+this.perimetro);
     }
   
   public void calcularPerimetro(){
         System.out.println(""+this.area );
         System.out.println(""+this.perimetro);
         
   }
    
   
   public void mostrar(){
       System.out.println("los valores ingresados :  +\n" +
    "  de sus figuras { area="+ area  + ", perimetro=" + this.perimetro + ",con un valor constante dde PI  de " + PI + '}');
   } 
   
   
}
   