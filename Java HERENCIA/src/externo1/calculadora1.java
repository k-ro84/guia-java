/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externo1;

import externo1.entidades.division;
import externo1.entidades.multiplicacion;
import externo1.entidades.resta;
import externo1.entidades.suma;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class calculadora1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double n1 = 10;
        double n2 = 5;

        //suma
        suma sum = new suma(n1,n2);
        sum.mostrarResultado();

        //resta
        resta res = new resta(n1,n2);
        res.mostrarResultado();

        //multiplicacion
        multiplicacion mul = new multiplicacion(n1,n2);
        mul.mostrarResultado();

        //division
        division div = new division(n1,n2);
        div.mostrarResultado();
   }
    
}
