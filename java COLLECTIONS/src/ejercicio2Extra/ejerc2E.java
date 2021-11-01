/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Extra;

import ejercicio2Extra.entidades.CantanteFamoso;
import ejercicio2Extra.servicio.CantanteFamosoServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc2E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
         CantanteFamosoServicio premiacion= new CantanteFamosoServicio();
//        premiacion.add(new CantanteFamoso("AC/DC", "BACK IN BLACK"));
//        premiacion.add(new CantanteFamoso("TARJA TURUNEN", " 500 LETTERS"));
//        premiacion.add(new CantanteFamoso("CHET BAKER", "THE BEST OF CHET BAKER SINGS"));
//        premiacion.add(new CantanteFamoso("APOCALYPTICA", "REPRESSED"));
//        premiacion.add(new CantanteFamoso("SOPOR AETERNUS & THE ENSAMBLE OF SHADOWS", "TODESWUNSCH SEUS LE SOLEIL"));
         

         
           int op;
       do {
           
                System.out.println("************** MENU *********************");
                System.out.println("**   premio a discos mas vendidos      **");
                System.out.println("** 1.-  Introducir un cantante         **");
                System.out.println("** 2-   Mostrar todos los cantantes    **");
                System.out.println("** 3.-  Borrar un cantante             **");
                System.out.println("** 4.-  Tamaño de la grilla            **");
                System.out.println("** 5.-  Salir                          **");
                System.out.println("*****************************************");
                op= leer.nextInt();

                switch (op) {
                    case 1:
                        premiacion.ingresoCantante();
                        break;
                    case 2:
                        premiacion.mostrarLista();
                        break;
                    case 3:
                        premiacion.borrarCantante();
                        break;
                    case 4:
                        premiacion.tamañoGrilla();
                        break;
                    case 5:
                        System.out.println("fin del llenado de la grilla"+
                        "\n"+" momento de la premiacion");
                        break;
                }

            } while (op != 5);
 
        System.out.println("######################################################");
    }
    
}
