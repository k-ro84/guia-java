/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_E.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class NIF {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private long DNI;
    private String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", letra=" + letra + '}';
    }
            
}
