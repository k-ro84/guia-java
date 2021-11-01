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
public class multiplicacion extends operacion{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     double multi;
       
    public multiplicacion(double n1, double n2) {
             
        super(n1, n2, '*');
        this.multi = n1 * n2;
        this.setRes(this.multi);
    }

}
