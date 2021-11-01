/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Figuras;
import ejercicio4.entidades.Rectangulo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        Figuras fig= new Figuras();
        
        Rectangulo rect = new Rectangulo();
        Circulo circ = new Circulo();
           
        fig.ingresoValores();
       
        circ.tomaDatos();
        circ.calcularArea();
        circ.calcularPerimetro();
        
        
        rect.tomaDatos();
        rect.calcularArea();
        rect.calcularPerimetro();
        rect.Dibujar();
        
        ArrayList<Figuras> listaFiguras = new ArrayList<>();
         fig.mostrar();
         listaFiguras.add(circ);
         listaFiguras.add(rect);
         
          
         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         System.out.println("la lista es de tamaño : " +listaFiguras.size());
                 
     
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          
        for (Iterator<Figuras> iterator = listaFiguras.iterator(); iterator.hasNext();) {
            Figuras next = iterator.next();

        }
       
        
//         // uso de instanceof no puedo hacerlo funcionar ya que los arme tipo void y no con valor
//         System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
//         for (Figuras listaFigura : listaFiguras) {
//           if(listaFigura instanceof Circulo) {
//               System.out.println(""+ listaFigura.calcularArea());
//               System.out.println(""+ listaFigura.calcularPerimetro());
//           }
//           else if(listaFigura instanceof Rectangulo){
//               System.out.println(listaFigura);
//                  System.out.println(""+ listaFigura.calcularArea());
//               System.out.println(""+ listaFigura.calcularPerimetro());
//           }
//        }
        
          
    }
    
}
