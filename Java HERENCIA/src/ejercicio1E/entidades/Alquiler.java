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
public class Alquiler extends Barco {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected String nombre;
    protected float documentoCliente;
    protected int fechaAlquiler;
    protected int fechaDevolucion;
    protected byte posicionAmarre;
    protected int PosicionBarco;

    public Alquiler() {
    }
    
    public Alquiler(String nombre, float documentoCliente, int fechaAlquiler, int fechaDevolucion, byte posicionAmarre, int PosicionBarco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.PosicionBarco = PosicionBarco;
    }

    public Alquiler(String nombre, float documentoCliente, int fechaAlquiler, int fechaDevolucion, byte posicionAmarre, int PosicionBarco, float matrícula, int eslora, byte AnioFabricacion) {
        super(matrícula, eslora, AnioFabricacion);
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.PosicionBarco = PosicionBarco;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(float documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public int getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(int fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(int fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public byte getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(byte posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getPosicionBarco() {
        return PosicionBarco;
    }

    public void setPosicionBarco(int PosicionBarco) {
        this.PosicionBarco = PosicionBarco;
    }
    
     public double precio_alquiler(){
        if(fechaDevolucion>fechaAlquiler)
     return (((fechaDevolucion-fechaAlquiler)+1)*super.modulo());
        else
            return 0;
    }
    
     
    public void embarcadero() {
        System.out.println("Alquiler{" + "nombre: " + nombre + ", documento Cliente=" + documentoCliente + 
                "\n, fecha Alquiler=" + fechaAlquiler + ", fecha Devolucion=" + fechaDevolucion + 
                "\n, posicion Amarre=" + posicionAmarre + ", Posicion Barco=" + PosicionBarco + '}');
    }
    
    
}
