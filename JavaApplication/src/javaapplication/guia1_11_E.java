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
public class guia1_11_E {
//ejercicio 11 extra:  Escribir un programa que lea un número entero y devuelva el número de dígitos
//que componen ese número. Por ejemplo, si introducimos el número 12345, el
//programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
//utilizando el operador de división. Nota: recordar que las variables de tipo entero
//truncan los números o resultados.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
         int numero, digitos, resto;
        digitos = 1;
        System.out.println("Ingrese el numero a calcular digitos");
        numero = leer.nextInt();
        resto = numero;
        while (resto / 10 >= 1) {  ///perimte calcular n cantidad de digitos
            resto /= 10;
            digitos += 1;
        }
        System.out.println("La cantidad de digitos del numero ingresado " + numero + " es de " + digitos);
        leer.close();
        
     }
    
}
//        2:solo digitos hasta 9, como el anterior
//
//        int numeros;                 //no me lee los numeros en el ultimo sout
//         int digitoss=0;              // cuenta hasta 9 digitos
//        
//         System.out.println("ingrese un numero");
//         numeros=leer.nextInt();
//         
//         while( numeros>0){
//          numeros=numeros/10;
//          digitoss++;
//          
//        }
//         System.out.println("su numero tiene :" +digitoss + "digitos");



 
