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
public class Persona {
     private String nombre;
     private int edad;
     private String sexo;
     private Double peso; 
     private Double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
         System.out.println(super.toString());
        return "Persona{" + "\n nombre=" + nombre +
                "\n, edad=" + edad + "\n, sexo=" + sexo +
                "\n, peso=" + peso + " kg " + "\n, altura=" + altura + " mts " +'}';
    }
     
     
     
}
