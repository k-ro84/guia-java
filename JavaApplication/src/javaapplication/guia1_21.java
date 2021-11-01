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
public class guia1_21 {
//ejercicio 21 : Crea una aplicación que a través de una función nos convierta una cantidad de
//euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
//libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
//converir que será una cadena, este no devolverá ningún valor y mostrará un
//mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" CAMBIO DE DIVISA ");
        int option;
        String moneda;
        double euros;
        double conversion;
        
        String salir;
   
        
        boolean cond;
        cond=true;
        
       do {
           System.out.println("ingrese la cantidad de euros a convertir");
           euros=leer.nextDouble();
           System.out.println(" $       CAJA DE CAMBIO:     $");
           System.out.println(" $   1 : Dolares             $");
           System.out.println(" $   2 : Yenes               $");
           System.out.println(" $   3 : Libras              $");
           System.out.println(" $   4 : Salir               $");
           option=leer.nextInt();
           
           switch(option){
                   case 1:
                  conversion=euros* 1.28611;
                       System.out.println("el monto a recibir es de : $"+conversion );
                       break;
                  
                   case 2 :
                  conversion=euros*129.852;
                   System.out.println( "el monto a recibir es de : $"+conversion );
                        break;
                  
                   case 3:
                  conversion=euros*0.86;
                   System.out.println(" el monto a recibir es de : $"+conversion );
                        break;
                   
                   case 4:
                  System.out.println("si desea salir del programa, introduzca S ");
                  salir=leer.next();
                  salir=salir.toUpperCase();
                  if(salir.equals("S"));
                       System.out.println("cierre de sistema");
            }   
        }while(option!=4);
            leer.close();
       
        // otra oopcion con if
//        double EurosAConvertir;
//        double convertido = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Ingrese la cantidad de euros a convertir");
//        EurosAConvertir = scan.nextDouble();
//        System.out.println("Ingrese la moneda a la cual desea convertir(yenes, libras, dolares)");
//        moneda = scan.next();
//        if(moneda.equals("yenes")) {
//            convertido = EurosAConvertir * 129.852;
//        }
//        if(moneda.equals("dolares")) {
//            convertido = EurosAConvertir * 1.28611;
//        }
//        if(moneda.equals("libras")) {
//            convertido = EurosAConvertir * 0.86;
//        }
//        if(!moneda.equals("yenes") && !moneda.equals("dolares") && !moneda.equals("libras")) {
//            System.out.println("Ingreso una moneda invalida");
//        } else {
//            System.out.println("La cantidad de euros " + EurosAConvertir + " en " + moneda + " son: " + convertido);
//        }    
  
    }
    
}
