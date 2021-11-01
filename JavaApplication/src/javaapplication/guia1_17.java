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
public class guia1_17 {
//ejercicio 17 : Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
//tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
//con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
//carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la
//secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
//secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
//correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
//se utilizan las siguientes funciones de Java Substring(), Length(), equals().
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
        System.out.println(" Bienvenido a su dispositivo RS232 ");
        
        String letra;
        int incorrecto=0;  /*los defino como contador ya que se me pide contar palbras correctas e incorrectas*/
        int correcto=0;/*iniciado en cero ya que empieza sin contar las palabras*/
        
        System.out.println("ingrese su cadena");
        String cadena=leer.next();
         
        while(!cadena.equals("&&&&&")){
               if(cadena.length()!=5) {
                   incorrecto+=1;
                                          /*puede hacerse sin touppercase, pero solo toma las letras en mayuscula que se ingresan*/
               }else{                     /*mayuscula antes de igualar la palabra pero despues de tomarla*/
                   if (cadena.substring(0,1).toUpperCase().equals("X")   &&   cadena.substring(cadena.length()-1, cadena.length()).toUpperCase().equals("O") ) {
                     ///si la palabra, en su posic 1 es =a x -y- la palabra en la palbra de atras hacia adelante o sea -1
                                                                                                  //    en toda su cadena = a o
                     correcto+=1;                                                                       
                  } else{
                    incorrecto+=1;
                   }
               }   
                   
                   System.out.println("desea ingresar ora cadena, sino es asi ingrese: &&&&&");
                   cadena=leer.next();//si string ya que ya fue definida e inicializada
                   System.out.println(cadena);//aqui dentro por que hasta que no ponga la opcion de salir se seguira ejecutando
         }
          if(cadena.equals("&&&&&")) {
              System.out.println("usted ingreso cadenas validas : " + correcto+ " de veces ");
              System.out.println("usted ingreso cadenas no validas : " + incorrecto+ " de veces "+ incorrecto);
          /* siempre fuera del bucle cuando ya finalizo todo el programa*/
        }

        
    }
    
}
