/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_E.servicio;

import ejercicio4_E.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class nifServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNIF(){
        System.out.println("ingrese su  dni");
        long dni=leer.nextLong();
        return new NIF(dni,calcularNIF(dni));  
    }
    private static String calcularNIF(long dni){
    //vector de tipo Cadena con todas las letras
        String vector[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    //obtengo el DNI del objeto y al dividirlo por 23 con el resto tengo el indice del vector        
        int indice = (int) dni%23;
        return vector[indice];
    }
    
    public void mostrarNIF(NIF n){
        System.out.println("NIF: "+n.getDNI()+"-"+n.getLetra());
    }   
}
