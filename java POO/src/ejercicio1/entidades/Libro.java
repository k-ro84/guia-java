/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numeroPagina) {
        
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPagina;
        mostrarLibro(); //solo si quiero mostrar el metodo previo
    }
    
    public void cargarLibro(){ //no poner static sino no toma el leer
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese el ISBN :");
         ISBN= leer.next();
        
        System.out.println("ingrese el titulo del libro :");
        titulo=leer.next();
        
        System.out.println("ingrese el nombre el autor : ");
        autor=leer.next();

        System.out.println("ingrese el numero de paginas del libro : "); 
        numeroPaginas=leer.nextInt();
        
    }
    public void mostrarLibro(){
        
        System.out.println("el ISBN buscado : "+ ISBN);
        System.out.println("el titulo del libro : " + titulo);
        System.out.println("autor registrado :" + autor); 
        System.out.println("numero de paginas totales : " + numeroPaginas);
        
    }
}
