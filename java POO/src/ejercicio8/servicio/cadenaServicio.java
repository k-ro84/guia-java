/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8.servicio;

import ejercicio8.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class cadenaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
         
    Cadena cadena = new Cadena();

    public void crearFrase(String frase) {
        cadena.setFrase(frase);
    }
    
    //conteo total de las vocales
    public int mostrarVocales(){
        int vocales=0; //tengo que contarlas, empieza como todo contador en 0
       int longitud = cadena.getLongitud();//igualo la toma de long para medir la palabra a long sola para la busuqeda
       String frase = cadena.getFrase().toUpperCase();
        for (int i = 0; i < longitud; i++) {
           if (frase.substring(i, (i + 1)).equals("A") || frase.substring(i, (i + 1)).equals("E")
                || frase.substring(i, (i + 1)).equals("I") || frase.substring(i, (i + 1)).equals("O")
                || frase.substring(i, (i + 1)).equals("U")) {
            vocales += 1;
           }
        }
          return vocales;
    }
   
    
    //invertir frase   
    public String invertirFrase() {
        String frase = cadena.getFrase();//traigo a frase
        int longitud = cadena.getLongitud();
        String fraseInvertida = "";
        int i = longitud;
        while (i > 0) {//su la longitud d la palabra es amyor a cero, es decir detecta palabra
            fraseInvertida += frase.substring((i - 1), i);
            i -= 1;
        }
        return fraseInvertida;//retorna el valor  encontrado
    }  

    
    
    //contar las veces que se repite una letra elegida por usuario
    public int vecesRepetido(String letra){
        int repetido = 0;//inicia en 0, contador
        String frase = cadena.getFrase();//traigo la frase
        int longitud = cadena.getLongitud();
        for (int i = 0; i < longitud; i++) {//para i en toda la palabra
            if (frase.substring(i, (i + 1)).equals(letra)) {
         // cada parte de la frase en la que 1 mas 1 ( = a letra)
                repetido += 1;
                //contador
            }
        }
        return repetido;
    }
    
    //reeemplazar a por cualquier caracter ingresado por el usuario
      public void reemplazarLetra(String letra){
          String frase = cadena.getFrase(); 
          String nuevaFrase =" " ;//traigo la frase
          int longitud = cadena.getLongitud();
          for (int i = 0; i <longitud; i++) {
              if (frase.substring(i, (i + 1)).equals("a")) {
                nuevaFrase += letra;
              } else {
                nuevaFrase += frase.substring(i, (i + 1));
               }
            }
          System.out.println(nuevaFrase);
       }
      
    //unir la frase original ingresada con otra nueva
      public void unirFrases(String fraseIngresada) {
        String fraseInicial = cadena.getFrase();
        String frase;
        System.out.println("Ingrese la frase a unir");
        frase = fraseInicial + " " + fraseIngresada;
        System.out.println(frase);
    }
     //busqueda de un letra ingresada por el ususario
       public boolean contiene(String letra){
         String frase = cadena.getFrase();
         int longitud = cadena.getLongitud();
         boolean contiene = false;  
         for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                return true;
            }
        }
           return contiene;
       }
       
       //extra no lo pide, elimina la cadena nueva
       public void partescadena(String posicion){
            String frase = cadena.getFrase();
           int longitud = cadena.getLongitud();
           for (int i = 0; i < longitud; i++) {
               if(frase.substring(i, (i + 1)).equals(posicion)){
                   posicion ="";
               }else{
                   System.out.println("su frase final queda asi");
                   break;
               }
           }
           System.out.println(frase); 
       }
     //como saber cuantas lineas tiene
}
