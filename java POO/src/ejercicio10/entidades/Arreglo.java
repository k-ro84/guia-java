/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10.entidades;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Arreglo {
     Scanner leer = new Scanner(System.in);
     
       private double[] vectorA= new double[50];
       private double[] vectorB= new double[20];

    public Arreglo() {
    }

    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }
     
//       public void crearArreglo(){
//              for (int i = 0; i < vectorA.length; i++) {
//		vectorA[i] = Math.round(Math.random() * 100+0);
//              // System.out.println("[" + vectorA[i] +"]");  no pide mostrar el vector armado
//             }
//         }
//         
//  
//        public void ordenarArreglo (){
//           Arrays.sort(vectorA);//ordena el vector
//           System.out.println("vectorA en forma ordenada se ve asi: ");//mostrar arreglo
//          for (int i = 0; i < vectorA.length; i++) {
//            
//             System.out.println("[" + vectorA[i] + " ]");
//          }  
//        }
//         
//         //llenar arreglo b
//         public void crearVectorB(){
//            
//              System.out.println("vector B :");
//          for (int i = 0; i < 20; i++) {
//             if(i<10){
//                 vectorB[i]=vectorA[i];
//             }
//             if(i>=10 && i<20){
//                 vectorB[i]=0.5;
//             }
//          }  
//         } 
//         //mostrar arreglo b
//         public void MostrarB(){
//              for (int i = 0; i < vectorB.length; i++) {
//            
//             System.out.println("[" + vectorB[i] + " ]");
//          }
//         }
//          
}
