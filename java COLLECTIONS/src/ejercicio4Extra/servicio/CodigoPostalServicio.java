/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4Extra.servicio;

import ejercicio4Extra.comparadores.comparadores4E;
import ejercicio4Extra.entidades.CodigoPostal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author K-RITO
 */
public class CodigoPostalServicio {
    
      private Scanner leer;
    private HashMap<String,CodigoPostal>cPostal;

    public CodigoPostalServicio( ) {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.cPostal= new HashMap<>();
       cPostal.put("Adlershof",new CodigoPostal("Berlin",12487));
       cPostal.put("Britz",new CodigoPostal("Berlin",12347));
       cPostal.put("Allermöhe",new CodigoPostal("Hamburg",21037));
       cPostal.put("Bruxelles",new CodigoPostal("Région Bruxelles-Capitale",1000));
       cPostal.put("Assen",new CodigoPostal("Drenthe",9400));
       cPostal.put("Abla",new CodigoPostal("Almeria",04510));
       cPostal.put("Huelva",new CodigoPostal("Chucena",21891));
       cPostal.put("Agrate Brianza",new CodigoPostal("Monza e Brianza",20864));
       cPostal.put("La Serra",new CodigoPostal("Acquaviva",47892));
       cPostal.put("La Villette",new CodigoPostal("Vire",14570));
    }
    
        /*
        ingreso de nuevo codigo
        */
    public void crearCodigo(){
        System.out.println("         ====== empresa de envio de granos=======");
        System.out.println("======= codigos postales de envio al extranjero =======");
        char op;
        do {
            System.out.println("Ingrese el nombre de la Ciudad :");
            String ciudad = leer.next().toUpperCase();
            System.out.println("Ingrese el localidad : ");
            String localid = leer.next().toUpperCase();
            System.out.println("Ingrese el codigo postal : ");
            Integer cp = leer.nextInt();
            //De este modo agrego elementos a un mapa. El primer termino se corresponde a la KEY
            cPostal.put(ciudad, new CodigoPostal(localid, cp));
            System.out.println("Desea agregar otro producto? S/N : ");
            op = leer.next().toUpperCase().charAt(0);
        } while (op == 'S');

    }
         /*
        muestra los codigos
        */
    public void mostrarCodigo(){
        System.out.println("===================================================");
        System.out.println(" destinos  de envios: :");
        for (Map.Entry<String, CodigoPostal> entry : cPostal.entrySet()) {
            String key = entry.getKey();
            CodigoPostal value = entry.getValue();
  
            System.out.println("Ciudad  " + entry.getKey() + "  -  " + entry.getValue());
     
        }
    }
        /*
        los cuenta
        */
    public void cantidadCodigos(){
        System.out.println("===================================================");
        System.out.println(" La lista actuales lugares de envio tiene un tamaño : " + "[" + cPostal.size()+ "]");
        
    }
    
        /*
        modifica datos 
        */
    public void RetirarCiudad(){
        
         System.out.println( "ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          System.out.println("             la lista actual de ciudades es : ");
            System.out.println("Que ciudad quiere eliminar ? ");
            String borrar = leer.next().toUpperCase();
            borrar=leer.next().toUpperCase();
            borrar=leer.next().toUpperCase();

              if (cPostal.containsKey(borrar)) {
                    cPostal.remove(borrar);
                      System.out.println("la ciudad ingresado a sido desvinculado de los envios" + 
                          " \n "+ "ciudades aun con contrato: "+ cPostal);
                } else {

                System.out.println("La ciudad a eliminar no se encuentra registrado oficialmente ");
               }
        }

    public void OrdenAlfabetico(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println(" Paises ingresados por orden alfabetico (A-Z):");
        TreeMap<Integer, String> postalTree = new TreeMap();
        System.out.println(""+ postalTree);
    }
  
}
//Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
//• Muestra por pantalla los datos introducidos
//• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
//usuario.
//• Muestra por pantalla los datos
//• Agregar una ciudad con su código postal correspondiente más al HashMap.
//• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
//• Muestra por pantalla los datos