/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import java.util.Scanner;


/**
 *
 * @author K-RITO
 */
public class ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //traigo el objeto(perro) lo renombro y lo relleno
        
        Perro m1 = new Perro("tito","caniche",5,"Pequeño");
        Perro m2 = new Perro("puka","pitbull",8,"Mediana");
        
        // a la persona la llamo y le agrego el nuevo perro creado
        Persona p1 = new Persona("J.M.","Lopez",34,"30048344",m1);
        Persona p2 = new Persona("Lucrecia","Mendez",23,"42638847",m2);
        
        //imprimo la asociacion simple persona-perro
        System.out.println(p1);
        System.out.println(p2);
    }
    
}
