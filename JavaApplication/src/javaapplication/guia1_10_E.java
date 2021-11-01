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
public class guia1_10_E {
//ejercicio 10 extra: Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe
//indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
//incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. Para
//realizar este ejercicio investigue como utilizar la función Math.random() de Java.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" multiplicacion aleatoria ");
    
         int result;
         int aleatorio1=(int) Math.floor(Math.random() *10+0);
         int aleatorio2=(int) Math.floor(Math.random() *10+0);
             System.out.println(aleatorio1*aleatorio2);
             
             
         System.out.println("se mutiplicaran dos numeros aleatorios, ingrese el resultado de dicha multiplicacion");
        result = (int) Math.floor(Math.random() * 10) * (int) Math.floor(Math.random() * 10);
         result=leer.nextInt();
         
         while(result!=(aleatorio1*aleatorio2)){
             if((aleatorio1*aleatorio2)<result){
                 System.out.println("el numero ingresado es mayor intente nuevamente");
             }else{
                 System.out.println("el numro ingresado es menor al resultado , siga intentando");
             }
             result=leer.nextInt();
                     
         }
          System.out.println(" correcto, adivino el resultado!!!!! ");   

    }
    
}

//
//       2:  funciona(do-while):

//        Scanner scan = new Scanner(System.in);
//        int numeroAleatorio, numeroAdivinado;
//        do {
//            numeroAleatorio = (int) Math.floor(Math.random() * 10) * (int) Math.floor(Math.random() * 10);
//            System.out.println(numeroAleatorio);
//            System.out.println("Ingrese el numero generado");
//            numeroAdivinado = scan.nextInt();
//            if (numeroAdivinado == numeroAleatorio) {
//                System.out.println("Adivino el numero!");
//                break;
//            } else {
//                System.out.println("No adivino el numero! Siga participando!");
//            }
//        } while (numeroAleatorio != numeroAdivinado);
//        scan.close();

//
//         3: funciona pero cuando se equivoca ingrsa un nuevo numero a adivinar
//
//// Scanner leer = new Scanner(System.in).useDelimiter("\n");
//        System.out.println(" multiplicacion aleatoria ");
//    
//         int aleatorios, ingresado;
//         
//         int resultado;
//         
//          do{
//            
//            System.out.println("se generaron dos numeros aleatorios, posterior ingrese el resultado que crea correcto");
//             aleatorios=(int) Math.floor(Math.random() *10+0) * (int) Math.floor(Math.random() * 10+0);
//              System.out.println(aleatorios);
//              System.out.println("Ingrese el resultado correcto");
//              ingresado = leer.nextInt();
//              
//               if(aleatorios<ingresado){
//                      System.out.println("valor incorrecto,su numero es muy grande,intente nuevamente");
//                   
//               }else{
//                   if(aleatorios>ingresado){
//                      System.out.println("su numero es muy pequeño intente con otro");
//                  
//               }else{
//                       if(aleatorios==ingresado){
//                  System.out.println( "   respuesta correcta  ");
//                    break;
//                         }
//                }
//               }
//            }while (aleatorios!=ingresado);
