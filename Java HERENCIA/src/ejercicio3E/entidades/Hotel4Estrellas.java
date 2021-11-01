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
public class Hotel4Estrellas extends Hoteles{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombRestaurant;
     private Integer capRestaurante;
     private boolean gym;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String nombRestaurant, Integer capRestaurante, boolean gym, int CantidadHabitaciones,
                            int NumeroCamas, int CantidadPisos, String nombre, String direccion, String localidad, String gerenteEncargado) {
        
        super(CantidadHabitaciones, NumeroCamas, CantidadPisos, nombre, direccion, localidad, gerenteEncargado);
        this.nombRestaurant = nombRestaurant;
        this.capRestaurante = capRestaurante;
        this.gym = gym;
    }

    public Hotel4Estrellas(String el_Chori_Loco, int i, int i0, int i1, int i2, String hotelo, String oscuridad_69, String tangamandapio, String sevelinda_Parada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public Integer getCapRestaurante() {
        return capRestaurante;
    }

    public void setCapRestaurante(Integer capRestaurante) {
        this.capRestaurante = capRestaurante;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public void Crear4estrellas(){
       super.creaHotel();
         System.out.println("Restorant y Gimnasio: ");
      
        System.out.println("Cual es el nombre del Restaurante?");
        this.nombRestaurant = leer.next().toUpperCase();
        System.out.println("Cantidad de comensales");
        this.capRestaurante = leer.nextInt();
        System.out.println("De que Categoria es el Gimnasio? A ó B");
        char op = leer.next().toUpperCase().charAt(0);
        switch (op) {
            case 'A':
                this.gym= true;
              
                op+=50;
                break;
            case 'B':
                this.gym= true;
                op+=30;
                break;
            default:
                System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
                this.gym = false;
                break;
        }
        
    }

    @Override
    public void precioHab() {
        super.precioHab(); //To change body of generated methods, choose Tools | Templates.
        double vAgregado=0;
       
       if(this.capRestaurante>50){
           vAgregado+=50;
       }else if(this.capRestaurante>30){
           vAgregado+=30;
       }else {
           vAgregado+=10;
       }
       
       super.PrecioHabitaciones += vAgregado;
        
    }

    @Override
    public String toString() {
          System.out.print(super.toString());
        return "Hotel 4 Estrellas: {" + "\nnombre Restaurante" + nombRestaurant + 
                "\n, capacidad Restaurante=" + capRestaurante + "\n, gimnasio tipo =" + gym + '}';
    }
    
    
}
