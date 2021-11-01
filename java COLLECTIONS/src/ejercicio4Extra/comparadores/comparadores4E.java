/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4Extra.comparadores;

import ejercicio4Extra.entidades.CodigoPostal;
import java.util.Comparator;

/**
 *
 * @author K-RITO
 */
public class comparadores4E {
    public static Comparator<CodigoPostal> porAlfabetoInverso = new Comparator<CodigoPostal>() {
            @Override
            public int compare(CodigoPostal o1, CodigoPostal o2){
            
                return o2.getCiudad().compareTo(o1.getCiudad());
            }
    };
    
    
    public static Comparator<CodigoPostal> porAlfabeto = new Comparator<CodigoPostal>() {
            @Override
            public int compare(CodigoPostal o1, CodigoPostal o2){
            
                return o1.getCiudad().compareTo(o2.getCiudad());
            }
    };
    
     public static Comparator<CodigoPostal> porCodigo = new Comparator<CodigoPostal>() {
            @Override
            public int compare(CodigoPostal o1, CodigoPostal o2){
            
                return o1.getCodPostal().compareTo(o2.getCodPostal());
            }
    };
    
}
