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
public class guia1_14_E {
//ejercicio 14 extra : Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
//sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
//operación matemática y deben devolver sus resultados para imprimirlos en el main. 
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println(" operaciones en funciones ");
        
        double num1,num2;
        int operacion;

         System.out.println("Ingrese el primer numero");
          num1 = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
          num2 = leer.nextDouble();
          System.out.println("  _________________________");
          System.out.println(" |                         |");        
          System.out.println(" |    Sistema de calculo   |");
          System.out.println(" |1:    sumar              |");
          System.out.println(" |2:    restar             |");
          System.out.println(" |3:    multiplcar         |");
          System.out.println(" |4:    dividir            |");
          System.out.println(" |_________________________|");
          operacion=leer.nextInt();
          
          //en un if difrente ya que estan en diferentes funciones
          if(operacion==1){
              System.out.println("el resultado de la suma es : "+sumar(num1,num2));
             
          }
          if(operacion==2){
              System.out.println("la resta de sus numeros es : "+restar(num1,num2));
          }
          if(operacion==3){
              System.out.println("el producto de su multiplicacion es :"+multiplicar(num1,num2));
          }
          if(operacion==4){
              System.out.println("el resultado de su division es : "+dividir(num1,num2));
          }
          if(operacion>4 ||operacion<1){
              System.out.println("opcion incorrecta, no incio una operacion valida!!!");
              System.out.println("            pruebe nuevamente         ");
          }
          leer.close();
        }
        public static double sumar(double a, double b) {//ecuacion predeterminada
            return a + b; // aca ekl return va junto ya que es una sola cos la que se pide
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            if (b == 0) {
                return 0;
            } else {

                return a / b;
        }
    }
        
}
