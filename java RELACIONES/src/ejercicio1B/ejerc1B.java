/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1B;

import ejercicio1B.entidades.Perro;
import ejercicio1B.entidades.Persona;
import ejercicio1B.servicio.AdopcionServicio;
import java.util.Scanner;
import ejercicio1B.enumeraciones.Raza;
import ejercicio1B.enumeraciones.Tamanio;

/**
 *
 * @author K-RITO
 */
public class ejerc1B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         AdopcionServicio ap=new AdopcionServicio();
        //creo mis perros aca
       

        //String nombre, Integer edad, Raza raza, Tamanio tamanio
        Perro p1 = new Perro("Lolo", 4);
        ap.buscarPerro(p1);
        Perro p2 = new Perro("Dinamita", 1);
        ap.buscarPerro(p2);

        //String nombre, String apellido, Integer edad, long dni, Perro mascota
       

        Persona pe1 = new Persona("loli", "terre", 41,  30444545,p1);
        Persona pe2 = new Persona("pol", "arget", 70,  5454545,p2);
        
        System.out.println(pe1);
        System.out.println(pe2);

        
        ap.crearPersona();
        ap.mostrarpersona();
        
       
    }
    
}
