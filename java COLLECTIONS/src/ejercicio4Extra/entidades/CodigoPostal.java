/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4Extra.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CodigoPostal {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String ciudad;
    private Integer codPostal;

    public CodigoPostal() {
    }

    public CodigoPostal(String ciudad, Integer codPostal) {
        this.ciudad = ciudad;
        this.codPostal = codPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(Integer codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "CodigoPostal{" + "ciudad=" + ciudad + ", codPostal=" + codPostal + '}';
    }
    
    
    
}
