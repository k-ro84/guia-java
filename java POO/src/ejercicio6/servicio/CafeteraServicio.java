/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.servicio;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Cafetera cafetera=new Cafetera();
     
     public int servirTaza;
     public double llenarCafetera;
     public double vaciarCafetera;
     
       
        public void llenarCafetera(){
             double capacidadMaxima=cafetera.getCapacidadMaxima();//aca llamo al get ara que traiga el valor
             cafetera.setCantidadActual(capacidadMaxima);//aca igualo el valor incial con la cantidad actual de cafe
             
         }
        
        //pedir el tamaño d taza al usuario, si el tamaño de la taza no coninciede  con la cant actual....
           
        
        public void servirTaza(int taza) {
            System.out.println("             bienvenido            ");
         double cantidadTotal = cafetera.getCantidadActual();//le cambio vaor asi es mas facil hacer los nuevos calculos
           System.out.println("ingrese el tamaño de su taza de cafe(250,500)");
             taza=leer.nextInt();
             
          if (cantidadTotal == 0) { //cantidad de cafe que hay en la maquina
             System.out.println("No hay cafe, por favor rellene la cafetera");
            // a medida que pide se va vaciando
           } else {
            if (cantidadTotal < taza) {
                System.out.println("La taza no se lleno completamente");
                System.out.println("La taza se lleno en " + cantidadTotal + " unidades");
                System.out.println("puede encontrar los endulzantes a la derecha de la maquina");
                cafetera.setCantidadActual(0);
            } else {
                System.out.println("La taza se lleno completamente,disfrutelo");
                System.out.println("puede encontrar los endulzantes a la derecha de la maquina");
                cafetera.setCantidadActual(cantidadTotal - taza);
            }
            
         }
        }
        

        public void vaciarCafetera() { ///indica que la cafetera esta vacia
            cafetera.setCantidadActual(0);
            System.out.println("        CAFETERA VACIA        ");
        }
        
        
        public void agregarCafe() {  ///orden de llenar cafetera
            System.out.println("desea agregar cafe ?: s/n");
            String opcion=leer.next();
         
             if(opcion.equals ("s" )|| opcion.equals("S")){
              
                System.out.println(" cuanto cafe desea ingresar?(ml)");
                double cantidad=leer.nextDouble();
                    if(cantidad == cafetera.getCapacidadMaxima() ){
                    System.out.println("agregando cafe(ml)...");
                    }else
                        if(cantidad < cafetera.getCapacidadMaxima() ){
                            System.out.println("usted agrego : " + cantidad + "ml,es posible reiniciar el pedido");
                     }else{
                     System.out.println("cantidad de cafe a ingresar mayor a la capacidad de la cafetera");
                  }
             }else{
                  System.out.println("              que tenga buen dia/noche                ");
             }
            
        }
} 
         
