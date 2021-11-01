/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios5hasta8;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejercicios5a8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
                
              //EJERCICIO 5
//Dado el método metodoA de la clase A, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a6
//  ********** Que pasa si la excepcion la provoca la sentencia a4?? ********
// 
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a3
//                  4do sentencia_a4
//                  5do sentencia_a5
//
//        class A {
//            void metodoA() {
//                sentencia_a1        -toma la excecion
//                sentencia_a2        -toma la excepcion
//                try {
//                    sentencia_a3
//                    sentencia_a4
//                } catch (MioException e){ 
//                    sentencia_a6    -toma la excepcion
//                }
//            sentencia_a5
//            }
//        }

//EJERCICIO 6 
//Dado el método metodoB de la clase B, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//MioException? RT: 1ro sentencia_b1
//                  2do sentencia_b3
//                  3ro sentencia_b4
//
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//MioException? RT: 1ro sentencia_b1
//                  2do sentencia_b2
//                  3ro sentencia_b4
//          
//      class B {
//          void metodoB() {
//              sentencia_b1           -toma la excepcion
//                  try {
//                      sentencia_b2
//                  } catch (MioException e){ 
//                      sentencia_b3   - toma la excepcion
//                  }
//                  finally
//                      sentencia_b4   - toma la excepcion
//                  }
//      }

    


//    8. Dado el método metodoC de la clase C, indique:
//    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción
//    MioException?
//    b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción
//    MioException?
//    c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?

//       class C {
//      void metodoC() throws TuException{
//          sentencia_c1
//              try {
//                  sentencia_c2
//                  sentencia_c3
//              } catch (MioException e){
//                  sentencia_c4
//              } catch (TuException e){
//                  sentencia_c5
//              throw (e)
//              }
//              finally
//                  sentencia_c6
//              }
//      }

// RESPUESTAS
// A) sentencia_c1
//    sentencia_c4
//    sentencia_c6
//
// B) sentencia_c1
//    sentencia_c2
//    sentencia_c3  5????
//    sentencia_c6 
//
// C) sentencia_c1
//    sentencia_c5
//    sentencia_c6
    }
}
