/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3Extra.servicio;

import ejercicio3Extra.entidades.Libreria;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class LibreriaServicio {
     private Scanner leer;
     HashSet<Libreria> libro;

    public LibreriaServicio() {
        this.leer =new Scanner(System.in).useDelimiter("\n");
        this.libro = new HashSet<>();
        libro.add(new Libreria("Juego de Tronos (1996)","George R.R.Martin",12,6));
        libro.add(new Libreria("Choque de reyes (1998)","George R.R.Martin",14,7));
        libro.add(new Libreria("Tormenta de espadas (2000)","George R.R.Martin",11,4));
        libro.add(new Libreria("Festín de cuervos (2005)","George R.R.Martin",10,3));
        libro.add(new Libreria("Danza de dragones (2011)","George R.R.Martin",12,5));
        libro.add(new Libreria("Vientos de invierno", "George R.R.Martin",0,0));
        libro.add(new Libreria("el Hobbit", "J.R.R.Tolkien",10,7));
        libro.add(new Libreria("La comunidad del anillo","J.R.R.Tolkien",10,7));
        libro.add(new Libreria("Las dos torres","J.R.R.Tolkien",10,7));
        libro.add(new Libreria("El retorno del Rey","J.R.R.Tolkien",10,7));
        
    }
    
    /*
     crear nuevo libro
    */
    public void crearLibro(){
        System.out.println("        -------bibliotca fantastica--------");
        System.out.println("·························································");
        String opc;
        do {
            Libreria l1 = new Libreria();
            System.out.println("Ingrese el nombre del ibro");
            l1.setTitulo(leer.next().toUpperCase());
            
            System.out.println("Ingrese el nombre del autor");
            l1.setAutor(leer.next().toUpperCase());
           
            System.out.println("ingrese la cantidad de ejemplares en biblioteca");
            l1.setNumEjemplares(leer.nextInt());
            l1.setNumEjemplaresPrestados(0);
  
            System.out.println("Desea agregar otro producto? S/N");
            opc = leer.next().toUpperCase();

        } while (opc.equalsIgnoreCase("S"));
    }
    
    /*
    muestra libros en biblioteca
    */
     public void mostrarLibros(){
        System.out.println(" ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         for (Libreria  libros:  libro) { // Aca los mostramos en un for each

            System.out.println( "  Paises inscriptos  :  "  
                    + "\n"  +   libro);
            break;
         }
    }
    /*
     muestra la cantidad de libros
     */
    public void cantidadLibros(){
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªª");
        System.out.println(" La lista de Paises tiene un tamaño : " + "[" + libro.size()+ "]");
        
    }
   
    /*
    muestra libro a borrar
    */
    public void borrarLibro(){
       System.out.println( "ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          System.out.println("  libros disponibles actualmente : ");
          String buscado=leer.next().toUpperCase();
       if (libro.equals(buscado)) {
           libro.remove(buscado);
            System.out.println("   lista actualizada: " + libro.remove(buscado));
            System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
        } else {
            System.out.println("este cantante no es tan reconocido");
        }
    }
    /*
    muestra libros a prestar
    */
    public void metodoPrestamo(){
         System.out.println("Ingrese el libro a prestar");
        String buscado = leer.next().toUpperCase();
        Iterator<Libreria> it = libro.iterator();
       
        while (it.hasNext()) {
            Libreria aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
                  System.out.println("Se Presto el Libro " + buscado);
            } else {
                 System.out.println("No se Presto el Libro " + buscado);
            }
        }

    }
    
    public void devuelve() {
        System.out.println("Ingrese el libro a devolver");
        String buscado = leer.next().toUpperCase();

        Iterator<Libreria> it = libro.iterator();
        boolean bandera=true;
        
        while (it.hasNext()) {
            Libreria aux = it.next();
            if (aux.getTitulo().equalsIgnoreCase(buscado)) {
               
                libro.add(aux);
                System.out.println("Se Devolvio el Libro " + buscado);
                break;
            } else {
                 System.out.println("No se Devolvio el Libro " + buscado);
            }
        }
    }
}
