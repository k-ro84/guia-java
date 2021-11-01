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
public final class YatesDeLujo extends Barco{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int cv;
    private int cantCamarotes;

    public YatesDeLujo() {
    }

    public YatesDeLujo(int cv, int cantCamarotes, float matricula, int eslora, byte AnioFabricacion) {
        super(matricula, eslora, AnioFabricacion);
        this.cv = cv;
        this.cantCamarotes = cantCamarotes;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCantCamarotes() {
        return cantCamarotes;
    }

    public void setCantCamarotes(int cantCamarotes) {
        this.cantCamarotes = cantCamarotes;
    }

      @Override
    public double modulo() {
        return super.modulo()+this.cantCamarotes+this.cv;
    }
  
    public void YatesMostrar() {
        System.out.println( "Yates De Lujo{" + "\ncv : " + cv + "\n, cantidad de Camarotes :" + cantCamarotes + '}');
    }

    
}
