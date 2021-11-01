/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("Ingrese el Dia (dd)");
        int dia = leer.nextInt();
        
         System.out.println("Ingrese el Mes(mm)");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el Año (aaaa)");
        int anio = leer.nextInt();

         Date fecha = new Date();
         fecha.setDate(dia);
         fecha.setMonth(mes-1);//esta predefinido asi por date
         fecha.setYear(anio-1900);//es por sistema
         System.out.println(fecha.toString());
        
      
         Date fechaActual = new Date();
         
         System.out.println(fechaActual.toString());
         
         int year = fechaActual.getYear() - fecha.getYear();
           System.out.println("su edad es : " + year);
  
          
          //no lo pide
          if(year>18){
              System.out.println(" persona mayor de edad");
          }else{
              System.out.println(" persona menor de edad");
          }
          
//        reloj actual:
//         
//           Date fecha = new Date();
//              int anio= fecha.getYear();
//              System.out.print(anio+1900+"/");
//              int mes=fecha.getMonth();
//              System.out.print(mes+1+"/");
//              int dia=fecha.getDate();
//              System.out.println(dia);
//              int hora=fecha.getHours();
//              System.out.println("hora " + hora);
//              int minutos=fecha.getMinutes();
//              System.out.println("minutos " + minutos);
//              int segundos=fecha.getSeconds();
//              System.out.println("segundos " + segundos);
    }
    
}
//import java.time.LocalDate;
//Federico Lucca says:// Para cargar fecha
//        LocalDate fechaI= LocalDate.of(anioI, mesI, diaI);        
//        System.out.println("Su fecha ingresada: " + fechaI);
//Federico Lucca says://Para conocer cuanto tiempo paso 
//        LocalDate fechaHoy = 
//LocalDate.now
//();
//        Period periodoT = Period.between(fechaI, fechaHoy);
//        System.out.println("\n Tiempo trasncurrido desde su fecha ingresada a HOY:" + periodoT+
//                           "\n Años transcurridos(EDAD EJ😃:" + periodoT.getYears()) ; //USO SI QUIERO SABER EDAD D ALGUIEN POR EJ.
//Federico Lucca says://Para sumar dias desde una fecha determinada(Le sumo ej cantidad de dias)
//        //Existe tambein plusMonths , plusWeeks,plusMonths,plusYears.
//        LocalDate fechaAumen = fechaI.plusDays(15);
//        System.out.println("El dia correspondiente luego de 15 dias a la fecha que ingreso es: " + fechaAumen);
//Federico Lucca says://Para saber si es bisieso el año ingresado --> retorna booleano
//        System.out.println("Año bisiesto:" + fechaI.isLeapYear());
//Federico Lucca says://Para saber en dias el periodo transcurrido(Debi primero utilizar EPOCH para cada fecha utilizo)
//        long auxi1 =fechaI.toEpochDay();
//        long auxi2 = fechaHoy.toEpochDay();
//        long diferenciaDias = (auxi2-auxi1) ;
//        System.out.println("Dias totales trasncurridos desde fecha ingresada a hoy:" + diferenciaDias);
//Federico Lucca says://Para saber cuantos dias tiene el mes ingresado (retorna un numero), tambein esta para saber cuando dias
//        //tiene ese año.
//        System.out.println("El mes ingresado contiene: "+ fechaI.lengthOfMonth() + " dias.");
//        periodoT.toTotalMonths();