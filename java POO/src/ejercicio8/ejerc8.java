/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import ejercicio8.entidades.Cadena;
import ejercicio8.servicio.cadenaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         cadenaServicio cadena=new cadenaServicio();
      
         System.out.println("Ingrese la frase");
         cadena.crearFrase(leer.nextLine()); 
         
         System.out.println("La cantidad de vocales que tiene es: "
         + cadena.mostrarVocales());
         
         System.out.println("La frase invertida es: " + cadena.invertirFrase());
         
         System.out.println(" La letra A se repite : "
                  + cadena.vecesRepetido("a")+ " veces, " 
                  +" la letra E se repite : "  +cadena.vecesRepetido("e")+" veces, "
                  +" la letra I se repite : "  +cadena.vecesRepetido("i")+" veces, "
                  +" la letra O se repite : "  +cadena.vecesRepetido("o")+" veces, "
                  +" la letra U se repite : "  +cadena.vecesRepetido("u")+" veces. ");

         System.out.println("Ingrese la letra que desea colocar");
         cadena.reemplazarLetra(leer.nextLine());
        
         System.out.println("Ingrese palabra a unir");
         cadena.unirFrases(leer.nextLine());
         
         System.out.println("Ingrese la letra a buscar");
        if (cadena.contiene(leer.nextLine())) {
            System.out.println("Si la contiene");
        } else {
            System.out.println("No la contiene");
        }
        
        //extra no lo pide, elimina la nueva cadena y deja la original
        System.out.println("desea ver la frase original nuevamente?");
        String resp=leer.next();        
        if(resp.equals("s") || resp.equals ("S")){
          cadena.partescadena(leer.nextLine());
       }else{
            System.out.println(" fin del programa ");
         }
    }
} 
