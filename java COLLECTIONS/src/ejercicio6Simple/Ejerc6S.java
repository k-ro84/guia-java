/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6Simple;

import ejercicio6Simple.entidades.Supermercado;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author K-RITO
 */
public class Ejerc6S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
        
        HashMap<String, Double> supermercado = new HashMap();

        int respuesta;
        supermercado.put("ravioles de ricota x500gr",50.80);
        supermercado.put("ravioles de verdura x 500gr",48.80);
        supermercado.put("aceite de girasol x 1,5lt",70.50);
        supermercado.put("postre dulce de leche 2 200 gr",25.99);
        supermercado.put("margarina x 200gr",42.70);
        supermercado.put("leche de soja x 1lt",34.60);
        supermercado.put("papel de cocina 3 x 100mts c/u",210.30);
        supermercado.put("servilletas de papel x 100 unid",70.40);
        
        
        do {
            System.out.println("ªªªªªªªªªªªªªª MENU ªªªªªªªªªªªªªªªªª");
            System.out.println("       Supermercado Lucero           ");
            System.out.println(" 1: Mostrar todos los Productos      ");
            System.out.println(" 2: Introducir un Producto           ");
            System.out.println(" 3: Modificar Precio                 ");
            System.out.println(" 4: Borrar un Producto               ");
            System.out.println(" 5: Item contenidos de productos     ");
            System.out.println(" 6: Salir                            ");
            System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
            respuesta = leer.nextInt();

            switch (respuesta) {
                case 1:
                    mostrarProductos(supermercado);
                    break;
                case 2:
                    ingresarProductos(supermercado);
                    break;
                case 3:
                    modificar(supermercado);
                    break;
                case 4:
                    borrarProducto(supermercado);
                    break;
                case 5:
                    tamañoPlanilla(supermercado);
            }

        } while (respuesta != 6);
    }
    
    public static void mostrarProductos(HashMap<String, Double> supermercado){
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        for (Map.Entry<String, Double> aux : supermercado.entrySet()) {
            Object key = aux.getKey();
            Object value = aux.getValue();
            System.out.println(key + "   - $" + value);
            System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        }
    }
    
    public static HashMap ingresarProductos(HashMap<String, Double> supermercado){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
         System.out.println("ingrese producto : ");
         String producto = leer.next().toUpperCase();
         System.out.println("ingrese precio : ");
         double precio=leer.nextDouble();
                 
         
         supermercado.put(producto, precio);
          return supermercado;
    }

     public static void modificar(HashMap<String, Double> supermercado) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        System.out.println("Ingresa el nombre del producto : ");
        String buscado = leer.next().toUpperCase();

        if (supermercado.containsKey(buscado)) {

            System.out.println("Ingrese el nuevo precio : ");
        
            supermercado.put(buscado,leer.nextDouble());
           
            
        } else {
            System.out.println("No se encontro el producto.");
        }
     }
     
     public static void borrarProducto(HashMap<String, Double> supermercado){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
          System.out.println("Ingrese el nombre del Producto : ");
         String  buscado = leer.next().toUpperCase();

        if (supermercado.containsKey(buscado)) {
           supermercado.remove(buscado);
        } else {
            System.out.println("No se encontro el producto");
        }
     }
     
     public static void tamañoPlanilla(HashMap<String, Double> supermercado){
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        System.out.println(" La lista de Productos tiene un tamaño : " + "[" + supermercado.size()+ "]");
     }
 
}
