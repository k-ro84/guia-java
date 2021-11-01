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
public final class Caballo extends Animal{
    
    public Caballo() {
        super();
    }
      
    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
       
       
       
    //     El modificador final puede utilizarse también como modificador de clases. Al marcar una
    //clase como final impedimos que se generen hijos a partir de esta clase, es decir, cortamos
    //la jerarquía de herencia.
       //public final class Caballo{ }
       // desde aca ya no se puede crear una nueva clase , cierra el ciclo

    @Override
    public void Alimentarse() {
      super.Alimentarse();
        System.out.println("los caballos se alimentan con  :" + alimento);
    }
   
}
