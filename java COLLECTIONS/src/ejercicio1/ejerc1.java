/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


import ejercicio1.entidades.razaPerros;
import ejercicio1.servicio.razaServicio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
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
         
         ArrayList<String> lista = new ArrayList(); // Creamos una lista de Strings

            String nombre,raza;
            String respuesta = "";

            do {
                System.out.println("ingrese el nombre de la mascota:");
                nombre=leer.next();
                
                System.out.println("Ingrese una raza de perro:");
                raza= leer.next();
                
                lista.add("nombre: " + nombre);
                lista.add("raza: " + raza);

                System.out.println("Quiere ingresar otra raza a la lista ?(si/no)");
                respuesta = leer.next();

            } while (respuesta.equalsIgnoreCase("Si"));

            System.out.println("===================================");
            System.out.println("  lista final :");

            for (String cadena : lista) {

                System.out.println( cadena );
            }
            
            System.out.println("La lista es de tamaño: " + lista.size());
         
            
            razaServicio razas=new razaServicio();
            
            razas.crearRaza();
            razas.mostrar();
            razas.tamaño();
                    
            
    }
}
