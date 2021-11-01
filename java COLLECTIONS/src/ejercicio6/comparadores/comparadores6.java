/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.comparadores;

import ejercicio6.entidades.Tienda;
import java.util.Comparator;

/**
 *
 * @author K-RITO
 */
public class comparadores6 {
    
    public static Comparator<Tienda>productos = new Comparator<Tienda>() {

        @Override
   
         public int compare(Tienda o1, Tienda o2){
            
                return o1.getProducto().compareTo(o2.getProducto());
            }
    };
    
    public static Comparator<Tienda>codigos = new Comparator<Tienda>() {

        @Override
   
         public int compare(Tienda o1, Tienda o2){
            
                return o1.getCodigo().compareTo(o2.getCodigo());
            }
    };
    
    
}
