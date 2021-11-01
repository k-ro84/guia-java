/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E;

import ejercicio1E.servicio.AdopcionServicio;
import ejercicio1E.servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc1E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc="";

            AdopcionServicio adoptar = new AdopcionServicio();
            PersonaServicio adopta=new PersonaServicio();
            
            
            adopta.CrearPersona();
            
            adopta.imprimirPersonas(); // LA IMPRIMO CON LOS CAMBIOS
              
            adoptar.PerroSinFamilia(); 
            adoptar.cargarPerros();
            adoptar.imprimirPerros();
         
        System.out.println("Ingresa el nombre de la persona que va a adoptar un perro");
        String adoptante = leer.next().toUpperCase();
        System.out.println("***LOS PERROS QUE NO TIENE  DUENIO***");
        adoptar.PerroSinFamilia();
        System.out.println("Ingresa nombre del perro");
        String nomb = leer.next();
        adopta.asignarlePerro(nomb, adoptar, adoptante);
        System.out.println("***IMPRIMO LAS PERSONAS NUEVAMENTE PARA VER QUE TIENE UN PERRITO***");
        adopta.imprimirPersonas();
        System.out.println("***perros aun sin familia adoptante***");
        adoptar.PerroSinFamilia();
        System.out.println("");
           
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("lista de personas adoptantes");
        System.out.println("en orden alfabetico ascendente");
            adopta.ordenarDeAaZ();
        System.out.println("en orden alfabetico descendente");
            adopta.ordenarDeZaA();//ORDENO LA LISTA
          
           // adoptar.eliminarPersona();//LLAMO AL METODO PARA ELIMINAR
           
        System.out.println("lista de perros originales para adopcion");
            adoptar.imprimirPerros();//Imprimo a todos los departamentos para 
         System.out.println("lista de perros en adopcion en ordden alfabetico ascendente");
            adoptar.ordenarPerrosAaZ();
         //Creo instancia de mis servicios para poder acceder a sus metodos.

    }

        
}
