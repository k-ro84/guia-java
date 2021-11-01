/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12.servicio;


import ejercicio12.entidades.Persona;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author K-RITO
 */
public class personaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
//       Persona persona=new Persona();
       
    
       public Persona crearPersona(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         System.out.println(" ingrese el nombre de la persona");
            String nombre=leer.next();
         System.out.println(" ingrese dia de su nacimiento");
            int dia=leer.nextInt();
         System.out.println(" ingrese mes de nacimiento");
            int mes=leer.nextInt();
         System.out.println(" ingrese año de su nacimiento");
            int anio=leer.nextInt();
          
            Date fechaNacimiento= new Date(anio-1900,mes-1,dia);
            return new Persona(nombre, fechaNacimiento);
       }
      
       public void calcularEdad(Persona persona){

           Date fechaActual= new Date();
           
           int year = fechaActual.getYear() - persona.getFechaNacimiento().getYear();
           System.out.println("su edad es : " + year);
           
       }
       
       public boolean menorQue(Persona persona,int edad){

          Date ahora = new Date();
        int year = ahora.getYear() - persona.getFechaNacimiento().getYear();
        return edad > year;
		
       }
       
      public void mostrarPersona(Persona persona) {
        System.out.println("NOMBRE             : " + persona.getNombre());
        System.out.println("FECHA DE NACIMIENTO: " + persona.getFechaNacimiento());
       }
       
}
