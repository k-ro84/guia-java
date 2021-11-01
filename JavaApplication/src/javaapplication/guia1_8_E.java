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
public class guia1_8_E {
//ejercicio 8 extra :Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
//debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
//números pares y la cantidad de números impares. Al igual que en el ejercicio
//anterior los números negativos no deben sumarse. Nota: recordar el uso de la
//sentencia break.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("    multiplos de 5 :par/ impar  ");
     
        int suma=0;
        int num=0;
         int par=0;
         int impar=0;
         int cont=0;

            do{
                 System.out.println("ingrese sus numeros");
                  num=leer.nextInt();
                  
                if(num%5==0){
                        break;
                }if(num>0){
                    cont+=1;
                    if( num%2 ==0){
                         par+=1;
                    }else{

                        impar+=1;  
                     }
            }
            } while (num > 0 && num % 5 != 0);
               System.out.println("cantidad de numeros pares"+par);
               System.out.println("cantidad de numeros impares"+impar);  
               System.out.println("cantidad de nuermos ingresados"+cont);
               
               leer.close();
    }
    
}
