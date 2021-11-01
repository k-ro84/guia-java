/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.servicio;




import ejercicio1E.entidades.Perro;
import ejercicio1E.entidades.Persona;
import ejercicio2E.comparadores.Comparadores2E;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class PersonaServicio {
    private Scanner leer = new Scanner(System.in);
     private ArrayList < Persona > adoptantes = new ArrayList();

    public PersonaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
      
        Persona nuevaPersona1 = new Persona("ADRIANA", "BESTILLEIRO",32,3093883);
        Persona nuevaPersona2 = new Persona("PABLO", "ESCOBAR",22,37949847);
        Persona nuevaPersona3 = new Persona("TOTA", "SANTILLAN",50,25049847);
        adoptantes.add(nuevaPersona1);//LAS AGREGO A MI LISTA
        adoptantes.add(nuevaPersona2);
        adoptantes.add(nuevaPersona3);
    }

       
    public void CrearPersona(){
        Persona personas= new Persona();
        
        System.out.println("_____________________________________________________");
        System.out.println("carga de adoptantes");
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªº");
         System.out.println("Ingrese el nombre : ");
        String name = leer.next().toUpperCase();

        System.out.println("Ingrese el apellido : ");
        String apellidos = leer.next().toUpperCase();
        
        System.out.println("ingrese su edad : ");
        int edad=leer.nextInt();
        
        System.out.println("ingrese DNI");
        Long doc=leer.nextLong();
     
        //Hago uso del constructor que recibe parametros.        
        adoptantes.add(new Persona (name.toUpperCase(),apellidos.toUpperCase(),edad,doc));
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    //modelo profesora 1 parte
//     public Persona cargarPersonas() {
//        System.out.println("Ingrese su nombre");
//        String nombre = leer.next();
//        System.out.println("Ingrese su apellido");
//        String apellido = leer.next();
//        System.out.println("Ingrese su Edad");
//        Integer edad = leer.nextInt();
//        //Creo los objetos usando el contructor vacio y dps SET VALORES
//        Persona nuevaP = new Persona();
//        nuevaP.setName(nombre.toUpperCase());
//        nuevaP.setApellido(apellido.toUpperCase());
//        nuevaP.setAnios(edad);
//        return nuevaP;
//    }

    public void asignarlePerro (String nomb,AdopcionServicio busqueda,String varElegido ) {
 
        System.out.println("Ingrese el apellido de la persona que va a asignar un perro");
        String apellidos = leer.next().toUpperCase(); // Carga a quien quiere modificar
         
        //Recorro mi lista de personas para ver si existe
        for (Persona personas : adoptantes) {
            //Condicion para encontrar a la persona por Apellido
            if (personas.getApellido().equalsIgnoreCase(apellidos)) {
                //Si la encuentro..... recorro los deptos existentes 
                for (Perro can : busqueda.getAdoptables()) {
                  if (can.isTienePropietario()==false) { 
                    if (can.getNombre().equalsIgnoreCase(varElegido)) { // Esta condicion la hago para ver solo LOS DEPTOS SIN duenio
                        //Si el depto existe,  lo cargo en el atributo de la persona   
                        personas.setPerrito(can);
                        can.setTienePropietario(true); //set EL ATRIBUTO del dpto para que no este mas disponible
                    }
                }
            }
        }
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    }
    //modelo profesora 2parte
//      public void asignarPerrito(String nombreR, AdopcionServicio nuevaEjecucion2,String perroI){
//        for (Persona unitarioPersona : adoptantes) {
//            if (unitarioPersona.getName().equalsIgnoreCase(nombreR)) { // VERIFICO QUE EXISTA LA PERSONA
//                /// Ese get lita perrros - ME TRAE LA LISTA DE MI SERVICIOS PERRO
//                for (Perro unitarioPerro : nuevaEjecucion2.getAdoptables()) {
//                    if (unitarioPerro.isTienePropietario()==false) { // ME ASEGURO QUE EL PERRO ESTE SIN DUENIO
//                        if (unitarioPerro.getNombre().equalsIgnoreCase(perroI)) { // VALIDO EL APODO
//                            unitarioPersona.setPerrito(unitarioPerro);
//                            unitarioPerro.setTienePropietario(true);
//                        }
//                    }
//                }                
//            }
//        }
//    }
      
     //modelo profesor 3 parte
//     public void cargarArreglo(Persona x) {
//        listaPersonas.add(x); // Utilizo ADD para incorporar elementos
//    }

    public void imprimirPersonas() {
        System.out.println("--------------PERSONAS CARGADAS---------------------");
        for (Persona personaUnitario : adoptantes) {
            System.out.println(personaUnitario);
        }
        //segunda forma
        adoptantes.forEach((personaUnitario) -> {
            System.out.println(personaUnitario);
         });
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    //modelo profesora 4 parte ---corresponde a la lase collections creda en este ejercico, y solo funciona para este
//     public void imprimirlistaPersonas() {
//        ordenarAscendente(); // LLamo a la FUNCION que ORDENA, luego imprimo
//        for (Persona unitario : adoptantes) {
//            System.out.println(unitario); // Como deje previsto mi toString en clase entidad... imprime el objeto con todos sus atributos
//        }
//    }

    public void ordenarDeAaZ() {
        //Ordeno de A a Z - Teniendo en consideracion al APELLIDO
        Collections.sort(adoptantes,
                (Persona objeto1, Persona objeto2) -> objeto1.getApellido().compareTo(objeto2.getApellido()));
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    
    public void ordenarDeZaA() {
        //Ordeno de A a Z - Teniendo en consideracion al APELLIDO
        Collections.sort(adoptantes,
                (Persona objeto1, Persona objeto2) -> objeto2.getApellido().compareTo(objeto1.getApellido()));
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
    }
    
    //modelo profesora eliminar persona
//    public void eliminarElemento(String apellidoR) {
//        Iterator<Persona> it = adoptantes.iterator();
//        //OJO CUANDO ELIMINAN... SI ELIMAN ADRI SE ROMPE EL PROGRAMA
//        while (it.hasNext()) {
//            Persona next = it.next();
//            if (next.getApellido().equalsIgnoreCase(apellidoR)) {               
//                it.remove();
//            }
//        }
//    }
//    
//     public void ordenarAscendente() {
//        Collections.sort(adoptantes,Comparadores2E.ordenarporApellidoAsc);
//    }
}
