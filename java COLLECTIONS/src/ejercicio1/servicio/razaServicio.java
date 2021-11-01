/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.servicio;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio1.entidades.razaPerros;


/**
 *
 * @author K-RITO
 */
public class razaServicio {
    private Scanner leer;
    //private ArrayList<razaPerros>raza;
    public razaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
     // this.raza = newArrayList();
    }
 
    ArrayList<String> lista = new ArrayList(); 
     
    public void crearRaza(){
        String nombre,raza;
        String respuesta = "";
        System.out.println("LISTA DE MASCOTAS :");
            do {
                System.out.println("ingrese el nombre de la mascota:");
                nombre=leer.next();
                
                System.out.println("Ingrese una raza de perro:");
                raza= leer.next();
                
                lista.add(" nombre: " + nombre);
                lista.add(" raza: " + raza);

                System.out.println("Quiere ingresar otra raza a la lista ?(si/no)");
                respuesta = leer.next();

            } while (respuesta.equalsIgnoreCase("Si"));

            System.out.println("===================================");
    }  
    
    public void mostrar(){
        System.out.println("  lista final :");
        for (String cadena : lista) {
            System.out.println( cadena );
        }
    }
    
    public void tamaño(){
        System.out.println("La lista es de tamaño: " + lista.size());
    }
  
    
}
