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
public class guia1_4_E {
//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner leer = new Scanner(System.in).useDelimiter("\n")) {
            System.out.println("   conversion a romanos   ");
            
            //probe de varias formas y el programa me recomendo switch por las opciones
            System.out.println("Se convertira un numero entre 1 y 10 a romano : ");
            int num=leer.nextInt();
            
            switch (num){ 
                
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
                default:
                    System.out.println("no corresponde a un numero del parametro");
                    break;
            }
        }
  
    }
    
}

/* corre hasta el 9 perfecto tengo que revisar como hacer correr el 10*/
//        int unidad;
//        int decena;
//                String rom1="";
//                string rom2;
//
//                if(num>0 && num<11){
//                    unidad=num%10;
//                    decena=num%100/10;
//                    switch (unidad) {
//                        case 0:
//                            rom1="";
//                            break;
//                        case 1:
//                            rom1= "I" ;
//                            break;
//                        case 2:
//                            rom1="II";
//                            break;
//                        case 3:
//                            rom1="III";
//                            break;
//                        case 4:
//                            rom1="IV";
//                            break;
//                        case 5:
//                            rom1="V";
//                            break;
//                        case 6:
//                            rom1="VI";
//                            break;
//                        case 7:
//                            rom1="VII";
//                            break;
//                        case 8:
//                            rom1="VIII";
//                            break;
//                        case 9:
//                            rom1="IX";
//                            break;
//                        default:
//                            break;
//                    }
//                        System.out.println(" el numero romano es"+rom1);
//
//
//
//                }
