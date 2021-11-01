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
public final class Perro extends Animal{

      public Perro() {
        super();
    }
      
       public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }


    //super es la que me permite elegir qué constructor, entre los que tiene definida la clase padre,
        //es el que debo usar.           
        //La palabra clave super nos sirve para hacer referencia o llamar a los atributos, métodos y
        //constructores de la superclase en las subclases.

     @Override
    public void Alimentarse() {
      super.Alimentarse();
        System.out.println("los perros se alimentan con  :" + alimento);
    }
   
}
