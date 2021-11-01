/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author K-RITO
 */
public class guia1_27 {
//ejercicio 27: Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
//donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
//programa que permita introducir un cuadrado por teclado y determine si este
//cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("      Cuadrado magico     ");
       
       int[] numeros = { 2, 7, 6, 9, 5, 1, 4, 3, 8 };
        int contador = 0;
        int sumarFilas;
        int sumarColumnas;
        int diagonalP = 0;
        int diagonalS = 0;
        int[] sumaFilas = new int[3];
        int[] sumaColumnas = new int[3];
        int[] sumaDiagonales = new int[2];
        int[][] cuadrado = new int[3][3];
        
        
        for (int i = 0; i < 3; i++) {  //presento
            for (int j = 0; j < 3; j++) {
                if (numeros[contador] > 9 || numeros[contador] < 1) {//elimino las volres que no pueden admitirse
                    System.out.println("Ingreso numeros invalidos");
                } else {
                    cuadrado[i][j] = numeros[contador];
                    contador += 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {   //muetro el cuadrado
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + cuadrado[i][j]+ "]" + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {    //primer parte
            sumarFilas = 0;   //inicializo la sua de filas y columnas dentro  de i ya que cuando epiza la vuelta en j
            sumarColumnas = 0;//toma los valores que conto antes
            for (int j = 0; j < 3; j++) {    
                sumarFilas += cuadrado[i][j];
                sumarColumnas += cuadrado[j][i];
                if (i + j == 2) {   // tomas las dos diagonales
                    diagonalS += cuadrado[i][j];
                }
            }
            diagonalP += cuadrado[i][i];
            sumaFilas[i] = sumarFilas;
            sumaColumnas[i] = sumarColumnas;
        }
        sumaDiagonales[0] = diagonalS;
        sumaDiagonales[1] += diagonalP;
        contador = 0;
        for (int i = 0; i < 3; i++) {   //aca busca la coincidencia de los avlores para probar el cuadrado magico
            if (sumaFilas[i] == sumaColumnas[i] && sumaFilas[i] == sumaDiagonales[0]
                    && sumaDiagonales[0] == sumaDiagonales[1]) {
                contador += 1;
            }
        }
        if (contador == 3) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }
        System.out.println(" suma de las diagonales: " + Arrays.toString(sumaDiagonales));
        System.out.println(" suma de las filas : " + Arrays.toString(sumaFilas));
        System.out.println(" suma de las columnas:  " + Arrays.toString(sumaColumnas));
       
    }
    
}
