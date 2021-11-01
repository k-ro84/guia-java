/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Extra.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CantanteFamoso {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    private String cantante;
    private String discoMasVendido;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String cantante, String discoMasVendido) {
        this.cantante = cantante;
        this.discoMasVendido = discoMasVendido;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "cantante=" + cantante + ", discoMasVendido=" + discoMasVendido + '}';
    }
    
    
    
}
