/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
//         int numero;
//        int falta, numeroInvertido, resto;
//       
//        System.out.println("ingrese largo del arreglo");
//        numero = leer.nextInt();
//        int[] a = new int[numero];
//        try{
//            for (int i = 0; i < numero; i++) {
//            System.out.println("ingrese numero para el arreglo " + i);
//            a[i] = leer.nextInt();
//            System.out.println("[ arreglo ]" + i + " = " + a[i]);
//            }
//                    for (int j = 0; j < numero; j++) {
//            
//                        if (a[j] >= 0) {
//            
//                            falta = a[j];
//                            numeroInvertido = 0;
//                            resto = 0;
//            
//            
//                            while (falta != 0) {
//                                resto = falta % 10;
//                                numeroInvertido = numeroInvertido * 10 + resto;
//                                falta = falta / 10;
//                            }
//            
//            
//                            if (numeroInvertido == a[j]) {
//                                System.out.println("El espacio "+j+" del arreglo es capicua");
//                            } else {
//                                System.out.println("El espacio "+j+" del arreglo no es capicua");
//                            }
//                        } else {
//                            System.out.println("el espacio "+j+" del arreglo es menor a 0");
//                        }
//                    }   
//        }catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Indice de arreglo fuera de rango");
//        }
//         
//        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        //Vamos a gestionar esta interrupción mediante un bloque try/catch, el fichero crear es Try2.java, con el siguiente código:
//         int [] array = new int[20];
//             try {
//                     array[-3] = 24;	
//             }
//             catch(ArrayIndexOutOfBoundsException excepcion){
//                 
//                     System.out.println(" Error de índice en un array");
//             }
//        //Esta excepción en particular se lanza cuando intentamos acceder a una posición de un array
//        //y no existe dicha posición.
//        
     System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        int [] array = {4,2,6};//0,1,2
         try{
             
             for (int i = 0; i <=3; i++) { // le psido ingrese ala posicion 3 para que detecte el error
                System.out.println ( "array [" + array [i]+ "]" );
             }
         } catch  (ArrayIndexOutOfBoundsException e){ // larga la exception cuando quiero ingresar al elemnto 3 del array
                                                // puede ser e o exception
             System.out.println("ha intentado acceder a una posicion fuera del array");
             System.out.println("aca larga donde esta el error :");
             throw e;
         }catch  (Exception e){ //resto de excepciones de tipo Exception y derivadas
                   System.out.println("Error inesperado " + e.getMessage());
        } 
         
    }
    
}
