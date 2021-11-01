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
public class Camping extends AlojamientosExtraHoteleros{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
     private Integer capMaxCarpas;
     private Integer cantBanios;
     private boolean  restorante;

    public Camping() {
    }

    public Camping(Integer capMaxCarpas, Integer cantBanios, boolean restorante, boolean privado,
                   double metrosCuadrados, String nombre, String direccion, String localidad, String gerenteEncargado) {
        
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerenteEncargado);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.restorante = restorante;
    }

    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestorante() {
        return restorante;
    }

    public void setRestorante(boolean restorante) {
        this.restorante = restorante;
    }
     
     
    public void CrearCamping(){
        super.crearEXtraHotelero();
        System.out.println("Camping: ");
       
        System.out.println("Capacidad Maxima de Carpas?");
        this.capMaxCarpas = leer.nextInt();
        System.out.println("Cantidad de Baños?");
        this.cantBanios = leer.nextInt();
        System.out.println("Tiene Restorant? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.restorante = true;
        } else if (op == 'N') {
            this.restorante = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.restorante = false;
        }
        //sirve igual
//        switch (op) {
//            case 'S':
//                this.restorante = true;
//                break;
//            case 'N':
//                this.restorante = false;
//                break;
//            default:
//                System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
//                this.restorante = false;
//                break;
//        }
        
     }

    @Override
    public String toString() {
        String rest = "No posee";// aca hago esto para que me largeu si tiene o no retaurene en la impresion de sout
        if(restorante){
            rest = "Si Posee";
        }
        System.out.println(super.toString());
        return "Camping{" + "capaacidad Max de Carpas=" + capMaxCarpas + "\n, cantBanios=" + cantBanios + 
                "\n, restorante=" + restorante + '}';
    }
    
    
    
}
