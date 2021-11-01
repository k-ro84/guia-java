/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicio.CuentaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int operacion;
        
        CuentaServicio cuenta= new CuentaServicio();
        
        cuenta.crearCuenta();
        System.out.println( " saldo actual:");  
        cuenta.consultarSaldo();
        System.out.println(" datos del usuario : ");
        cuenta.consultarDatos();
        System.out.println(" _________________");
        
        cuenta.menu();
        cuenta.ingresar(0);
        cuenta.consultarSaldo();
        cuenta.retirar(0);
        cuenta.consultarSaldo();
        cuenta.extraccionRapida();
        cuenta.consultarSaldo();
        
//         do{
//                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
//                    System.out.println("             MENU               ");
//                    System.out.println("  1: INGRESAR/DEPOSITAR         ");
//                    System.out.println("  2: RERIRAR DINERO             ");
//                    System.out.println("  3: EXTRACCION RAPIDA          ");
//                    System.out.println("  4: CONSULTA DE SALDO          ");
//                    System.out.println("  5: SALIR                      ");
//                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
//                    operacion=leer.nextInt();
//
//                switch(operacion){
//            case 1:
//                System.out.println(cuenta.ingresar);
//                cuenta.consultarSaldo();
//                break;
//                
//            case 2:
//                 if(operacion==2){
//                     System.out.println(cuenta.retirar);
//                 cuenta.consultarSaldo();
//                 break;
//            }
//            case 3:
//                if(operacion==3){
//                    System.out.println(cuenta.extraccionRapida);
//                  cuenta.consultarSaldo(); 
//                 break;
//                }
//            case 4:
//                   System.out.println("datos de la cuenta :");
//                   cuenta.consultarDatos();
//                   System.out.println(" _________________");
//            case 5:
//                   System.out.println("desea seguir operacion");   
//                   String resp=leer.next();
//                 if (resp.equals("s") || resp.equals("S")){
//                      do{
//                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
//                    System.out.println("             MENU               ");
//                    System.out.println("  1: INGRESAR/DEPOSITAR         ");
//                    System.out.println("  2: RERIRAR DINERO             ");
//                    System.out.println("  3: EXTRACCION RAPIDA          ");
//                    System.out.println("  4: SALIR                      ");
//                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
//                    operacion=leer.nextInt();
//                     }while ( operacion!=5); 
//                }else{
//                      System.out.println(" fin de la operacion, retire su tarjeta");
//                     } 
//        }
//      
//                    
//         }while ( operacion!=5); 
//     
        
     }
        
}
             