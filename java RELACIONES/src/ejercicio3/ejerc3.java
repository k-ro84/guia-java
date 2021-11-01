/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.servicio.BarajarServicio;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        BarajarServicio timba = new BarajarServicio();

        int opcion;
        do {
            System.out.println("ººººººººººº  MENU ºººººººººººªªª");
            System.out.println("  1- BARAJAR ");
            System.out.println("  2- SIGUIENTE CARTA");
            System.out.println("  3- CARTA DISPONIBLE");
            System.out.println("  4- DAR CARTAS");
            System.out.println("  5- CARTAS DEL MONTON ");
            System.out.println("  6- MOSTRAR BARAJA ");
            System.out.println("  7- SALIR");
            System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    timba.barajar();
                    break;
                case 2:
                    timba.siguienteCarta();
                   
                    break;
                case 3:
                    timba.cartasDisponibles();
                    break;
                case 4:
                    timba.darCartas();
                    break;
                case 5:
                    timba.cartasMonton();
                    break;

                case 6:
                    timba.mostrarBaraja();
                    break;

        
                case 7:
                    System.out.println("Fin del programa, guardando mazo de cartas");

                    break;
            }

        } while (opcion != 7);
     
                
        System.out.println("($$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

    }

}
