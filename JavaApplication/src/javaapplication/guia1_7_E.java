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
public class guia1_7_E {
//ejercicio 7 eextra: Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y
//los números serán introducidos por el usuario. Realice dos versiones del programa,
//una usando el bucle “while” y otra con el bucle “do - while”.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("    max/min/prom     ");
        
        int n;
        int suma=0;
        int cont=0;
        int vMin=0,vMax=0;
       
        String respuesta;
        
        System.out.println("   ciclo usndo do while !!!!!!!!!!");
             
         do {
             
             System.out.println(" introduzca un numero a la  muestra(si desea dejar de ingresar solo teclee enter): ");
             respuesta = leer.nextLine();  
                if (!respuesta.equals("")){
                    int numeros=Integer.parseInt(respuesta);
                    suma+= numeros;
                    cont++;
             
                 if(cont==1){

                     vMax=numeros;
                     vMin=numeros;
                 }else{
                     if(numeros>vMax){
                         vMax=numeros;
                     }
                     if(numeros<vMin){
                         vMin=numeros;
                     }
                     
                 }    
             }
       
        } while(!respuesta.equals(""));
            System.out.println("el numero maximo es : " + vMax);
            System.out.println("el numero minimo es : " + vMin);
            System.out.println("el promedio de sus numeros es "+ (double)suma/cont);
            
//         System.out.println("  ciclo usando while!!!!! ");
//
//        System.out.println(" introduzca un numero a la  muestra(si desea dejar de ingresar solo teclee enter): ");
//           respuesta = leer.nextLine();             
//        int numeros=Integer.parseInt(respuesta); 
//         suma+=numeros;
//         int vMax=numeros;
//         int vMin=numeros;
//         cont++;
//        while(!respuesta.equals("")){
//             
//             System.out.println("ingrese nuevos valores valores de su muestra");
//             respuesta=leer.nextLine();
//             if (!respuesta.equals("")){
//                  numeros=Integer.parseInt(respuesta);
//                    suma+= numeros;
//                    cont++;
//               
//                     if(numeros>vMax){
//                         vMax=numeros;
//                     }
//                     if(numeros<vMin){
//                         vMin=numeros;
//                     }
//
//                 }    
//        }          
//          System.out.println("el numero maximo es : " + vMax);
//          System.out.println("el numero minimo es : " + vMin);
//          System.out.println("el promedio de sus numeros es "+ (double)suma/cont);
       
    }
    
    
}
