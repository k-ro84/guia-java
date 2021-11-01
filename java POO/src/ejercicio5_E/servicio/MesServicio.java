/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_E.servicio;

import ejercicio5_E.entidades.Mes;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class MesServicio {
    private Mes m;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
        public MesServicio(Mes m) {
        this.m = m;
       llenarMeses();
    }
        
      public void llenarMeses(){
         String [] meses={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre",
                "octubre", "noviembre", "diciembre" };
        m.setMeses(meses);
      }
 
      public void preguntarMes(){
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
          System.out.println(" juego listo :");
          System.out.println("ingrese el mes secreto(en minusculas): ");
          String mes=leer.next();
          while (repetirMes(mes)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes");
            mes = leer.next();
        }
        System.out.println("Ha acertado!");
      }
      
      public boolean repetirMes(String mes){
          
          String mesSecreto = m.getMeses()[5];
           if (mes.equals(mesSecreto)) {
            return false;
        }
           return true;
      }
}
