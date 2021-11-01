/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.servicio;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CuentaServicio {
    
        private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
      Cuenta cuenta=new Cuenta();
       
       public int ingresar;
       public int retirar;
       public int extraccionRapida;
       
       
        
        public void crearCuenta() {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println(" INGRESE DNI(SIN PUNTOS)");
            cuenta.setDNI(leer.nextInt());
            System.out.println("INGRESE EL NUMERO DE CUENTA");
            cuenta.setNumeroCuenta(leer.nextInt());
//            System.out.println("INGRESE SALDO");    //establezco el saldo original desd alante 
//            cuenta.setSaldo(leer.nextDouble());
//            System.out.println("INGRESE EL INTERES");//nose pide al usuario
//            cuenta.setInteres(leer.nextDouble());
//          
        }
          
        public void menu(){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
          int operacion;
            do{  
             
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("             MENU               ");
                    System.out.println("  1: INGRESAR/DEPOSITAR         ");
                    System.out.println("  2: RETIRAR DINERO             ");
                    System.out.println("  3: EXTRACCION RAPIDA          ");
                    System.out.println("  4: CONSULTA DE DATOS          ");
                    System.out.println("  5: CONSULTA DE SALDO          ");
                    System.out.println("  6: SALIR                      ");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    operacion=leer.nextInt();

                switch(operacion){
                case 1:
                      System.out.println("Ingrese la cantidad a depositar");
                      double ingreso=leer.nextDouble();
                      ingresar( ingreso);
                       consultarSaldo();
                      break;
                case 2:
                     if(operacion==2){
                       System.out.println("Ingrese la cantidad a retirar");
                       double retiro=leer.nextDouble(); 
                       retirar(retiro);
                       consultarSaldo();
                          break;
                     }
                   
                case 3:
                    if(operacion==3){
                         System.out.println("Monto para su extraccion rapida");
                            double ext=leer.nextDouble(); 
                       extraccionRapida();
                       consultarSaldo();
                       break;
                    }
                   
                case 4:
                       System.out.println("Datos de la cuenta :");
                          consultarDatos();
                      break;
                case 5:
                       System.out.println("Saldo actual");
                          consultarSaldo();
                       break;
                case 6:
                       System.out.println("Desea seguir operando(S/N)");   
                          String resp=leer.next();
                 if (resp.equals("s") || resp.equals("S")){
                 
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    System.out.println("             MENU               ");
                    System.out.println("  1: INGRESAR/DEPOSITAR         ");
                    System.out.println("  2: RERIRAR DINERO             ");
                    System.out.println("  3: EXTRACCION RAPIDA          ");
                    System.out.println("  4: CONSULTA DE DATOS          ");
                    System.out.println("  5: CONSULTA DE SALDO          ");
                    System.out.println("  6: SALIR                      ");
                    System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                    operacion=leer.nextInt();
                 
                }else{
                      System.out.println(" Fin de la operacion, retire su tarjeta");
                   break;
                 }
                }
             }while( operacion!=6); 
            
            }
        public void ingresar(double ingreso) {
            double saldo;

             saldo = cuenta.getSaldo();
            cuenta.setSaldo(saldo + ingreso);
        }

        public void retirar(double retiro) {
            double saldo;
           
            saldo = cuenta.getSaldo();
            if (saldo < retiro) {
                cuenta.setSaldo(0);
            } else {
               
                cuenta.setSaldo(saldo - retiro);
            }
        }

        public void extraccionRapida() {
            double saldo,ext=0;
           
            saldo = cuenta.getSaldo();
            if(saldo>saldo*.8){
                 System.out.println("imposible procesar ");
 
            }else{
                cuenta.setSaldo(saldo - ext);
            }
            
        }

        public void consultarSaldo() {
            System.out.println(cuenta.getSaldo());
        }

        public void consultarDatos() {
            System.out.println("DNI del usuario : " +cuenta.getDNI());
            System.out.println("Saldo actual en cuenta : " +cuenta.getSaldo());
            System.out.println("Su interes mensual : " +cuenta.getInteres());
            System.out.println("Numero de cuenta : " + cuenta.getNumeroCuenta());
            System.out.println("no comparta su clave personal con ningun desconocido");
        }
        
        

}
  
