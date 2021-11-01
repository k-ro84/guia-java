/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsnum1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

            ArrayList<String> lista = new ArrayList(); // Creamos una lista de Strings

            String palabra;
            String respuesta = "";

            do {
                System.out.println("Ingrese una palabra");
                palabra = leer.next();

                lista.add(palabra);

                System.out.println("Quiere ingresar otra palabra ?");
                respuesta = leer.next();

            } while (respuesta.equalsIgnoreCase("Si"));

            System.out.println("===================================");
            System.out.println("Recorremos la lista con un for each");

            for (String cadena : lista) {

                System.out.println(cadena);
            }

            System.out.println("===================================");
            System.out.println("Recorremos la lista con un iterator");

            Iterator<String> it = lista.iterator();

            while (it.hasNext()) {

                System.out.println(it.next());

            }

            System.out.println("===================================");
            System.out.println("Usamos el iterator para remover un elemento porque con el for each falla");

            Iterator<String> it2 = lista.iterator();

            while (it2.hasNext()) {

                if (it2.next().equals("Hola")) { // Borramos si hay alguna palabra que se hola 

                    it2.remove();

                }
            }

            System.out.println("===================================");
            System.out.println("Mostramos la lista sin el elemento borrado");

            for (String string : lista) {

                System.out.println(string);

            }

            System.out.println("===================================");
            System.out.println("La lista es de tamaño: " + lista.size());

            System.out.println("===================================");
            System.out.println("Eliminamos un elemento mediante el indice");

            lista.remove(1); // Removemos un elemento con su indice

            System.out.println("===================================");
            System.out.println("Mostramos la lista sin el elemento borrado");

            for (String string : lista) {

                System.out.println(string);

            }

            System.out.println("===================================");
            System.out.println("Ordenamos la lista de manera ascendente");

            Collections.sort(lista);

            System.out.println("===================================");
            System.out.println("Mostramos la lista ordenada");

            for (String string : lista) {

                System.out.println(string);

            }

            System.out.println("===================================");
            System.out.println("Ordenamos la lista de manera descendente");

            Collections.sort(lista, Collections.reverseOrder());

            System.out.println("===================================");
            System.out.println("Mostramos la lista ordenada");

            for (String string : lista) {

                System.out.println(string);

            }

            System.out.println("===================================");
            System.out.println("Nos muestra en que indice se encuentra la palabra hola");

            System.out.println(lista.indexOf("Hola"));

            System.out.println("===================================");
            System.out.println("Averiguamos si la lista contiene x elemento");

            if (lista.contains("Hola")) {

                System.out.println("Tiene la palabra hola");

            } else {

                System.out.println("No la tiene");
            }

            System.out.println("===================================");
            System.out.println("Averiguamos si la lista tiene elementos");

            if (lista.isEmpty()) {

                System.out.println("La lista está vacia");

            } else {

                System.out.println("La lista no está vacia");
            }

            System.out.println("===================================");
            System.out.println("Borramos todos los elementos de la lista");
            lista.clear();
    }
    
}
