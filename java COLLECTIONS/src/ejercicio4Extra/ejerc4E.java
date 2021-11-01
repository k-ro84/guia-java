/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4Extra;

import ejercicio4Extra.entidades.CodigoPostal;
import ejercicio4Extra.servicio.CodigoPostalServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc4E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         CodigoPostalServicio codP =new CodigoPostalServicio();
         //faat coregir poner en mauscula las ciudades y coregir el recorre y orden
         
         codP.mostrarCodigo();
         codP.crearCodigo();
         codP.mostrarCodigo();
         codP.cantidadCodigos();
         codP.RetirarCiudad();
         codP.mostrarCodigo();
         codP.OrdenAlfabetico();
    }
    
}
