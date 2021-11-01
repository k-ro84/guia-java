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
public class guia1_24 {
//ejercicio 24 : Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
//cuántos de 2 dígitos, etcétera (hasta 5 dígitos). 
    /**
     * @param args the command line arguments

     */
    public static void main(String[] args) {
        // TODO code application logic here}
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  vectores y matrices:recorrer . ");
        
        int num = 0;
        int cont;
        int uno = 0;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        System.out.println("Ingrese el tamaño de su vector a generar");
         int n = leer.nextInt();
         
         int vector[]= new int[n];
              
        for(int i=0;i<n;i++){
           vector[i]=(int)(Math.random()*100000);
           System.out.println("arreglo" +i+  "--->[" + vector[i]+"]"); 
        }
     
        System.out.println(" ");
        
        for (int i = 0; i < n ; i++) {
          
            cont = 1;
            do {

                if (vector[i] / 10 >= 1) {
                    cont += 1;
                    vector[i] = vector[i] / 10;
                }
            } while (vector[i] / 10 >= 1);
            switch (cont) {
                case 1:
                    uno += 1;
                    break;
                case 2:
                    dos += 1;
                    break;
                case 3:
                    tres += 1;
                    break;
                case 4:
                    cuatro += 1;
                    break;
                case 5:
                    cinco += 1;
                    break;

            }
        }
        if (uno >= 1) {
            System.out.println("Hay " + uno + " números de un dígito");
        }
        if (dos >= 1) {
            System.out.println("Hay " + dos + " números de dos dígitos");
        }
        if (tres >= 1) {
            System.out.println("Hay " + tres + " números de tres dígitos");
        }
        if (cuatro >= 1) {
            System.out.println("Hay " + cuatro + " números de cuatro dígitos");
        }
        if (cinco >= 1) {
            System.out.println("Hay " + cinco + " números de cinco dígitos");
        
        }
    }
       
    
}
//       1:           lleado manual de vector
//  for(int i=0;i<vector.length;i++){
//            System.out.println("ingrese un valor para "+i+"del arreglo");   
//            vector[i]=leer.nextInt();
//        }
//
//

/*      2:    me imprime arrays pares, respetando todo lo anterior*/
//          if(n<100){
 //              System.out.println(+i++);
//            }
//            -------------------------------------------------------------
//      3:    sirve para simple no para arrays
//             if(n<10){
//                System.out.println("el arreglo" +i+ "el numero tiene 1 digito");
//            }
//            else
//                if(n<100){
//                    System.out.println("2 digitos");
//                    
//                }
//            else
//                if(n<1000){
//                    System.out.println("3 digitos");
//                }
//            else
//                if(n<10000){
//                    System.out.println("4 digitos");
//                }
//            else
//                if(num<100000){
//                    System.out.println("5 digitos");
//                }
//