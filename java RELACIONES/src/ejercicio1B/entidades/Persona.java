package ejercicio1B.entidades;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String name;

    private String apellido;

    private int anios;

    private long dni;

    private Perro can;

    public Persona() {
    }

    public Persona(String name, String apellido, int anios, long dni, Perro can) {
        this.name = name;
        this.apellido = apellido;
        this.anios = anios;
        this.dni = dni;
        this.can = can;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getCan() {
        return can;
    }

    public void setCan(Perro can) {
        this.can = can;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", apellido=" + apellido + ", anios=" + anios + ", dni=" + dni + ", can=" + can + '}';
    }
}
