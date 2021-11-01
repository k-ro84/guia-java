/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.servicio.AlumnoServicio;
import ejercicio3.entidades.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
          
          Alumno alumnos=new Alumno();
          AlumnoServicio clase=new AlumnoServicio();
          
         clase.crearAlumno();
      
         clase.mostrarLista();
        
          clase.notaFinal();
         
       
    }
    
}
