/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejercprofes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("hola");
        
        
        String S1 = new String("la rama estaba quebrada");//si lo igreso aca debo pedirlo en todo lo dee abajo
        
        System.out.println("Original String is ': " + S1);
   
        System.out.println("palabra esta llena "+ S1.contains(S1));
        System.out.println("en  mayuscula "+   S1.toUpperCase());
        System.out.println("String after replacing 'rama' with 'tabla': " + S1.replace("rama", "tabla"));
      
        System.out.println("contiene "+ S1.length() + "letras");
        System.out.println("String after replacing all 'a' with 'e': " + S1.replace('a', 'e'));
        System.out.println("" + S1.replace(S1,S1.toUpperCase()));
   
        
        
        
//        String palabra=";"   ;

//              palabra.contains(palabra); 
//         
//          palabra.replace(0,5);
//         
//         palabra.toUpperCase();
//         
//         palabra.lenght(frase);
//         
//         }
      
    
    }
    
}
