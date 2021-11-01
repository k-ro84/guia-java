/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.comparadores;

import ejercicio5.entidades.Paises;
import java.util.Comparator;

/**
 *
 * @author K-RITO
 */
public class comparadores5 {
    
    public static Comparator<Paises> porAlfabetoInverso = new Comparator<Paises>() {
            @Override
            public int compare(Paises o1, Paises o2){
            
                return o2.getPais().compareTo(o1.getPais());
            }
    };
    
    public static Comparator<Paises> porAlfabeto = new Comparator<Paises>() {
            @Override
            public int compare(Paises o1, Paises o2){
            
                return o1.getPais().compareTo(o2.getPais());
            }
    };
     
    
}
