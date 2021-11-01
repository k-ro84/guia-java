/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;
/**
 *
 * @author K-RITO
 */
public class guia1_5_E {
//ejercicio 5 extra :Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
//descuento en todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
//descuento para los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
//dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
//que represente el costo del tratamiento (previo al descuento) y determine el importe
//en efectivo a pagar por dicho socio.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("                  BIENVENIDO           ");
        System.out.println("               OBRA SOCIAL EGG           ");
        
        String A;
        String B;
        String C;
        String socio;
        double costoTratamiento=0;// double ya que hay que considerar todo tipo de costos
        double costoFinal=0;       
        
        System.out.println("ingrese el tipo de socio ");
        socio=leer.next().toUpperCase();
        
        
        
        if (socio.equals("A")){
            System.out.println(" tipo de socio corresponde a la clase A" );
            System.out.println("Ingrese el precio del tratamiento");
            costoTratamiento = leer.nextDouble();
           //costoFinal = (costoFinal+100)/costoTratamiento;asi me da que le tengo que descontar la mitad=0.5
              costoFinal = costoTratamiento * .5;
                System.out.println("El precio final del tratamiento sera: " + costoFinal);
                
        }else if(socio.equals("B")){
                    System.out.println("tipo de socio corresponde a la clase C");
                System.out.println("Ingrese el precio del tratamiento");
                costoTratamiento = leer.nextDouble(); 
                
                 costoFinal = costoTratamiento * .65;
                 
                System.out.println("El precio final del tratamiento sera: " + costoFinal);
                
        }else if(socio.equals("C")){
                     System.out.println("tipo de socio corresponde a la clase C");
                   System.out.println("Ingrese el precio del tratamiento");
                    costoTratamiento = leer.nextDouble();
                    
                     costoFinal = costoTratamiento ;
                     
                    System.out.println("El precio final del tratamiento sera: " + costoFinal);
        }else{
                   System.out.println("codigo incorrecto");
        }
        
        
        
    }
    
}
//      2:TAMBIEN FUNCIONA(OPCION DE JAVA)
//
//
//    switch (socio) {
//            case "A":
//                System.out.println(" tipo de socio corresponde a la clase A" );
//                System.out.println("Ingrese el precio del tratamiento");
//                costoTratamiento = leer.nextDouble();
//                //costoFinal = (costoFinal+100)/costoTratamiento;asi me da que le tengo que descontar la mitad=0.5
//                costoFinal = costoTratamiento * .5;
//                System.out.println("El precio final del tratamiento sera: " + costoFinal);
//                break;
//            case "B":
//                System.out.println("tipo de socio corresponde a la clase C");
//                System.out.println("Ingrese el precio del tratamiento");
//                costoTratamiento = leer.nextDouble();
//                costoFinal = costoTratamiento * .65;
//                System.out.println("El precio final del tratamiento sera: " + costoFinal);
//                break;
//            case "C":
//                System.out.println("tipo de socio corresponde a la clase C");
//                System.out.println("Ingrese el precio del tratamiento");
//                costoTratamiento = leer.nextDouble();
//                costoFinal = costoTratamiento ;
//                System.out.println("El precio final del tratamiento sera: " + costoFinal);
//                break;
//            default:
//                System.out.println("codigo incorrecto");
//                break;
//        }