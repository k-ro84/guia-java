/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import ejercicio6.servicio.TiendaServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        TiendaServicio mercado=new TiendaServicio();
        
         int op;
       do {
           
                System.out.println("************** MENU *****************");
                System.out.println("** 1.- Introducir un Producto      **");
                System.out.println("** 2.- Modificar Precio            **");
                System.out.println("** 3.- Borrar un Producto          **");
                System.out.println("** 4.- Mostrar todos los Productos **");
                System.out.println("** 5.- tamaño de la planilla       **");
                System.out.println("   6._ salir                         ");
                System.out.println("*************************************");
                op= leer.nextInt();

                switch (op) {
                    case 1:
    //                    System.out.println("Cuantos productos desea agregar?");
    //                    int aux = leer.nextInt();
    //                    for (int i = 0; i < aux; i++) {
                       mercado.ingresoListado();
                        //}
                        break;
                    case 2:
                        mercado.modificar();
                        break;
                    case 3:
                        mercado.buscarEliminar();
                        break;
                    case 4:
                        mercado.mostrarProductos();
                        break;
                    case 5:
                         mercado.productosEnstock();
                    case 6:
                        System.out.println("fin de planilla");
                        break;
                }

            } while (op != 6);

        mercado.OrdenProductos();
        mercado.codigos();
    }
}
