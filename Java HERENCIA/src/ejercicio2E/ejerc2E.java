/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E;






import ejercicio2E.entidades.Edificio;
import ejercicio2E.entidades.EdificioConOficinas;
import ejercicio2E.entidades.Polideportivo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Polideportivo polideportivo1 = new Polideportivo("Balboa",true,(double)23.50,(double)12.56, (double)67.45);
        Polideportivo polideportivo2 = new Polideportivo("Espinar",false,(double)14.50,(double)21.75,(double)87.50);

        EdificioConOficinas EdificioOficina1 = new EdificioConOficinas(5,7,14,(double)19.22, (double)14.70, (double)32.87);
        EdificioConOficinas EdificioOficina2 = new EdificioConOficinas(6,12,20,(double)21.50, (double)23.50,(double)41.90);
        
        ArrayList <Edificio> listaEdificio = new ArrayList <>();
        
        listaEdificio.add(polideportivo1); 
       
        listaEdificio.add(polideportivo2);
        
      
        listaEdificio.add(EdificioOficina1);
         
        listaEdificio.add(EdificioOficina2);
        
         //siempre tengo que inniciar contadores ya sea para sumar objetos u elemntos de los objetos
         int cuentaPoli=0;
         int cuentaOfi=0;
         
        for (Edificio aux : listaEdificio)
        {
            if (aux instanceof Polideportivo)
            {
                //esta pate uno la arma segun lo que quiere hacer
                System.out.println(aux);
         
                System.out.println("Superficie " + aux.calcularSuperficie()+" mts2");
                System.out.println("Volumen " + aux.calcularVolumen()+" mts3");
                cuentaPoli++;
            } else if (aux instanceof EdificioConOficinas)
            {
                 
                System.out.println(aux);
                System.out.println("Superficie " + aux.calcularSuperficie()+" mts2");
                System.out.println("Volumen " + aux.calcularVolumen()+" mts3");
                cuentaOfi++;
                ((EdificioConOficinas) aux).cantPersonas();
            }
        }
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªºªªº");
        System.out.println("Cantidad de Polideportivos "+cuentaPoli);
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        System.out.println("Cantidad de Edificios de Oficina "+cuentaOfi);

       
    }
    
}
