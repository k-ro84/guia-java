/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Circulo extends Figuras implements calculoFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    protected double radio;
    protected double diametro;

    public Circulo(double radio, double diametro, double area, double perimetro) {
        super( area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo() {
      
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

     public void tomaDatos(){
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" ingrese los valores para los calculos de su circulo");
        System.out.println(" ingrese el radio : ");
        this.radio=leer.nextDouble();
        System.out.println(" ingrese el diametro :");
        this.diametro=leer.nextDouble();
        super.ingresoValores();
        calcularArea();
        calcularPerimetro();
        
    }
    
     @Override
    public void calcularArea() {
         double area=0;
        area=PI*(radio*radio);
        System.out.println(" el area del circulo es  : "  + area);
        
    }

    @Override
    public void calcularPerimetro() {
       double perimetro=0;
       perimetro=PI* diametro;
        System.out.println(" el perimetro de su  circulo es : " + perimetro);
    }
    
    
    
  
}
