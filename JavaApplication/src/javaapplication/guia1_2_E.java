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
public class guia1_2_E {
//ejercicio 2 extra. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
//cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
//valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
//Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
//variable auxiliar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("         cambio de valor            ");
        
        int A= 18;
        int B= 16;
        int C= 12;
        int D= 9;
        int aux;
   
        System.out.println(A + "-" + B +  "-" + C + "-" + D);
         
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println(A + "-" + B + "-" + C + "-" + D);
        
        System.out.println("fin del proceso");

//        
//       2: pido que ingrese los valores el usuario:
//
//      
//        System.out.println("ingrese valor para A");
//        A=leer.nextInt();
//        System.out.println("ingrese valor para B");
//        B=leer.nextInt();
//        System.out.println("ingrese valor para C");
//        C=leer.nextInt();
//        System.out.println("ingrese valor para D");
//        D=leer.nextInt();
//        
//        aux=B;
//        B=C;
//        C=A;
//        A=D;
//        D=aux;
//        
//        System.out.println(A + "-" + B + "-" + C + "-" + D);
        
    }
    
}
