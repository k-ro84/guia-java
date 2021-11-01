/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.awt.HeadlessException;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author K-RITO
 */
public class adivinarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
//       ejemplo 1    
//         int intento=0, cont=0;
//         int num= (int) (Math.random()*500);
//         System.out.println(num);
//  
//         //Aplico el try
//         try{
//            //Leo el número ingresado por el usuario (Ingreso datos mediante la Clase JOptionPane)
//            int entrada=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número Entero: "));
//                  cont++;
//            if (num==entrada){
//                JOptionPane.showMessageDialog(null, "Correcto, el número a adivinar era: "+num);
//            }else{
//                if (num<entrada){
//                    JOptionPane.showMessageDialog(null, "Lo siento, el numero buscado es menor que "+entrada, "Fallaste!!", JOptionPane.WARNING_MESSAGE);
//               
//                }else{
//                    JOptionPane.showMessageDialog(null, "Lo siento, el numero buscado es mayor que "+entrada, "Fallaste!!", JOptionPane.WARNING_MESSAGE);
//                }
//                //Llamo al método recursivo para seguir con la adivinanza!!
//          
//            }
//        }catch(HeadlessException | NumberFormatException e){ /*Aquí capturo la excepcion para cuando el usuario introduzca algo que no sea un número entero. */
//            JOptionPane.showMessageDialog(null, "Atención, asegúrese de ingresar un número entero!!", "ERROR!!!", JOptionPane.ERROR_MESSAGE);
//            //Llamo nuevamente al método recursivo para seguir con la adivinanza!!
//     
//    }
         
          
       /**
        * ejemplo 2 
        */
        int numeroAdivinar = (int) (Math.random() * 500);
        // debe ser entre 1 y 500, por lo que se incrementa en 1;
        int numero = 0;
        int intentos = 0;
        do {
            boolean leido;
            do {
                System.out.println("introduzca un numero (1-500)");
                try {
                    intentos++;
                    numero = leer.nextInt();
                    System.out.println("El numero introducido es: " + numero);
                    leido = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No ha introducido un numero entero");
                    leer.next(); // se lee el elemento no reconocido para
                                    // eliminarlo
                    leido = false;
                }
            } while (leido == false);

            if (numero > numeroAdivinar) {
                System.out.println("El numero es menor. Sigue intentando");

            }
            if (numero < numeroAdivinar) {
                System.out.println("El numero es mayor. Sigue intentandolo");
            }

        } while (numero != numeroAdivinar);

        System.out.println("Enhorabuena. Has acertado, ya que el numero es: " + numeroAdivinar);
        System.out.println("Lo has conseguido tras todos estos intentos: " + intentos);

    
       
//ejemplo 3 camus
//         int adivina= (int) (Math.random()*500+1);
//        System.out.println(adivina);
//        
//        do {
//            try{
//            System.out.println("Adivina el numero");
//            cont++;
//            intento=leer.nextInt();
//            }catch(RuntimeException e){
//                System.out.println("metiste mal el dedo");
//                System.out.println(e.toString());
//                break;
//            }
//        if(intento==adivina){
//            System.out.println("GANASTE");
//            
//        }else if(intento>adivina){
//            System.out.println("te pasaste, un poco menos");
//        }else if(intento<adivina){
//            System.out.println("Te falta un poco mas");
//        }
//        } while (intento!=adivina);
//        
//        
//        System.out.println("Intentos "+cont);
//        
//  




//   ejemplo 4 :con for para limitar la cantidad de intentos
//        for (int i = 1; i < 6; i++) {
//             System.out.println(numeroAdivinar);
//                    System.out.println("Por favor ingrese el número:");// El sistema solicita la entrada
//                    int count = 0;// Definir variables para recibir números ingresados ​​por el teclado
//                    try {
//                            count = leer.nextInt();
//                            // Determina el tamaño
//                            if (count > numeroAdivinar) {
//                                    System.out.println("Desafortunadamente, tu suposición es demasiado grande");
//                            } else if (count < numeroAdivinar) {
//                                    System.out.println("Desafortunadamente, tu conjetura es demasiado pequeña");
//                            } else {
//                                    System.out.println("Felicitaciones, lo adivinaste bien");
//                                    break;// Salta directamente
//                            }
//                    } catch (Exception e) {
//                            // e.printStackTrace();
//                            System.out.println("La entrada es incorrecta, solo se pueden ingresar números");
//                            leer.next();// continuar leyendo el siguiente valor
//                    }
//                    if (i == 5) {
//                            System.out.println("Te quedas sin tiempos");
//                    }
//            }


    }
}
