/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejProfe.entidades;

import java.util.ArrayList;

/**
 *
 * @author K-RITO
 */
public class PersonaTerrateniente {
     //Declaracion de atributos
    private String nombre;
    private String apellido;

    //Atributos que originan relaciones //
    private ArrayList<Departamento> listaPropiedades=new ArrayList();// Varios OBJETOS relacionados

    //Constructores
    public PersonaTerrateniente() {
    }

    //El constructor que recibe parametros, no recibe DEPARTAMENTOS (No obligo a que la persona tenga UNOal nacer deptos)
    public PersonaTerrateniente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

  
    public ArrayList<Departamento> getListaPropiedades() {
        return listaPropiedades;
    }

    public void setListaPropiedades(ArrayList<Departamento> listaPropiedades) {
        this.listaPropiedades = listaPropiedades;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido  + ", listaPropiedades=" + listaPropiedades + '}';
    }


}
