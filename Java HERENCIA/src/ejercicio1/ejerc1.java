/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import ejercicio1.entidades.Animal;
import ejercicio1.entidades.Caballo;
import ejercicio1.entidades.Gato;
import ejercicio1.entidades.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
        
        Animal perro= new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();
        
        Perro perro1= new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.Alimentarse();
                
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 15, "Fino");
        caballo.Alimentarse();      
             
          ArrayList <Animal>  listaAnimales= new ArrayList<>();
          
          listaAnimales.add(perro);
          listaAnimales.add(perro1);
          listaAnimales.add(gato);
          listaAnimales.add(caballo);
          
            listaAnimales.size(); 
          //Recorro la lista para imprimir - IMPRIMO TODOS LOS OBJETOS  -
        System.out.println("******TODOS LOS ANIMALES QUE ESTAN EN MI LISTA******");
        for (Animal unitario : listaAnimales) {
            unitario.Alimentarse();//Uso el mimso metodo.. q segun que tipo de OBJETO
                                    //es, hace lo especifico a la clase
        }
        
        
//        RECORRO CON ITERATOR
//        for (Iterator<Animal> it = listaAnimales.iterator(); it.hasNext();) {
//            Animal unitario = it.next();
//            unitario.Alimentarse();//Uso el mimso metodo.. q segun que tipo de OBJETO
//            //es, hace lo especifico a la clase
//        }
//        
//         2 FORMA DE FOREACH
//         listaAnimales.forEach((unitario) -> {
//            unitario.Alimentarse();//Uso el mimso metodo.. q segun que tipo de OBJETO
//            //es, hace lo especifico a la clase
//        });
        

     
        
        
        
         

    }
    
}
