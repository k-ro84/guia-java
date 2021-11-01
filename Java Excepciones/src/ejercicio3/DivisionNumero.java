/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import static com.sun.javafx.fxml.expression.Expression.divide;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class DivisionNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
         String num1 = null, num2 = null;
         Integer numero1 = 0, numero2 = 0;
         float division = 0; 
     
         
        System.out.print("Ingrese numerador:");
        num1 = leer.next();
            
        System.out.print("Ingrese divisor:");
        num2 = leer.next();
            
         try {
            
           
              numero1 = Integer.parseInt(num1);
              numero2 = Integer.parseInt(num2);
              division=numero1/numero2;
//                 System.out.println("La division entre los dos numeros es: " + divide (numero1, numero2) );
             System.out.println((numero1 +"/"+numero2)+  "=" +  (numero1/numero2)  );
             
            int cuadrado = numero1 * numero1;
            System.out.print("El cuadrado de " + num1 + " es " + cuadrado);
            int cuadrado2 = numero2 * numero2;
            System.out.print("\nEl cuadrado de " + num2 + " es " + cuadrado2);

	} catch (NumberFormatException e) {
		System.out.println ("Formato incorrecto del parametro(psrseint9"+ e.toString());

        }  catch (ArithmeticException e) {//este elimina la oppracion con 0
            if (numero2 == 0)
		throw new IllegalArgumentException ("Divisor incorrecto");
//            if (numero1 < 0 || numero2 < 0)
//		throw new NumeroNaturalException("La division no es natural");
          System.out.println("Ultimo Error Excepcion Aritmetica, division por cero"+ e.toString());
          
        }   catch (InputMismatchException e) {
            System.out.println( " Debe ingresar obligatoriamente un número entero."+ e.toString());
            
        } finally{
             System.out.println("\n division " + division);
         System.out.println("\n fin del try");
        }


//        Integer n1 = 0, n2 = 0;
//        Integer n3 = 0;
//        System.out.println("Ingrese dos numeros");
//        String numero1 = leer.next();
//        String numero2 = leer.next();
//
//        try {
//            n1 = Integer.parseInt(numero1);
//            n2 = Integer.parseInt(numero2);
//            System.out.println("La division entre los dos numeros es: " + n1 / n2);
//            System.out.println("Ingrese el tercer numero");
//            n3 = leer.nextInt();
//            System.out.println("el producto del tercer numero y la division es: "+n3*(n1/n2));
//            
//        } catch (NumberFormatException e) {
//            System.out.println("Excepcion de parseInt");
//            System.out.println(e.toString());
//        } catch (ArithmeticException e) {
//            System.out.println("Excepcion division por CERO");
//            System.out.println(e.toString());
//        } catch (InputMismatchException e) {
//            System.out.println("Excepcion de Ingreso");
//            System.out.println(e.toString());
//        } finally {
//
//            System.out.println("TERMINO");
//     }
    }  
}

