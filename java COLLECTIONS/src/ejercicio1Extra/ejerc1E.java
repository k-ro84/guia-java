/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1Extra;

import java.util.ArrayList;
import java.util.Iterator;
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
         
         ArrayList<Integer> enteros = new ArrayList();

        Integer num=0, suma=0;
      

        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            enteros.add(num);

             if (num != 99) {
                enteros.add(num);
                suma += num;
             }
    
        } while (num!=99);
          //suma
          System.out.println("===================================");
          System.out.println(" suma  del ArrayList" + suma);
          
          //promedio
          System.out.println("===================================");
          System.out.println("promedio general de los numeros ingresados" +" \n"
                + suma/enteros.size());
          
        //muestra de array
        System.out.println("===================================");
        System.out.println("Mostramos el ArrayList con un forEach");

        for (Integer numero : enteros) {

            System.out.println(numero);

       }
 
        System.out.println("===================================");
        System.out.println("Recorremos la arrayList con un iterator");

        Iterator<Integer> it = enteros.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
           
        }

        System.out.println("===================================");
        System.out.println("Usamos el iterator para remover un elemento porque con el for each falla");

        Iterator<Integer> it2 = enteros.iterator();
        System.out.println("ingrese un numero a modificar");
        int numborrar=leer.nextInt();
        while (it2.hasNext()) {

            if (it2.next().equals(numborrar)) { 

                it2.remove();

            }
        }

        System.out.println("===================================");
        System.out.println("Mostramos el Arraylist sin el elemento borrado");

        for (Integer numero : enteros) {

            System.out.println(numero);
            
        }

        System.out.println("===================================");
        System.out.println("La ArrayList de tamaño: " + enteros.size());

        System.out.println("=====================================");
        System.out.println("Averiguamos si el arrayList contiene x elemento");

        if (enteros.contains(99)) {

            System.out.println("Tiene el numero99");

        } else {

            System.out.println("No lo tiene");
        }

        System.out.println("===================================");
        System.out.println("Averiguamos si el arrayList tiene elementos");

        if (enteros.isEmpty()) {

            System.out.println("El arrayList está vacio");

        } else {

            System.out.println("El arraylist no está vacio");
        }

        System.out.println("=====================================");
        System.out.println("Borramos todos los elementos de Array");
        enteros.clear();
         System.out.println("============================================");

    }
    
}
