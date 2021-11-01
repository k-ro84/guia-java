/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.entidades.Electrodomesticos;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         Lavadora lavadora= new Lavadora();
        
        Televisor televisor= new Televisor();
        
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
      
//        lavadora.creaElectrodomestico();
        lavadora.crearLavarropa();
        System.out.println("segundo electrodomestico");
//        televisor.creaElectrodomestico();
        televisor.crearTelevisor();
        
        ArrayList<Electrodomesticos> listaElectro = new ArrayList<>();
        
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        listaElectro.add(televisor);
        listaElectro.add(lavadora);
        
        lavadora.listaFinal();
        televisor.listaFinal();
       
        
       
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         System.out.println("la lista es de tamaño : " +listaElectro.size());
                 
     
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          
        for (Iterator<Electrodomesticos> iterator = listaElectro.iterator(); iterator.hasNext();) {
            Electrodomesticos next = iterator.next();

        }
       
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("===================================");
            System.out.println("Averiguamos si la lista tiene elementos");

            if (listaElectro.isEmpty()) {

                System.out.println("La lista está vacia");

            } else {

                System.out.println("La lista no está vacia, y tiene :\n "  + listaElectro.size() + " productos.");
            }
  
       
         // no puedo usarlos        
//        System.out.println("***VEMOS LO QUE MUESTRA CON ORDINAL***");
//        for (Electrodomesticos electrodomesticos : listaElectro.values()) {
//             System.out.print(electrodomesticos.ordinal() + "  ");
//        }


         System.out.println("===================================");
            System.out.println("Ordenamos la lista de manera descendente");

            Collections.sort(listaElectro, Collections.reverseOrder());

        System.out.println("=============================================================");
        double total = 0;
        double totalTelevisiones = 0;
        double totalLavadoras = 0;
       for (Electrodomesticos electrodomestico : listaElectro) {
         //foraech donde hago llamado a cada clase hija atravez de la clase madre
            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += electrodomestico.getPrecio();
                //suma
            }

            if (electrodomestico instanceof Televisor) {
                totalTelevisiones += electrodomestico.getPrecio();
            }
             //contadr total 
            total += electrodomestico.getPrecio();
        }

        System.out.println("El total es de compras es " + total+"\n");
         System.out.println("El total para las lavadoras es de " + totalLavadoras);
        System.out.println("El total para los televisores es de " + totalTelevisiones);
       
   

         System.out.println("===================================");
            System.out.println("Borramos todos los elementos de la lista");
            listaElectro.clear();

            
            


          //con el otro metodo

          //Creamos un array de Electrodomesticos
//        Electrodomesticos listaElectrodomesticos[]=new Electrodomesticos[10];
//   
//        //Asignamos cada una de las posiciones como queramos
//        listaElectrodomesticos[0]=new Electrodomesticos(200, 60, 'C', "Verde");
//        listaElectrodomesticos[1]=new Lavadora(150, 30);
//        listaElectrodomesticos[2]=new Televisor(500, 80, 'E', "negro", 42, false);
//        listaElectrodomesticos[3]=new Electrodomesticos();
//        listaElectrodomesticos[4]=new Electrodomesticos(600, 20, 'D', "gris");
//        listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
//        listaElectrodomesticos[6]=new Televisor(250, 70);
//        listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "verde", 15);
//        listaElectrodomesticos[8]=new Televisor(200, 60, 'C', "naranja", 30, true);
//        listaElectrodomesticos[9]=new Electrodomesticos(50, 10);
//   
//        //Creamos las variables que usaremos para almacenar la suma de los precios
//        double sumaElectrodomesticos=0;
//        double sumaTelevisiones=0;
//        double sumaLavadoras=0;
//   
//        //Recorremos el array invocando el metodo precioFinal
//        for(int i=0;i<listaElectrodomesticos.length;i++){
//            /*
//             * Cuando una Television o una Lavadora este en la posicion del array actual,
//             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
//             * Ejecutamos en cada uno su propia version del metodo precioFinal
//             */
//   
//            if(listaElectrodomesticos[i] instanceof Electrodomesticos){
//                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
//            }
//            if(listaElectrodomesticos[i] instanceof Lavadora){
//                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
//            }
//            if(listaElectrodomesticos[i] instanceof Televisor){
//                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
//            }
//        }
//   
//        //Mostramos los resultados
//        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
//        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
//        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
//     
    }
}
