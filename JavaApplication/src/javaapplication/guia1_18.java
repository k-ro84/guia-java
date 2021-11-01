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
public class guia1_18 {
//ejercicio 18 : Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
//del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
//por una E. Ejemplo:
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" cambio de simbolo");
        int i=0;     //cambiando algunas cosas puede hacer el cambio para distintos digitos y otros caracteres
        int j=0;
        int k=0;
        int n;
        String u;
        String d;
        String c;
        String cadena;
        boolean seguir = true;//indica que mientras tenga tres digitos funcione
        while (seguir) {
            if (i == 3) {       // primer parte ubica el 3 en cada posicion 
                u = "E";
            } else {
                u = String.valueOf(i);//le digo que si el primero tie u vaor de 3 se lea como 3
            }
            if (j == 3) {
                d = "E";
            } else {
                d = String.valueOf(j);
            }
            if (k == 3) {
                c = "E";
            } else {
                c = String.valueOf(k);
            }
            cadena = c + " - " + d + " - " + u;//lo traduce a la pantalla
            i += 1;
            if (i == 10) {
                i = 0;
                j += 1;
            }
            if (j == 10) {
                j = 0;
                k += 1;
            }
            if (k == 9 && j == 9 && i == 9) {  //hasta aca abarca la busqueda 9-9-9
                seguir = false; // si ess mas de 999 falso no corre
            }
            System.out.println(cadena);
        }
        
    }
     
}
/*                       para seber si tiene tres digitos                   */
//System.out.println("ingrese un numero");
//        n=leer.nextInt();
//            if (n<999 && n>100){
//                    System.out.println("su numero tiene 3 digitos");  
//                    
//            }   
//            else
//                  if(n !=999 || n !=100){ 
//                    System.out.println("cantidad de digitos incorrectos");
//            }          