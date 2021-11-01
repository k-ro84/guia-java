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
public class Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected float matricula;
    protected int eslora ;//metros
    protected float AnioFabricacion;

    public Barco() {
    }

    public Barco(float matricula, int eslora, float AnioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.AnioFabricacion = AnioFabricacion;
    }

    public float getMatricula() {
        return matricula;
    }

    public void setMatricula(float matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public float getAnioFabricacion() {
        return AnioFabricacion;
    }

    public void setAnioFabricacion(float AnioFabricacion) {
        this.AnioFabricacion = AnioFabricacion;
    }
  
      //METODO  “MODULO”
    public double modulo()
    {
    return (10*eslora);
    }
    
  
    public void barcoDatos() {
        System.out.println("Barco {" + " matricula=" + matricula + 
                "\n, eslora=" + eslora + 
                "\n, Año Fabricacion=" + AnioFabricacion + '}'); 
    }
    
    
    
}
