/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejProfe;




import ejProfe.servicio.DepartamentoServicio;
import ejProfe.servicio.PersonaTerratenienteServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class alquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         // Hago una instancia para acceder a los metodos.
         PersonaTerratenienteServicio nuevaEjecucion = new PersonaTerratenienteServicio();
         DepartamentoServicio nuevaEjecucion2 = new DepartamentoServicio();

            nuevaEjecucion.cargarPersonaTerrateniente(); // Llamo al metodo para cargar 1 PERSONA              
            // IMPRIMO LAS COLECCION DE PERSONAS
            nuevaEjecucion.imprimirPersonasTerratenientes(); // LA IMPRIMO SIN ORDENAR

            nuevaEjecucion2.cargarDepto();//Llamo al metodo para cargar 1 depto de forma manual        
            nuevaEjecucion2.imprimirDepartamentos();//Imprimo a todos los departamentos 
            //INVOCO AL METODO PARA CARGARLE VARIOS DEPTOS A LA MISMA PERSONA
            for (int i = 0; i < 2; i++) { // Asigno 2 departamentos A duenios... 
                nuevaEjecucion2.imprimirDepartamentosSinPropie();
                System.out.println("Elegi el DEPTO a comprar - DIRECCION");
                String varElegido = leer.next();
                nuevaEjecucion.asignarleDeptoaLista(nuevaEjecucion2, varElegido.toUpperCase());
            }
            nuevaEjecucion.ordenarDeAaZ();//ORDENO LA LISTA
            nuevaEjecucion.imprimirPersonasTerratenientes(); // LA IMPRIMO CON LOS CAMBIOS
            nuevaEjecucion.eliminarPersona();//LLAMO AL METODO PARA ELIMINAR
            nuevaEjecucion2.imprimirDepartamentos();//Imprimo a todos los departamentos para ver que aunque elimine la persona... no se muere DEPARTAMENTO

    }
    
}
