/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import ejercicio9.entidades.Matematica;
import ejercicio9.servicio.matematicaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
          double num1,num2;
          
        //al generarse manera aleatoria en esta parte el llamado se hace despues ya que sino no toma las operaciones que se hacen
        //no me deja llamar a otras clases si lo pongo antes d generar los numeros
         num1=((Math.random()*50+1));
         System.out.println("el primer numero aletaorio es: " + num1);
         num2=((Math.random()*50+1));
         System.out.println("el segundo numero aleatorio es: " + num2);
         //se podria ingresar mas numeros//
        //despues de ingresar los numeros recien llamo a la clase encargada de hacer los calculos 
         matematicaServicio matematica=new matematicaServicio(num1,num2);
         
         System.out.println("| A partir de dos numeros aleatorios se calculo, mayor de ambos,      |");
         System.out.println("|potencia del mayor elevado al menor y raiz cuadrada del mayor  :     |");
         System.out.println("| _________________________________________________________           |");
         /*llamando al mayor*/
         System.out.println("|el mayor de los numeros es el : " + matematica.devolverMayor()+     "|");
         System.out.println("| _______________________________________________________________     |");
         System.out.println("|la potencia del mayor elevado al menor es :" + matematica.calcularPotencia());
         System.out.println("| _______________________________________________________________     |");
         matematica.calcularRaiz();
    }    
}
