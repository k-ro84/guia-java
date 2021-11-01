/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1B.servicio;


import ejercicio1B.entidades.Perro;
import ejercicio1B.enumeraciones.Raza;
import java.util.Scanner;
import ejercicio1B.entidades.Persona;
import ejercicio1B.enumeraciones.Tamanio;

/**
 *
 * @author K-RITO
 */
public class AdopcionServicio {
    private Scanner leer;
    private Persona p=new Persona();
    
    public AdopcionServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    

    public void buscarPerro(Perro choco){
       
        
        System.out.println("     razas actuales disponibles de adopcion:   ");  
            for (Raza aux : Raza.values()) {
              System.out.println(aux.name());
            }
       
        
        System.out.println("    tamaños actuales disponibles de adopcion:   ");  
            for (Tamanio aux : Tamanio.values()) {
              System.out.println(aux.name());
            }
            
        System.out.println("#############################################################"); 
        System.out.println("ingrese una raza de perro de la lista en la que este interesado");
         String buscar = leer.next().toUpperCase();
         
             for (Raza aux : Raza.values()) {
               if (buscar.equalsIgnoreCase(aux.toString())) {
                    choco.setRaza(aux);
                }
            } 
         
        System.out.println("############################################################");
         System.out.println(" Ingrese el tamaño del perro :");
         String ta=leer.next().toUpperCase();
         
             for (Tamanio aux :Tamanio.values()) {
                if(ta.equalsIgnoreCase(aux.toString())){
                    choco.setTam(aux);
                }
            }
        
    } 

    
    public void crearPersona() {
      
        Persona pers=new Persona();
        System.out.println(" datos del adoptante :");
        
        System.out.println("Ingrese el nombre de la persona");
        pers.setName(leer.next());
        System.out.println("ingrese apellido");
        pers.setApellido(leer.next());

        System.out.println("Ingrese la edad de la persona");
        pers.setAnios(Integer.valueOf(leer.next()));
        
        System.out.println("Ingrese el documento de la persona");
        pers.setDni(Integer.valueOf(leer.next()));
 
    }
    
    public void mostrarpersona(){

        System.out.println("personas cargadas: " + p);
    }

}
