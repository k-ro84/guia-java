/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.entidades;

/**
 *
 * @author K-RITO
 */
public final class Gato extends Animal {

    public Gato() {
        super();
    }
      
       public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

     @Override
    public void Alimentarse() {
      super.Alimentarse();
        System.out.println("los gatos se alimentan con  :" + alimento);
    }
   
}
