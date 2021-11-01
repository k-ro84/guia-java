/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author K-RITO
 */
public class practicaInteg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//      System.out.println(parCieloPiso(20,1.6,20000));

//        System.out.println(geringoso("gato"));

      System.out.println(inversa("pErRO"));


    }

//    public static boolean parCieloPiso(int numEnt,double numReal, long numLargo){
//          boolean resultado = false;
//
//       
//        if (numEnt % 2 ==0 && Math.round(numLargo) == Math.floor(numLargo) && numReal >=0) {
//
//            resultado = true;
//        }
// 
//        return true;
//        
//    }    


//    public static String geringoso(String palabra){
//     String resultado = palabra;
//     resultado = resultado.replaceAll("a","apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
//    Opcion A para invertir palabra.
//
//     return resultado;
//
//    }
//    
    
//    public static String inversa(String palabra){
//         String resultado=palabra;
//         String auxInvertida = "";
//         resultado = palabra.toLowerCase();
//         for (int i = 0; i < resultado.length(); i++) {
//
//          auxInvertida = resultado.charAt(i) + auxInvertida;
//          
//          
//    }return auxInvertida;
//    }
    public static String inversa(String palabra){
         
         String auxInvertida = "";
         auxInvertida= palabra.toLowerCase();
         for (int i = palabra.length();i >= 0; i--) {

          auxInvertida = auxInvertida + palabra.charAt(i) ;
          
          
    }return auxInvertida;
    }
    
}