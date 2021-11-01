/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public final class Veleros extends Barco{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected int mastiles;

    public Veleros() {
    }

    public Veleros(int mastiles, float matricula, int eslora, byte AnioFabricacion) {
        super(matricula, eslora, AnioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
     @Override
    public double modulo() {
        return super.modulo()+this.mastiles;
    }
 
    public void Veleromostrar() {
        System.out.println("Veleros{" + "mastines :" + mastiles + '}'); 
    }
    
    
}
