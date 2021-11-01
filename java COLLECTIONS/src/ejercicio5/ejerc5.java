/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.servicio.PaisesServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
          PaisesServicio mundo= new PaisesServicio();
         
          ArrayList<String> paises = new ArrayList();
          
          
          mundo.CrearPaises();
          mundo.mostrarPaises();
          mundo.cantidadPaises();
          
          mundo.OrdenAlfabetico();
          mundo.OrdenAlfabeticoInverso();
   
          mundo.RetirarPais();
          
    }
    
}
