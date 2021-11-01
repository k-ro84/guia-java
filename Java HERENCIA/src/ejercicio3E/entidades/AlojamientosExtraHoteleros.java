/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class AlojamientosExtraHoteleros extends Alojamiento{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    protected boolean privado;
    protected double metrosCuadrados;

    public AlojamientosExtraHoteleros() {
    }

    public AlojamientosExtraHoteleros(boolean privado, double metrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.privado = privado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    public void crearEXtraHotelero(){
        super.creaAlojamiento();
 
         System.out.println("ESTABLECIMIENTO EXTRAHOTELERO");
       
        System.out.println("Es un establecimiento Privado? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.privado = true;
        } else if (op == 'N') {
            this.privado = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que es privado");
            this.privado = true;
        }

        System.out.println("Cuantas Metros cuadrados tiene?");
        this.metrosCuadrados = leer.nextInt();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Alojamientos ExtraHoteleros{" + "privado =" + privado + ", metrosCuadrados=" + metrosCuadrados + '}';
    }
    
    
}
