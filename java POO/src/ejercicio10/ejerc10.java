/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import ejercicio10.entidades.Arreglo;
import ejercicio10.servicio.arregloServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
//         Arreglo arreglo=new Arreglo();         llama desde la clase los mismos metodos
//         arreglo.crearArreglo();
//         arreglo.ordenarArreglo();
//         arreglo.crearVectorB();
//         arreglo.MostrarB
         
        arregloServicio vector=new arregloServicio();

        vector.crearArreglo();
        vector.ordenarArreglo();
      
        vector.crearVectorB();
        vector.MostrarB();
          
    }
}