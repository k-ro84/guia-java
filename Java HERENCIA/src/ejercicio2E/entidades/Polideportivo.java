/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E.entidades;

import java.util.Scanner;



/**
 *
 * @author K-RITO
 */
public class Polideportivo extends Edificio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected Boolean tipoInstalacion;

    public Polideportivo(String nombre, Boolean tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getTipoInstalacion() {
      return tipoInstalacion;
    }

    public void setTipoInstalacion(Boolean tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularVolumen(){
        return super.ancho*super.alto*super.largo;
        
    }

    @Override
    public double calcularSuperficie(){
        return super.ancho*super.largo;
        
    }

    @Override
    public String toString() {
       String instala = "TECHADO";
        if (tipoInstalacion)
        {
            instala = "AIRE LIBRE";
        }
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        return "Polideportivo :{" + 
                "\n nombre del edificio " + nombre + "\n, tipo de Instalacion=" + tipoInstalacion + '}';
    }
    
    
      
}
