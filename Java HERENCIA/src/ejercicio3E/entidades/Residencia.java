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
public class Residencia extends AlojamientosExtraHoteleros{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int cantHab;
    private boolean descuentoGremio;
    private boolean campoDeport;

    public Residencia() {
    }

    public Residencia(int cantHab, boolean descuentoGremio, boolean campoDeport, boolean privado,
                      double metrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerenteEncargado);
        this.cantHab = cantHab;
        this.descuentoGremio = descuentoGremio;
        this.campoDeport = campoDeport;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public void setDescuentoGremio(boolean descuentoGremio) {
        this.descuentoGremio = descuentoGremio;
    }

    public boolean isCampoDeport() {
        return campoDeport;
    }

    public void setCampoDeport(boolean campoDeport) {
        this.campoDeport = campoDeport;
    }
    
    
    public void CrearResidencia(){
       super.crearEXtraHotelero();
        
       System.out.println("Residencia: ");
       
        System.out.println("Cuantas habitaciones tiene?");
        this.cantHab = leer.nextInt();
        System.out.println("Tiene Campo Deportivo? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.campoDeport = true;
        } else if (op == 'N') {
            this.campoDeport = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.campoDeport = false;
        }
        System.out.println("Tiene descuento para Gremios? S/N");
        op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.descuentoGremio = true;
        } else if (op == 'N') {
            this.descuentoGremio = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que no tiene descuento");
            this.descuentoGremio = false;
        }
     }

    @Override
    public String toString() {
        String desc = "no tiene";
        String camp = "no tiene";
        if(descuentoGremio){//imprimo si tiene 
            desc = "tiene";
        }
        if (campoDeport){
            camp = "tiene";
        }
        System.out.println(super.toString());
        return "Residencia{" + "cantHab=" + cantHab + ", descuentoGremio=" + descuentoGremio + ", campoDeport=" + campoDeport + '}';
    }

    
}
