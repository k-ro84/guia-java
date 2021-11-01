/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicio;
import ejercicio2.entidades.Listado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ListadoServicio {

    private Scanner leer;
    private ArrayList<Listado>listado;

    public ListadoServicio() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.listado=new ArrayList();
    }
  
    public void crearPerro(){
       
           String respuesta = "";
           System.out.println("LISTA DE MASCOTAS :");
            do {
                
                System.out.println("Ingrese una raza de perro:");
                String raza= leer.next().toUpperCase();

                listado.add(new Listado(raza)); //corregir este error

                System.out.println("Quiere ingresar otra raza a la lista ?(si/no)");
                respuesta = leer.next();
                   if(respuesta.equals("no")){
                       System.out.println(" fin del ingreso de razas");
                   }
                           
            } while (respuesta.equals("si"));

            System.out.println("=");
    }
    
    public void tamaño(){
        System.out.println("la lista actual de razas es : ");
           Iterator<Listado> it = listado.iterator();

            while (it.hasNext()) {

                System.out.println(it.next());

            }
        System.out.println("La lista es de tamaño: " + listado.size());
    }
    
    public void mover(){
          
        System.out.println("ingrese la raza a borrar");
        String sacarRaza = leer.next().toUpperCase();   
        
         boolean bandera=false;
         Iterator<Listado> it = listado.iterator();
        while (it.hasNext()) {
            Listado aux = it.next();
            if (aux.getRaza().equals(sacarRaza)) {
                it.remove();
                bandera =true;
                //break;
            }
            if(bandera==false){
            System.out.println("la raza no se encuentra en la lista");
             }
        }
        
     //listado.forEach((p) -> System.out.println(p));         
    }
    public void mostrar(){
       
        System.out.println("Las razas cargadas son");
        for (Listado aux : listado) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad de razas de perro: " + listado.size());
    
    }

    public static Comparator<Listado> ordenarRazas =new Comparator<Listado>(){
        @Override
        public int compare(Listado t, Listado t1) {
           return t1.getRaza().compareTo(t.getRaza());
        }
    };
            
} 
    