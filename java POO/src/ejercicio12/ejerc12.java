/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

import ejercicio12.servicio.personaServicio;
import ejercicio12.entidades.Persona;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author K-RITO
 */
public class ejerc12 {

    /**   
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
        personaServicio personaS=new personaServicio();
       
        
         Persona persona= personaS.crearPersona();

         personaS.calcularEdad(persona); 
         
   
         System.out.println("Es menor de 21 años: "+personaS.menorQue(persona, 21));
     
         personaS.mostrarPersona(persona);
    }
}
