/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicio.PersonaServicio;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
            double mayores, menores, menosPeso, buenPeso, masPeso;
            mayores = 0;
            menores = 0;
            menosPeso = 0;
            buenPeso = 0;
            masPeso = 0;
            
            PersonaServicio persona1 = new PersonaServicio();
            persona1.crearPersona();
        if (persona1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona1.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona1.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona1.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona1.calcularIMC() == 2) {
            System.out.println("Error");
        }
        
            PersonaServicio persona2 = new PersonaServicio();
            persona2.crearPersona();
        if (persona2.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona2.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona2.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona2.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona2.calcularIMC() == 2) {
            System.out.println("Error");
        }  
        
        
           PersonaServicio persona3 = new PersonaServicio();
            persona3.crearPersona();
        if (persona3.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona3.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona3.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona3.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona3.calcularIMC() == 2) {
            System.out.println("Error");
        }
        
        
            PersonaServicio persona4 = new PersonaServicio();
            persona4.crearPersona();
        if (persona4.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
            mayores += 1;
        } else {
            System.out.println("No es mayor de edad");
            menores += 1;
        }
        if (persona4.calcularIMC() == 1) {
            System.out.println("Esta por encima del peso ideal");
            masPeso += 1;
        }
        if (persona4.calcularIMC() == 0) {
            System.out.println("Esta en su peso ideal");
            buenPeso += 1;
        }
        if (persona4.calcularIMC() == -1) {
            System.out.println("Esta por debajo de su peso ideal");
            menosPeso += 1;
        }
        if (persona4.calcularIMC() == 2) {
            System.out.println("Error");
        }
        
        
        System.out.println("Hay " + mayores + " mayores, es decir " + (mayores / 4 * 100) + " %");
        System.out.println("Hay " + menores + " menores, es decir " + (menores / 4 * 100) + " %");
        System.out.println("Hay " + menosPeso + " delgados, es decir " + (menosPeso / 4 * 100) + " %");
        System.out.println("Hay " + buenPeso + " de buen peso, es decir " + (buenPeso / 4 * 100) + " %");
        System.out.println("Hay " + masPeso + " de mas peso, es decir " + (masPeso / 4 * 100) + " %");
     
      
    }    
    
}        
