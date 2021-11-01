/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.servicio;

import ejercicio1E.entidades.Perro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class AdopcionServicio {
    
    private Scanner leer;
    
     private ArrayList<Perro> Adoptables = new ArrayList();
     
     
    public AdopcionServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
           Perro canino = new Perro("Odie",3,"caniche","tipico");
           Perro canino2= new Perro("Luke",2,"dogo argentino","grande");
           Perro canino3= new Perro("Chicha",10, "mestiza","mediana");
           Perro canino4= new Perro("Egon",5,"mastin napolitano","gigante");
           Perro canino5= new Perro("Nina",3,"sharpei","mediana");
           Perro canino6= new Perro("Killer",4,"bulldog frances","chico");
           Perro canino7= new Perro("Bronco",9,"labrador","grande");
            Adoptables.add(canino);
            Adoptables.add(canino2);
            Adoptables.add(canino3); 
            Adoptables.add(canino4); 
            Adoptables.add(canino5);
            Adoptables.add(canino6); 
            Adoptables.add(canino7);
   
    }
    
    public ArrayList<Perro> getAdoptables() {
        return Adoptables;
    }

    public void setAdoptables(ArrayList<Perro> Adoptables) {
        this.Adoptables = Adoptables;
    }
    

    public void cargarPerros() {
        //Otra opcion de carga, creo un OBJETO usando constructor vacio, y seteo sus atributos
        Perro cargaPerro= new Perro();//englobo en un nuevo atributo
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        
        System.out.println("ingresa nuevo perro");
        System.out.println("Ingrese el nombre del perro");
          String nomb = leer.next();
        System.out.println("ingrese la edad de " + nomb);
          int EdadP =leer.nextInt();
        System.out.println("ingrese la raza de " + nomb);
          String razaP =leer.next();
        System.out.println("ingrese la altura de " + nomb);
          String altura =leer.next();
       
        cargaPerro.setNombre(nomb); // Modifico valores del atributo
        cargaPerro.setEdad(EdadP);
        cargaPerro.setRaza(razaP);
        cargaPerro.setTamanio(altura);
        Adoptables.add(cargaPerro);//Incorporo el nuevo depto a la lista
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }   
    
    public void imprimirPerros() {
        //for each simple
        for (Perro canino : Adoptables) {
            System.out.println(canino);
        }
        //foreach modificado
//        Adoptables.forEach((canino) -> {
//            System.out.println(canino);
//        });
        // con iterator
//         System.out.println("__________________con iterator ___________________________");
//         for (Iterator<Perro> it = Adoptables.iterator(); it.hasNext();) {
//            Perro canino = it.next();
//            System.out.println(canino);
//        }
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }

    public void PerroSinFamilia() {
        System.out.println("**************PERROS SIN FAMILIA*****************");
        for (Perro canino : Adoptables) {
            if (canino.isTienePropietario()==false) {
                System.out.println(canino);
            }
        }
   
    } 
    public void ordenarPerrosAaZ(){
          Collections.sort(Adoptables,
                (Perro objeto1, Perro objeto2) -> objeto1.getNombre().compareTo(objeto2.getNombre()));
          System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    
}
