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
public class Animal {
    //el modificador de acceso protected permite que las subclases puedan
    // acceder a los atributos sin la necesidad de getters y setters. 
     protected String nombre;
     protected String alimento;
     protected Integer edad;
     protected String raza;

     // Si la superclase tiene definido el constructor vacío y no colocamos una
     //llamada explícita super, se llamará el constructor vacío de la superclase.

    public Animal() {
    }
    
     
    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
  
    public void Alimentarse(){
        System.out.println("Nombre : " + nombre + "\nAlimento : " + alimento + "\nEdad : " + edad + "\nRaza : " + raza);
    }
}
//    Herencia Jerárquica: en la herencia jerárquica, una clase sirve como una superclase (clase
  //base) para más de una subclase. En la imagen inferior, la clase A sirve como clase base para
  //la clase derivada B, C y D
 