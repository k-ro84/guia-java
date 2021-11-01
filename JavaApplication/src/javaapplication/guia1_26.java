/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Scanner;
import static java.lang.Math.pow;
/**
 *
 * @author K-RITO
 */
public class guia1_26 {
//ejercicio 26 :Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
//que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
//cambiada de signo. Es decir, A es anti simétrica si A = -AT . La matriz traspuesta de una 
//matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
//Ejemplo:
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("              llenado de matrices!!!!!!         ");
        
        int matriz[][] = {{0, -2, 4},{2, 0, 2},{-4, -2, 0}};//entre lleves todo y despues cada fils con sus repectivas colmunas
//         int matriz[][]=new int[fil][col];
        System.out.println("ingrese el orden de su matriz");//tomo el tamaño de la matriz
        int n=leer.nextInt();
   
        int[][] matrizT = new int[n][n];
        int contador = 0;
        for (int i = 0; i < n; i++) { //llenado de matriz
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese la posicion: " + contador);//ingreso uno por un los valores
                matriz[i][j] = leer.nextInt();
                contador += 1;
            }
        }
        for (int i = 0; i < n; i++) {   //presento la traspuesta  como la matriz original
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
        contador = 0;         //retoma los valores y los coloca probando los indices
        for (int i = 0; i < n; i++) {       // aca establezco la antisimetria,con el contador a los valores anteriores
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == -matrizT[i][j]) {
                    contador += 1;
                }

            }
        }

        System.out.println(" matriz original:");  //mostrar la matriz original
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j]+ "]" + " ");
            }
            System.out.println("");
        }
        System.out.println("   matriz traspuesta:");//mostrar la traspuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    
                System.out.print( "[" +matrizT[i][j]+ "]" + " ");
            }
            System.out.println("");
        }
        if (contador == pow(n, 2)) {   // boolean  con pow , por  que es exponencial 
            System.out.println(" matrices antisimetricas");
        } else {
            System.out.println("No son matrices antisimetricas");
        }
        leer.close();
        
    }
    
}
