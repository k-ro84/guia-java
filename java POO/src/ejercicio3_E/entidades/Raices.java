/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Raices {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double a;
    private double b;
    private double c;

    public Raices() {
    }

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //se pediria ca el discriminate en el otro ejemplo
//     public double getDiscriminante(){
//        return (b*b)-(4*a*c);
//    }
      @Override
    public String toString() {
        return "{\n   a: " + a + ",\n   b: " + b + ",\n   c: " + c + "\n}";
    }
}
