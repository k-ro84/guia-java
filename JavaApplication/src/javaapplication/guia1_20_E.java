/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author K-RITO
 */
public class guia1_20_E {
//ejercicio 20 extra: Los profesores del curso de programación de Egg necesitan llevar un registro de
//las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
//aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
//notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
//cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50% 
// aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("           || PLANILLA DE NOTAS:  || ");
        
        double practico1, practico2, integrador1, integrador2, promedio;
        double[] nota = new double[10];
        int aprobados, desaprobados;
        aprobados = 0;
        desaprobados = 0;
        for (int i = 0; i < 10; i++) {
            practico1 = rellenarNotas();
            practico2 = rellenarNotas();
            integrador1 = rellenarNotas();
            integrador2 = rellenarNotas();
            promedio = practico1 * .1 + practico2 * .15 + integrador1 * .25 + integrador2 * .5;
            nota[i] = promedio;
            if (promedio >= 7) {
                aprobados += 1;
            } else {
                desaprobados += 1;
            }
        }
        System.out.println("La cantidad de aprobados es de " + aprobados);
        System.out.println("La cantidad de desaprobados es de " + desaprobados);
        System.out.println("Las notas son: " + Arrays.toString(nota));
    }
   
    public static int rellenarNotas() {
        return (int) (Math.random() * 10);
    } 
}
//   2: no funciona
//
//double pract1=0, pract2=0, integ1=0, integ2=0, promedio;
//         double[] nota = new double[10];
//        int aprobados=0, desaprobados=0;
//         
//           for (int i = 0; i < 5; i++) {//considero los diez estudiantes
//                System.out.println("ingrese la nota del primer practico");
//                pract1=leer.nextDouble();
//                System.out.println("ingrese la nota del segundo practico");
//                pract1=leer.nextDouble();
//                System.out.println("ingrese la nota del primer integrador");
//                pract1=leer.nextDouble();
//                System.out.println("ingrese la nota del segundo integrador");
//                pract1=leer.nextDouble();
//                
//                promedio = (pract1 * .1 )+ (pract2 * .15) + (integ1 * .25) + (integ2 * .5);
//                nota[i] = promedio;
//                 if (promedio >= 7) {
//                   aprobados += 1;
//                  } else {
//                   desaprobados += 1;
//                  }
//            }
//            System.out.println("La cantidad de aprobados es de " + aprobados);
//            System.out.println("La cantidad de desaprobados es de " + desaprobados);