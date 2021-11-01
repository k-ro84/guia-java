/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicio;

import ejercicio3.entidades.Cartas;
import ejercicio3.entidades.Palos;
import ejercicio3.entidades.baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class BarajarServicio {
  
    Scanner leer ;
     private baraja barajas;
     ArrayList<Cartas> cartas;

    public BarajarServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.barajas = new baraja();
        this.cartas= new ArrayList(barajas.getBaraja());
        
    }
  
      public void llenarBaraja() {
          do {              
              cartas.forEach((aux) -> {
                  System.out.println(aux);
              });
      
          } while (true);
 
    }

    public void barajar(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        
        System.out.println(" ingrese el color que desea para su mazo de cartas");
        String color=leer.next();
        System.out.println("barajando mazo completo");
        //mezcla , selecciona aleatoriamente
        Collections.shuffle(cartas);
 
        System.out.println("Se han barajeado " + cartas + 
               "\n"+ " cartas - de color : "+color);
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
        
    public void siguienteCarta(){ //devuelve la sig carta en la baraj e indica el final
         System.out.println();
         Cartas aux = cartas.get(0);
         cartas.remove(0);
        System.out.println(  " /***************************/|"+"\n" +
                             " |**************************| |"+ "\n\""+   
                             "|                          | |"+"\n\""+   
                             "|                          | |"+"\n\""+   
                             "|                          | |"+"\n\""+
                             "|                          | |"+"\n\""+
                             "|"        +aux +           "| |"+"\n\""+
                             "|                          | |"+"\n\""+     
                             "|                          | |"+"\n\""+
                             "|                          | |"+"\n\""+         
                             "|__________________________|/");
                      
    for (Iterator<Cartas> it = cartas.iterator(); it.hasNext();) {
            Cartas carta = it.next();
            System.out.println(carta);
        }
     System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
   
    public void cartasDisponibles(){ //cuantas cartas quedan
         System.out.println("La cantidad de cartas disponibles para repartir son: " +this.cartas.size() + " cartas");
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
       
    public void darCartas(){//da las cartas que se piden si hay menos no da nada y lo indica
       String respuesta="";
        
        do{
          System.out.println("cuantas cartas quiere mover");
          int mover=leer.nextInt();
        
        if( mover ==cartas.size()){
        }
         System.out.println("Te quedan " + cartas.size() + " cartas en la baraja");
        
         if (mover > mover) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else if (cartas.size()< mover) {
            System.out.println("No hay suficientes cartas que mostrar");
        } else {
               for (Cartas carta : cartas) {
                   System.out.println(""+ carta);
               }
        }
        
        ArrayList<Cartas> mano = new ArrayList();
        
        for (int i = 0; i <= mover; i++)
        {
            mano.add(cartas.get(i));

            cartas.remove(i);
        } 
            System.out.println("desea seguir sacando cartas (S/N)");
            respuesta=leer.next().toUpperCase();
            
        }while(respuesta.equalsIgnoreCase("s"));
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
           
   public void cartasMonton(){ //mostramos las cartas que ya salieron
    
            for (int i = 0; i < cartas.size(); i++) {
                System.out.println(cartas);
            }
       System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");      
   }  
 

    public void mostrarBaraja(){ //muestar todas ls cartas menos la anterior
        if (cartas.size()== 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            for (int i = 0; i < cartas.size(); i++) {
                System.out.println(cartas);
            }
        }
      System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
 
     public void ordenBaraja(){
         
     }
}
