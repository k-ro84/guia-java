/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.Servicio.personaServicio;
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

  
       
      personaServicio sp = new personaServicio();
        //String nombre, int edad, String sexo, float peso, float altura
       
      
       
        Persona p1 = new Persona();
        
        p1.setNombre("lolo");
        p1.setEdad(41);
        p1.setSexo("H");
        p1.setPeso(98.0);
        p1.setAltura((1.80));
       

        Persona p2 = new Persona("William", 33, "H", 78.9, (1.86));
        //Persona p2 = sp.crearPersona();

        Persona p3 = new Persona("Alina", 17, "M", 37.7, (1.52));
        //Persona p3 = sp.crearPersona();

   
        
        
        System.out.println(p1);
        sp.calcularIMC(p1);
        sp.esMayorDeEdad(p1);// no me deja inicializar hasta que le di un valor al obejto dentro de este metodo en servicio

        System.out.println(p2);
        sp.calcularIMC(p2);
        sp.esMayorDeEdad(p2);

        System.out.println(p3);
        sp.calcularIMC(p3);
        sp.esMayorDeEdad(null);

        sp.Resultados(3);

         
    }
    
}
