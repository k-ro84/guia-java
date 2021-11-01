/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.servicio;

import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.RevolverDeAgua;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class JuegoServicio {
    
    private Scanner leer;
    ArrayList<Jugador>jugadores; 
    private RevolverDeAgua r;
    
   public JuegoServicio() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.jugadores=new ArrayList();
        this.r =  new RevolverDeAgua();
    }    
   
   public void llenarJuego(){
       System.out.println("**********************bienvendixs fiesteros**********************");
       System.out.println("         las reglas son simples: "+
              "\n"+ "1- evitar el disparo letal"+
              "\n"+ "2- Ser la ultima persona en pie");
       System.out.println("Preparados???....");
     
          System.out.println("ingrese el numero de valientes ");
          int num=leer.nextInt();
          if (num > 6 || num<= 0) {
            num = 6;
           System.out.println("solo se permiten hasta 6 jugadores por ronda");
           }
      
       for (int i = 0; i < num; i++) {
           Jugador j=new Jugador();
         System.out.println("ingrese el nombre/apodo del jugador");
        j.setNombre(leer.next().toUpperCase());
        j.setId(i+1);
        jugadores.add(j);
       }
   }

   public void mostrarJugadores(){
     
        System.out.println("_______________________________________________");
        System.out.println("**        planilla de inscriptos         **");
        for (Jugador players :  jugadores) { // Aca los mostramos en un for each

            System.out.println("   lista final de jugadores:  "  
                    + "\n"  +   jugadores);
          break; 
       }
          System.out.println( "   ____________________________________   ");
          System.out.println("             la lista actual de jugadores  : ");
          Iterator<Jugador> it = jugadores.iterator();

        while (it.hasNext()) {
                System.out.println( it.next());
        }
        
    }
//    public void verJugadores() {   otra forma de muestra foreach
//        jugadores.forEach(jugador -> {
//            System.out.println(jugador);
//    });
//    }
    public void tamanioPlanilla(){
        System.out.println("_____________________________________________________");
          System.out.println(" La panilla es de tamaño: " +  "[" + jugadores.size() + "]");
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
    }
   
  
    public void ronda(){
      int  cont=0;
        for (int i = 0; i <jugadores.size(); i++){
                   cont++; 
        
              jugadores.get(i).disparar(r);
            System.out.println( "es oficial : [" + jugadores.get(i).getNombre() + "]" );

            if (jugadores.get(i).ismojado()) {
                 
                System.out.println("El jugador  : " + jugadores.get(i).getNombre() + " perdio");
                  System.out.println("fin del juego!!!!!!!!!!!!!!!!!!");
                break;  
            } else {
                System.out.println("El jugador : "+jugadores.get(i).getNombre() +jugadores.get(i).isVivo()+ " se salvo!");
                
            }
        }
  
    }
   
    public boolean finJuego() {
       boolean vivo=true;
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("los jugadores de pie son "+ jugadores.get(i).ismojado());
        }
        return false; //No termina el juego
    }
    public void muestraJugadores(){
        jugadores.forEach(jugador -> {
            System.out.println(jugador);
         
        });
        
    }

    
      
}
