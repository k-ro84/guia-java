/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_E;

import ejercicio5_E.entidades.Mes;
import ejercicio5_E.servicio.MesServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         Mes m = new Mes();
        MesServicio s = new MesServicio(m);
        s.preguntarMes();
        System.out.println(m);
    }
    
}
