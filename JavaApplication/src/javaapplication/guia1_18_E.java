/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author K-RITO
 */
public class guia1_18_E {
//ejercicio 18 extra :Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("  vectores iguales ");
  
        int[] vector1 = { 1, 2, 3, 5, 6,7,8 };//compara posiciones no valores dentro del vector
        int[] vector2 = { 1, 2, 3, 5, 8,7,6 };
        int cont = 0;
        for (int i = 0; i < 7; i++) { 
            if (vector1[i] != vector2[i]) {
                System.out.println(vector1[i] + " != " + vector2[i]);
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                System.out.println(vector1[i] + " = " + vector2[i]);
                cont += 1;//asi avanza una posicion para comparar
            }
        }
        if (cont == 5) {
            System.out.println("Los vectores son iguales");
        }
    }
        
}

//
//      2: intento fallido llenando arrays
//
//        int cont=0;
//        int primer=0;
//        int segundo=0;
//        
//        System.out.println("ingrese el tamaño de su vector"); 
//        int n=leer.nextInt();
//        
//        int[] vector1=new int[n];
//        int[] vector2=new int[n];
//       
//        for(int i=0;i<n;i++){
//             System.out.println("ingrese los valores para su primer vector"); 
//             primer = leer.nextInt();
//        }
//        for(int i=0;i<n;i++){
//             System.out.println("ingrese los valores para su segundo vector");
//             segundo =leer.nextInt();
//
//

//
//  3: forma simple sin iteraciones(con sort que permite comparar de atrasa adelante
//
//        int[] numeros1 = {1, 2, 3};
//        int[] numeros2 = {3, 2, 1};
//
//        System.out.println(Arrays.equals(numeros1, numeros2));  // false
//
//        System.out.println();
//
//        Arrays.sort(numeros2);
//
//        System.out.println(Arrays.equals(numeros1, numeros2));