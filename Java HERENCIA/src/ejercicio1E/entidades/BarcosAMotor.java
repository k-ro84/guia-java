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
public final class BarcosAMotor extends Barco{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    protected int cv;

    public BarcosAMotor() {
    }

    public BarcosAMotor(int cv, float matricula, int eslora, byte AnioFabricacion) {
        super(matricula, eslora, AnioFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }
    
    @Override
    public double modulo() {
        return super.modulo()+this.cv;
    }
    
   
    public void  barcoAMotormostrar() {
        System.out.println("Barcos A Motor{" + "cv=" + cv + '}');
    }
    
    
}
