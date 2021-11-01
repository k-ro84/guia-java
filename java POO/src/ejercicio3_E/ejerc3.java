/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3_E;

import ejercicio3_E.entidades.Raices;
import ejercicio3_E.servicio.raicesServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
 
        Raices r=new Raices();
        
         raicesServicio s = new raicesServicio(r);
        s.crearCoeficientes();
        s.calcular();
        System.out.println(r);
        
//        raicesServicio r = new raicesServicio();
//        Raices r1 = r.crearRaiz();
//        r.calcular(r1);

    }
}
