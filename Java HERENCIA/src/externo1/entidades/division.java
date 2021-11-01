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
public class division extends operacion {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double div = 0;
       
    public division(double n1, double n2) {
             
        super(n1, n2, '/');
        if(n2==0) System.out.println("No se puede dividir entre cero");
        else this.div = n1 / n2;
        this.setRes(this.div);
    }    
}
