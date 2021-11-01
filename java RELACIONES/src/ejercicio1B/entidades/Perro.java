package ejercicio1B.entidades;

import ejercicio1B.enumeraciones.Raza;
import ejercicio1B.enumeraciones.Tamanio;
import java.util.Scanner;

public class Perro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String Nombre;

    private int edad;

    private Raza raza;

    private Tamanio tam;

    public Perro() {
    }

    public Perro(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }
    
    

    public Perro(String Nombre, int edad, Raza raza, Tamanio tam) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.raza = raza;
        this.tam = tam;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Tamanio getTam() {
        return tam;
    }

    public void setTam(Tamanio tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Perro{" + "Nombre=" + Nombre + ", edad=" + edad + ", raza=" + raza + ", tam=" + tam + '}';
    }

   
   
}
