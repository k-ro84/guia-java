/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.entidades;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double radio;
  
    public circunferencia(){
        
    }
    
   public circunferencia(double radio){//contructor a base de la clase, de esta manera toma la clase 
       this.radio=radio;
   }
   
    public void setRadio(double radio) {
        this.radio = radio;
    }
   
   public double getRadio(){
      
       return this.radio; //puede ser sin this mejor
   }
   
   public void llenarCircunferencia(double radio){
       this.radio=radio; 
   }
   
   public double area(){  
       double area;
       area = Math.PI * (radio*radio); //puede seer tambien Math.pow(radio,2)
       
       return area;
   }
   
   public double perimetro(){
       double perimetro;
       perimetro= (2 * Math.PI) * radio;
       
       return perimetro;
   }
   
}