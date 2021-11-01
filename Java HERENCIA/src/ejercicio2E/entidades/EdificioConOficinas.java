/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class EdificioConOficinas extends Edificio{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        protected int numeroOficinas;
        protected int PersonasPorOficina;
        protected int numeroPisos;

    public EdificioConOficinas() {
    }

    public EdificioConOficinas(int numeroOficinas, int PersonasPorOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.PersonasPorOficina = PersonasPorOficina;
        this.numeroPisos = numeroPisos;
    }
   
    
    @Override
    public double calcularSuperficie() {
        return ancho*largo;
        
    }
    @Override
    public double calcularVolumen() {
       return alto*ancho*largo;
       
    }
    
     
    public void cantPersonas() {
        System.out.println("Cantidad de Personas por Piso : " + this.PersonasPorOficina * this.numeroOficinas);
        System.out.println("Cantidad Total de Personas en el Edificio  : " + this.PersonasPorOficina* this.numeroOficinas * this.numeroPisos);
    }


    @Override
    public String toString() {
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        return "Edificio Con Oficinas{" + "\n el numero de oficinas es : " + numeroOficinas +
                "\n, Personas Por Oficina : " + PersonasPorOficina +
                "\n, numero de Pisos : " + numeroPisos + '}';
    }

    
}
