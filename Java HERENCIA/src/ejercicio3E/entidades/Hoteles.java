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
public class Hoteles extends Alojamiento{
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n"); 

    protected int CantidadHabitaciones;
    protected int NumeroCamas;
    protected int CantidadPisos;
    protected double PrecioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(int CantidadHabitaciones, int NumeroCamas, int CantidadPisos,  String nombre, String direccion, String localidad, String gerenteEncargado) {
        super(nombre, direccion, localidad, gerenteEncargado);
        this.CantidadHabitaciones = CantidadHabitaciones;
        this.NumeroCamas = NumeroCamas;
        this.CantidadPisos = CantidadPisos;
       
    }
    // en hotel 4 y 5 estrellas sobreescribo este metodo
    public void precioHab(){
        this.PrecioHabitaciones= 50 + this.NumeroCamas ;
    }
    
     // en hotel 4 y 5 estrellas sobreescribo este metodo
    public void creaHotel(){
        super.creaAlojamiento();
        
        System.out.print(" HOTEL");
    
        System.out.println("Ingrese la cantidad de Camas");
        this.NumeroCamas = leer.nextInt();
        System.out.println("Cuantas Habitaciones tiene?");
        this.CantidadHabitaciones = leer.nextInt();
        System.out.println("Cuantos Pisos?");
        this.CantidadPisos = leer.nextInt();
        
        precioHab();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Hoteles {" + "Cantidad Habitaciones=" + CantidadHabitaciones + "\n, Numero Camas=" + NumeroCamas + 
                "\n, Cantidad Pisos=" + CantidadPisos + "\n, Precio Habitaciones=" + PrecioHabitaciones + '}';
    }
    
    
}
