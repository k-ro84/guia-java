/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3Extra;

import ejercicio3Extra.servicio.LibreriaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc3E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        LibreriaServicio lib =new  LibreriaServicio();

        
         int op;
       do {
           
                System.out.println("************** MENU **********************");
                System.out.println("**   biblioteca literaria extrema       **");
                System.out.println("** 1.-   Introducir un libro            **");
                System.out.println("** 2-    Mostrar todos los libros       **");
                System.out.println("** 3.-   mostrar tamaño de la planilla  **");
                System.out.println("** 4.-   Borrar un libro                **");
                System.out.println("** 5.-   devolver libro                 **");
                System.out.println("** 6.-   prestar libro                  **");
                System.out.println("** 7.-   Salir                          **");
                System.out.println("******************************************");
                op= leer.nextInt();

                switch (op) {
                    case 1:
                       lib.crearLibro();
                        break;
                    case 2:
                        lib.mostrarLibros();
                        lib.cantidadLibros();
                        break;
                    case 4:
                          lib.borrarLibro();
                        break;
                    case 5:
                        lib.metodoPrestamo();
                        break;
                    case 6:
                         lib.devuelve();
                         break;
                    case 7:
                        System.out.println("fin del llenado de la grilla"+
                        "\n"+" cierre de biblioteca");
                        break;
                }

            } while (op != 7);
 
        System.out.println("######################################################");
    }
  
    
}
