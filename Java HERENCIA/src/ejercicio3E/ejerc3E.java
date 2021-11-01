/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3E;

import ejercicio3E.entidades.Alojamiento;
import ejercicio3E.entidades.Camping;
import ejercicio3E.entidades.Hotel4Estrellas;
import ejercicio3E.entidades.Hotel5Estrellas;
import ejercicio3E.entidades.Residencia;
import java.util.ArrayList;
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
        
        Alojamiento aloj= new Alojamiento();
        Hotel4Estrellas h1 = new Hotel4Estrellas();
        h1.Crear4estrellas();
        Hotel5Estrellas h2 = new Hotel5Estrellas();
        h2.Crear5estrellas();
        
         Camping h3 = new Camping();
         h3.CrearCamping();
         Residencia h4 = new Residencia();
         h4.CrearResidencia();
    
//  fijarse en el ejercico con enumeradores y usar la clase a y b de gimnasio asi,
//o adaptarlo a la otra forma asi se hace mas simple

        
         
    }
    
}
