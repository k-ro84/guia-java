/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.entidades;
//Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
//String. El programa pedirá una raza de perro en un bucle, el mismo se guardará

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
//quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
/**
 *
 * @author K-RITO
 */
public class razaPerros {
  
    private String razas;

    public razaPerros() {
    }

    public razaPerros(String razas) {
        this.razas = razas;
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    @Override
    public String toString() {
        return "razaPerros{" + "razas=" + razas + '}';
    }

    
}
