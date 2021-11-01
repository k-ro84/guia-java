/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5hasta8;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Dos {
     //EJERCICIO7 
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static int metodo() {
        int valor = 0;
        try
        {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e)
        {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor final del catch: " + valor);
        } finally
        {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);

        return valor;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try
        {
            System.out.println(metodo());
        } catch (Exception e)
        {
            System.err.println("Excepcion en metodo()");
            e.printStackTrace();
        }
    }
    
}
 //********************************************************
        //Respuesta:
        //Valor final del catch: 43
        //Valor final del finally: 44
        //Valor antes del return: 45
        //45
    