
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integCapicua;
// Función numeroCapicua(): La función recibirá un numero x y deberá determinar si es
//        capicúa o no. Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es.

import java.util.Scanner;

//        Además deberemos contemplar los siguientes escenarios: • Contemplar que el numero que
//        llega puede ser negativo. • Contemplar que el numero que llega puede ser de un dígito, si
//        es así debe devolver true. • Contemplar que el numero que llega puede ser null, si es así
//        debe devolver false. *.
//         */
//        
/**
 *
 * @author K-RITO
 */
public class JavaHERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");        
       
       
           int numero;
        int falta, numeroInvertido, resto;
       
        System.out.println("ingrese largo del arreglo");
        numero = leer.nextInt();
        int[] a = new int[numero];
        for (int i = 0; i < numero; i++) {
            System.out.println("ingrese numero para el arreglo " + i);
            a[i] = leer.nextInt();
            System.out.println("[ arreglo ]" + i + " = " + a[i]);
        }
        for (int j = 0; j < numero; j++) {

            if (a[j] >= 0) {

                falta = a[j];
                numeroInvertido = 0;
                resto = 0;


                while (falta != 0) {
                    resto = falta % 10;
                    numeroInvertido = numeroInvertido * 10 + resto;
                    falta = falta / 10;
                }


                if (numeroInvertido == a[j]) {
                    System.out.println("El espacio "+j+" del arreglo es capicua");
                } else {
                    System.out.println("El espacio "+j+" del arreglo no es capicua");
                }
            } else {
                System.out.println("el espacio "+j+" del arreglo es menor a 0");
            }
        }  
     
        
       
        int aux;
        int inverso= 0;
       do{
            System.out.println("Ingresa un numero");
            numero= leer.nextInt();
        }while (numero<10 && numero > -10);

        aux = numero;

        while(aux!=0) {
            int cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(numero == inverso){
            System.out.println("numero capicua");
        }else {
             System.out.println("El numero no es capicua");
        }
    }
}
