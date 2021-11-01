/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.operacionesBasicas;
import java.util.Scanner;

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
        
        operacionesBasicas operaciones=new operacionesBasicas();
        
        operaciones.cargarNumeros();
        
        System.out.println("su primer numero es: " + operaciones.getnum1()); 
        System.out.println("su segundo numero es : "+ operaciones.getNum2());
        
        System.out.println("la suma es : " + operaciones.sumar());
        System.out.println("la resta es : " + operaciones.restar());
        System.out.println("la multiplicacion  es : "+ operaciones.multiplicar());
        System.out.println("la division es : " + operaciones.dividir());
        
        
    }
    
}
