/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_E.servicio;

import ejercicio3_E.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class raicesServicio {
    
   private Raices r;
  
  Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
    public raicesServicio(Raices r) {
        this.r = r;
    }
    //posible colocando public Raices crearcoef...(){
    //retuwn new raices(a,b,c);
    //}
    public void crearCoeficientes(){
       System.out.println("ingrese los tres coeficientes: ");
        r.setA(leer.nextDouble());
        r.setB(leer.nextDouble());
        r.setC(leer.nextDouble());
    
    }
  //es posible recolverlo colocando(Raices r)
    public double getDiscriminante() {//devuelve el valor del discriminante
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
    }
    //es posible recolverlo colocando(Raices r)
    public boolean tieneRaices() {  //para inidcar si tiene 2 mas  soluciones
        if (getDiscriminante() > 0) {
            return true;
        }
        return false;
    }
    //es posible recolverlo colocando(Raices r)
    public boolean tieneRaiz() {  //para indicar si tiene una solucion
        if (getDiscriminante() == 0) {
            return true;
        }
        return false;
    }
    //es posible recolverlo colocando(Raices r)
    public void obtenerRaices(){
        //                     (-b    ± √(      (b^2)-(4*a*c)))        /     (2*a)
        if (tieneRaices()) {// (tieneRaices(r))==true{
            double raiz1 = (-r.getB() + Math.sqrt(getDiscriminante())) / (2 * r.getA());
            double raiz2 = (-r.getB() - Math.sqrt(getDiscriminante())) / (2 * r.getA());
            System.out.println("x1: " + raiz1);
            System.out.println("x2: " + raiz2);
        }
    }
    //es posible recolverlo colocando(Raices r)
    public void obtenerRaiz(){
        if(tieneRaiz()){ //(tieneRaiz(r)) {
             System.out.println("La ecuacion tiene una solucion");
            double res1 = (-r.getB() + Math.sqrt(getDiscriminante())) / 2 * r.getA();
            System.out.println("Solucion: " + res1);
        }
    }
    //es posible recolverlo colocando(Raices r)
    public void calcular(){//calcular(r){
        if (!tieneRaiz() && !tieneRaices()) {
            System.out.println("No tiene raices");
        } else if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        }
    }
    
}
