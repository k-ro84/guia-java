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
public class Rectangulo  extends Figuras implements calculoFormas{

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
   protected double base;
   protected double altura;

    public Rectangulo(double base, double altura, double area, double perimetro) {
        super( area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
       
    }
  
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void tomaDatos(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" ingrese los valores para los calculos de su rectangulo");
        System.out.println(" ingreese la base");
         this.base = leer.nextDouble();
        System.out.println(" ingrese la altura ");
        this.altura=leer.nextDouble();
        super.ingresoValores();
        calcularArea();
        calcularPerimetro();
        
    }
    
    public void Dibujar(){
        
        System.out.println(     "  su rectangulo se ve asi    "  );
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) 
                System.out.print("*");      
              System.out.println();
        }
    }
    
    @Override
    public void calcularArea() {
        double area=0;
        area=base*altura;
        System.out.println("el area de rectangulo es  : "  + area);
        
    }

    @Override
   
    public void calcularPerimetro() {
      double perimetro=0;
      perimetro=(base+altura)*2;
        System.out.println("el perimetro de su rectangulo es  : " + perimetro);
    }

}
