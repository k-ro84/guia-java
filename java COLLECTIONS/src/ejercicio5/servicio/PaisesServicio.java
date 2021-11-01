/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicio;


import ejercicio5.comparadores.comparadores5;
import ejercicio5.entidades.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class PaisesServicio {
     private Scanner leer;
    private ArrayList< Paises >paises;

    public PaisesServicio( ) {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new ArrayList();
    }
    
    public void CrearPaises(){
         System.out.println("                   INSCRIPCION DE PAISES              ");
         System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
         String respuesta = "";
          do {
                Paises pa1=new Paises();
                
                System.out.println("           Ingrese un Pais         ");
                String pais = leer.next();
                
                pa1.setPais(pais);
               
                
                 paises.add(pa1);
                System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
                System.out.println("Quiere ingresar un nuevo Pais(si/no)?");
                respuesta = leer.next();

            } while (respuesta.equalsIgnoreCase("Si"));
       
    }
    
    public void mostrarPaises(){
        System.out.println(" ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         for (Paises global :  paises) { // Aca los mostramos en un for each

            System.out.println( "  Paises inscriptos  :  "  
                    + "\n"  +   paises);
            break;
         }
    }
    
    public void cantidadPaises(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        System.out.println(" La lista de Paises tiene un tamaño : " + "[" + paises.size()+ "]");
        
    }
    
    public void OrdenAlfabetico(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" Paises ingresados por orden alfabetico inverso (A-Z):");
        Collections.sort(paises, comparadores5.porAlfabeto);
          for (Paises mundial : paises) { // Aca los mostramos ordenados en un for each 

            System.out.println(paises);
          }
    }
    
    public void OrdenAlfabeticoInverso(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" Paises ingresados por orden alfabetico inverso (Z-A):");
        Collections.sort(paises, comparadores5.porAlfabetoInverso);
          for (Paises mundial : paises) { // Aca los mostramos ordenados en un for each 

            System.out.println(paises);
          }
    }
    
    public void RetirarPais(){
         System.out.println( "ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          System.out.println("             la lista actual de Paises es : ");
          
          Iterator<Paises> it = paises.iterator();
            
        boolean eliminado=true;
            System.out.println("Que Pais quiere eliminar ? ");
            String borrar = leer.next();
        while (it.hasNext()) {
               if (it.next().getPais().equalsIgnoreCase(borrar)) {
                    it.remove();
                    eliminado = true; // Cuando se elimina pasamos el booleano a true
                }

       }

            if (eliminado) {

                for (Paises pais : paises) { // Aca los mostramos en un for each

                    System.out.println("El Pais ingresado a sido desvinculado de este evento" + 
                          " \n "+ "Paises aun participantes: "+ paises);
                  break;
                }

            } else {

                System.out.println(" El Pais a eliminar no se encuentra registrado oficialmente ");
             
            }

    }
    
}
