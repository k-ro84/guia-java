/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class operacionesBasicas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double num1;
    private double num2;

    public operacionesBasicas() {
        
    }

    public operacionesBasicas(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double getnum1(){
       return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    

    public void crearOperaciones( double num1, double num2 ) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void cargarNumeros(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese su primer  numero");
        num1=leer.nextDouble();
        System.out.println("ingrese su segundo numero");
        num2=leer.nextDouble();
       
       
    }

    public double sumar(){
        return num1+num2;
    }
    
    public double restar(){
        return num1-num2; 
    }
    
    public double multiplicar(){
        if(num1==0 || num2==0){
            System.out.println("uno de los valores ingresados es cero(0)");
            return 0;
        }else{
            return num1*num2;
        }
    }
    
    public double dividir(){
       if(num1==0 || num2==0){
            System.out.println("su dividendo o divisor es cero(0)");
            return 0;
        }else{
            return num1/num2;
        }
    }
}
