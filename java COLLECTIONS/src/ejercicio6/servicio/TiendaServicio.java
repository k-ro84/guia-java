/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicio;


import ejercicio6.comparadores.comparadores6;
import ejercicio6.entidades.Tienda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class TiendaServicio {
     private Scanner leer;
     HashMap<Integer, Tienda> mapaTienda;

    public TiendaServicio() {
        this.leer =new Scanner(System.in).useDelimiter("\n");
        this.mapaTienda = new HashMap<>();
    }

    public void ingresoListado() {
      String opc;

        do {

            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next().toUpperCase();
            System.out.println("Ingrese el precio del producto ");
            Double precio = leer.nextDouble();
            System.out.println("ingrese el codigo el producto");
            Integer codigo=leer.nextInt();
            //De este modo agrego elementos a un mapa.
            mapaTienda.put(codigo,new Tienda(codigo,nombre,precio));

            System.out.println("Desea agregar otro producto? S/N");
            opc = leer.next().toUpperCase();

        } while (opc.equalsIgnoreCase("S"));
    }
    
    public void mostrarProductos(){
        System.out.println(" ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         for (Iterator<Map.Entry<Integer, Tienda>> it = mapaTienda.entrySet().iterator(); it.hasNext();) {
             Map.Entry<Integer, Tienda> entry = it.next();
             System.out.println( "codigo :  "
                     + "\n"  +   mapaTienda);
             break;
             
         }
    }
    
    public void productosEnstock(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        System.out.println(" La lista de Paises tiene un tamaño : " + "[" + mapaTienda.size()+ "]");
        
    }
    
    public void buscarEliminar() {
        System.out.println("Ingrese el Codigo del Producto");
        Integer buscado = leer.nextInt();

        if (mapaTienda.containsKey(buscado)) {
            mapaTienda.remove(buscado);
        } else {
            System.out.println("No se encontro el producto");
        }
    }
    
     public void modificar() {

        System.out.println("Ingresa el codigo del producto");
        Integer buscado = leer.nextInt();

        if (mapaTienda.containsKey(buscado)) {

            Tienda aux = mapaTienda.get(buscado);

            System.out.println("Ingrese el nuevo precio");
            aux.setPrecio(leer.nextDouble());

            mapaTienda.put(buscado, aux);
           
            
        } else {
            System.out.println("No se encontro el producto");
        }
    }
     
     
     
    
     public void OrdenProductos(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" productos ingresados por orden :");
         for (Map.Entry<Integer, Tienda> entry : mapaTienda.entrySet()) {
             Integer key = entry.getKey();
             Tienda value = entry.getValue();
             
         }
    }
     public void codigos(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" codigos ingresados");
         for (Map.Entry<Integer, Tienda> entry : mapaTienda.entrySet()) {
             Integer key = entry.getKey();
             Tienda value = entry.getValue();
             
         }
    }
}
