/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import ejercicio2.servicio.ListadoServicio;
import ejercicio2.entidades.Listado;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
              ListadoServicio lista=new ListadoServicio();
              
              lista.crearPerro();
              lista.tamaño();
              lista.mover();
              lista.mostrar();
        
         
            
    }
}
