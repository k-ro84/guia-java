/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3E.entidades;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author K-RITO
 */
public class Alojamiento {
    
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerenteEncargado;

    public Alojamiento() {
    }

    public Alojamiento(String nombre, String direccion, String localidad, String gerenteEncargado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerenteEncargado = gerenteEncargado;
    }
  
    public void creaAlojamiento(){
        
        System.out.println("Ingrese el Nombre del Alojamiento");
        this.nombre = leer.next().toUpperCase();
        System.out.println("Ingrese la Direccion");
        this.direccion = leer.next().toUpperCase();
        System.out.println("Ingrese la Localidad");
        this.localidad = leer.next().toUpperCase();
        System.out.println("Como se llama el Gerente");
        this.gerenteEncargado = leer.next().toUpperCase();
  
    }
    
   

}
