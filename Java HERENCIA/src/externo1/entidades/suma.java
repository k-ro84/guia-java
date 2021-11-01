/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package externo1.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class suma extends operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     double suma;

    public suma(double n1, double n2, char operacion) {
        super(n1, n2, operacion);
    }

    public suma(double suma, double n1, double n2, char operacion) {
        super(n1, n2, operacion);
        this.suma = suma;
    }
     
    
    public suma(double n1, double n2) {
             
        super(n1, n2, '+');
        this.suma = n1 + n2;
        this.setRes(this.suma);
    }
    
    
}
