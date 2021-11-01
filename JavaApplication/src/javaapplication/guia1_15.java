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
public class guia1_15 {
//ejercicio 15 : Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println(" bucles y salidas!!! :  ");
        
        System.out.println("bienvenido a la construccion de un menu de operaciones");
        System.out.println("en este caso realizaremos las operaciones solo con dos valores");
       int opcion;
        String salir;
        System.out.println( " Ingrese su primer numero: ");
          double num=leer.nextDouble();
          System.out.println(" Ingrese su segundo numero: ");
          double num2=leer.nextDouble();  
          opcion=0;
          do {
          
              System.out.println("   -----------------------------  ");
              System.out.println("  |°            menu           °| ");
              System.out.println("  | 1:  sumar                   | ");
              System.out.println("  | 2:  restar                  | ");
              System.out.println("  | 3:  mutiplicar              | ");
              System.out.println("  | 4:  dividir                 | ");
              System.out.println("  | 5:  salir                   | ");
              System.out.println("  |        elija opcion !!!     | ");
              System.out.println("   ------------------------------ ");
              opcion=leer.nextInt();
              
              
              
              switch(opcion){
                  case 1: 
                  System.out.println("la suma de : " +num+ "+" +num2+ "="+(num+num2));
                  break;
                  case 2:
                  System.out.println("la resta de : " +num+ "-" +num2+ "="+(num-num2));
                  break;
                  case 3:
                  System.out.println("la resta de : " +num+ "*" +num2+"="+(num*num2));
                  break;
                  case 4:
                  System.out.println("la division de : " +num+ "/" +num2+ "="+(num/num2));
                  break;
                  case 5:
                  System.out.println("desea salir del program(s/n)");
                  salir=leer.next();
                  salir=salir.toUpperCase();
                  
                  if(salir.equals("S")) {
                    System.out.println("Finalizado");
                    
                }else{
                  opcion=0;
                  }
                  break;
                  
                  default:
                      System.out.println("opcion no valida");
                }
                
            }while(opcion!= 5);
                  leer.close();
                
          System.out.println("        ||||||||||||||||||||    ");   

    }
}

 //                    2: sirve: pero despues de cada op se cierra solo
//
 // Scanner leer = new Scanner(System.in);
//        System.out.println(" bucles y salidas!!! :  ");
//        
//        System.out.println("bienvenido a la construccion de un menu de operaciones");
//        System.out.println("en este caso realizaremos las operaciones solo con dos valores");
//        double suma;
//        double resta;
//        double multiplicacion;
//        double division;
//        String salir;
//        System.out.println( " Ingrese su primer numero: ");
//          double num=leer.nextDouble();
//          System.out.println(" Ingrese su sgundo numero: ");
//          double num2=leer.nextDouble();
//      
//        System.out.println("  |°            menu           °| ");
//        System.out.println("  | 1:  sumar                   | ");
//        System.out.println("  | 2:  restar                  | ");
//        System.out.println("  | 3:  mutiplicar              | ");
//        System.out.println("  | 4:  dividir                 | ");
//        System.out.println("  | 5:  salir                   | ");
//        System.out.println("  |ingrese la opcion deseada !!!| ");
//        int opcion=leer.nextInt();
//        
//        switch(opcion){
//            case 1 :
//                suma = num+num2;
//                System.out.println("la suma de sus numeros es : " + suma);
//                break;
//            case 2:
//                resta = num-num2;
//                System.out.println(" la resta de sus numeros es : " + resta);
//                break;
//            case 3:
//                multiplicacion = num*num2;
//                System.out.println(" la multiplicacion de sus numeros es : " + multiplicacion);
//                break;
//            case 4:
//                
//                    division =num/num2;
//                System.out.println(" la division da por resultado: " + division);
//                break;
//            case 5:
//                
//                if (opcion==5);
//                System.out.println(" desea salir del programa(S/N))??");
//                salir=leer.next();
//                
//                  if(salir.equals("S")){
//                   System.out.println("         fin del programa         ");
//                   break;
//                  }
//                  if(salir.equals("N")){
//                    System.out.println("  |°           menu            °| ");
//                    System.out.println("  | 1:  sumar                   | ");
//                    System.out.println("  | 2:  restar                  | ");
//                    System.out.println("  | 3:  mutiplicar              | ");
//                    System.out.println("  | 4:  dividir                 | ");
//                    System.out.println("  | 5:  salir                   | ");
//                    System.out.println("  |ingrese la opcion deseada !!!| ");
//                    opcion =leer.nextInt();
//                    
//            }   }
 
 //
 //                     3: otra forma mas larga
 
//           int seleccion, num, num2, suma, resta, multi, divicion;
//        char letra;
//
//        Scanner leer = new Scanner(System.in);
//
//
//        System.out.println("Ingrese dos numeros😊;
//        num = leer.nextInt();
//        num2 = leer.nextInt();
//
//        do {
//            Menu();
//            seleccion = leer.nextInt();
//            switch (seleccion) {
//                case 1:
//                    int opcion;
//                    System.out.println("\n");
//
//                    System.out.println("La suma de los numeros: " + num + " + " + num2);
//                    suma = num + num2;
//                    System.out.println("Total: " + suma);
//                    System.out.println("\n");
//                    System.out.println("Para volver al menu principal Presione: 0");
//                    opcion = leer.nextInt();
//
//                    break;
//                case 2:
//                    System.out.println("\n");
//                    System.out.println("La resta de los numeros:" + num + " - " + num2);
//                    resta = num - num2;
//                    System.out.println("Total: " + resta);
//                    System.out.println("Para volver al menu principal Presione: 0");
//                    opcion = leer.nextInt();
//                    break;
//                case 3:
//                    System.out.println("\n");
//                    System.out.println("La Multiplicacion de los numeros:" + num + " x " + num2);
//                    multi = num * num2;
//                    System.out.println("Total: " + multi);
//                    System.out.println("Para volver al menu principal Presione: 0");
//                    opcion = leer.nextInt();
//                    break;
//                case 4:
//                    System.out.println("\n");
//                    System.out.println("La dividicion de los numeros:" + num + " % " + num2);
//                    divicion = num / num2;
//                    System.out.println("Total: " + divicion);
//                    System.out.println("Para volver al menu principal Presione: 0");
//                    opcion = leer.nextInt();
//
//                case 5:
//                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
//                    letra = leer.next().charAt(0);
//                   
//                    if (letra == 's') {
//                        break;
//
//                    } else {
//                        seleccion = 0;
//                    }
//
//            }
//
//        } while (seleccion != 5);
//
//    }
//
//         public static void Menu() {
//        System.out.println("---Accion a realizar---");
//        System.out.println("      1- Suma       ");
//        System.out.println("      2- Resta      ");
//        System.out.println("      3- Multiplicar");
//        System.out.println("      4- dividir    ");
//        System.out.println("      5- Salir      ");
//        System.out.println("--------------------");
//    }