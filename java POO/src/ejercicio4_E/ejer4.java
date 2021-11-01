/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_E;

import ejercicio4_E.entidades.NIF;
import ejercicio4_E.servicio.nifServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        nifServicio nf=new nifServicio();
        NIF n1=nf.crearNIF();
        
        nf.mostrarNIF(n1);
    
    }
    
}
