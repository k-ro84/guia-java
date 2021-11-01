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
public class Hotel5Estrellas extends Hoteles{
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
      private Integer cantSalonDeConferencias;
      private Integer cantDeSuits;
      private Integer cantDeLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonDeConferencias, Integer cantDeSuits, Integer cantDeLimosinas, int CantidadHabitaciones,
                           int NumeroCamas, int CantidadPisos, String nombre, String direccion, String localidad, String gerenteEncargado) {
        
        super(CantidadHabitaciones, NumeroCamas, CantidadPisos, nombre, direccion, localidad, gerenteEncargado);
        this.cantSalonDeConferencias = cantSalonDeConferencias;
        this.cantDeSuits = cantDeSuits;
        this.cantDeLimosinas = cantDeLimosinas;
    }

    public Hotel5Estrellas(int i, int i0, int i1, String el_Salpicon, int i2, int i3, int i4, int i5, String mejorSolo, String juan_D_Perron_450, String ugarteche, String elber_Galarga) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCantSalonDeConferencias() {
        return cantSalonDeConferencias;
    }

    public void setCantSalonDeConferencias(Integer cantSalonDeConferencias) {
        this.cantSalonDeConferencias = cantSalonDeConferencias;
    }

    public Integer getCantDeSuits() {
        return cantDeSuits;
    }

    public void setCantDeSuits(Integer cantDeSuits) {
        this.cantDeSuits = cantDeSuits;
    }

    public Integer getCantDeLimosinas() {
        return cantDeLimosinas;
    }

    public void setCantDeLimosinas(Integer cantDeLimosinas) {
        this.cantDeLimosinas = cantDeLimosinas;
    }
     
    
     public void Crear5estrellas(){
       super.creaHotel();
         System.out.println("Salones y Suits:");
       
        System.out.println("Cuantos Salones de Eventos tiene?");
        this.cantSalonDeConferencias = leer.nextInt();
        System.out.println("Cantidad de SUITs");
        this.cantDeSuits = leer.nextInt();
    }

    @Override
    public void precioHab() {
        super.precioHab(); 
        
        super.PrecioHabitaciones+= this.cantDeLimosinas * 15;
    }

    
     
    @Override
    public String toString() {
          System.out.print(super.toString());
        return "Hotel 5 Estrellas :{" + "\ncantidades Salon De Conferencias=" + cantSalonDeConferencias + 
                "\n, cantidad De Suits=" + cantDeSuits + "\n, cantidad De Limosinas=" + cantDeLimosinas + '}';
    }
     
   
}
