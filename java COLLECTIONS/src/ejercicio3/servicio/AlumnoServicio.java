/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicio;

import ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class AlumnoServicio {
     private Scanner leer;
     private ArrayList<Alumno>alumno;
    
    public AlumnoServicio() {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.alumno=new ArrayList();
        
    }
    
    public void crearAlumno() {
        String respuesta="";
        do{
            Alumno a1 = new Alumno();
            System.out.println("Ingrese el nombre del Alumno");
            String nombre = leer.next().toUpperCase();
            
            System.out.println("Ingrese las 3 notas del alumno");
        
            int nota1=leer.nextInt();
            int nota2=leer.nextInt();
            int nota3=leer.nextInt();
              
             a1.setNombre(nombre); // Seteamos el nombre
            
             a1.setNota1(nota1);
             a1.setNota2(nota2);
             a1.setNota3(nota3);
             
              alumno.add(a1); // Agregamos el objeto llenado a la lista
            
            System.out.println("Quiere ingresar otro alumno ?");
             respuesta = leer.next();
  
        } while (respuesta.equalsIgnoreCase("si"));

    }
    //muestra y dice de que tamaño es la lista- no lo pide en el ejercicio
    public void mostrarLista(){
        System.out.println("        _______________________________");
        System.out.println(            " PLANILLA DE ALUMNOS ");
        for (Alumno alumn :  alumno) { // Aca los mostramos en un for each

            System.out.println(" *  alumno y calficaciones :  "  + 
                    "\n"  +   alumno);
           
       }
          System.out.println("        _______________________________");
          System.out.println("        la lista actual de alumnos es : ");
          Iterator<Alumno> it = alumno.iterator();

        while (it.hasNext()) {
                System.out.println( it.next());  
       }
        
       System.out.println(" La lista es de tamaño: " + "["+ alumno.size()+ "]");
     }
     
  
    public void notaFinal(){

         System.out.println(" nombre del estudiante a calcular su nota final:  "); 
         String nombreAlumno = leer.next().toUpperCase();
         Iterator<Alumno> it = alumno.iterator();
         int cont=0;
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(nombreAlumno)) {
            System.out.println(" promedio final del alumno: "+aux.getNombre()+
             "\n"+(  aux.getNota1()+ aux.getNota2 () + aux.getNota3())/3);
            break;
            }
        }
        if (cont==0){
         System.out.println(" El alumno no esta en la lista");
        }
     }
//          double contNota=0;
//          while (it.hasNext()) {
//            Alumno aux = it.next();//Objeto auxiliar de la clase Alumno donde voy a ir asignando las iteraciones de it            
//            if (aux.getNombre().equals(nombreAlumno)) {//comparo si el nombre del objeto auxiliar es igual al nombre "buscado"
//                //cuando encuentra el nombre crea una coleccion HashSet auxiliar para asignar las
//                for (Alumno alumn: alumno) {
//                    System.out.println("La nota final promedio de: " + aux.getNombre() + " es " + (float) contNota / 3);//notas del alumno encontrado y asi poder recorrer y sumar las notas
//                }
//               
//            }
//        }
//        if (contNota == 0) {
//            System.out.println("No se encontro el Alumno");
//        }
//    }
        
 
}
// public void ordenar(){
//        alumno.sort(Alumno.compararNombresAlumnos); // Los ordenamos por el documento mediante un comparator
//
//        for (Alumno alumn : alumno) { // Aca los mostramos ordenados en un for each 
//            System.out.println(alumno);
//        }
//    }