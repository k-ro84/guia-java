/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_E.servicio;

import ejercicio6_E.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class AhorcadoServicio {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
    
      public Ahorcado crearJuego(){
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
           
          System.out.println("ingrese el nombre del jugador");
           String jugador=leer.next();
          System.out.println("ingrese la palabra a buscar");
           String letras=leer.next().toLowerCase();
          char[]palabra =new  char[letras.length()];
          for (int i = 0; i < letras.length(); i++) {
            palabra[i]=letras.charAt(i);
          }
          char[]mostrar=new char[letras.length()];
          for (int i = 0; i < letras.length(); i++) {
            mostrar [i]=  '_';
          }
          System.out.println("ingrese la cantidad de intentos maximos");
          int cantJugadas=leer.nextInt();
         
          System.out.println(mostrar);
          return new Ahorcado(palabra,0,cantJugadas);
       }
       private static final char[] mostrar = new char[20];
       private static void longitud(Ahorcado a) {
        System.out.println("La Palabra a buscar tiene " + a.getPalabra().length + " letras");
       }
       
        private static boolean buscarLetra(Ahorcado a, char letras) {
        for (int i = 0; i < a.getPalabra().length; i++) {
            if (a.getPalabra()[i] == letras) {
                return true;
            }
        }
        return false;
        }
        
        public void encontradas(Ahorcado a){
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            int cuentaLetra = 0;
        int oportunidades = a.getJugadasMaximas();

        System.out.println("Ingresa la letra a buscar");
        char letra = leer.next().toLowerCase().charAt(0);

        if (buscarLetra(a, letra)) {
            System.out.println("La letra SI esta en la palabra");
            for (int i = 0; i < a.getPalabra().length; i++) {
                if (letra == a.getPalabra()[i]) {
                    cuentaLetra+=1;
                    mostrar[i] = letra;//asigno la letra al vector mostrar
                }
            }
            cuentaLetra += a.getLetrasEncontradas();
            a.setLetrasEncontradas(cuentaLetra);
            
        } else {
            System.out.println("La letra NO es parte de la palabra");
            oportunidades-=1;
            a.setJugadasMaximas(oportunidades);
        }
        //muestro el vector "mostrar" con las legras encontradas
        for (int i = 0; i < mostrar.length; i++) {
            System.out.print("[ " + mostrar[i] + " ] ");

        }
        System.out.println("");
//            int found=0;
//            
//             System.out.println("ingrese una letra");
//             char letras=leer.next().toLowerCase().charAt(0);
//             for (int i = 0; i < a.getPalabra().length; i++) {
//               if(letras==a.getPalabra()[i]){
//                   found+=1;
//                  mostrar[i]=letras;
//               }
//                
//            }
//              
              
        }
        
        private static void intentos(Ahorcado a){
            System.out.println("la cantidad de intentos que le quedan es :"+ a.getJugadasMaximas());
        }
        
        public void juego(Ahorcado a){
            while (a.getJugadasMaximas()> 0) {
            encontradas(a);
            longitud(a);
            intentos(a);
            if (a.getJugadasMaximas()> 1 && a.getLetrasEncontradas() == a.getPalabra().length) {
                System.out.println("MUY BIEN Ganaste!");
                break;
            }
            if (a.getJugadasMaximas()== 0) {
                System.out.println("Ahorcado!");
                break;
            }

        }
    
        }
}
