/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.entidades;

import java.util.ArrayList;

/**
 *
 * @author K-RITO
 */
public class baraja {
     private int numero;
    private ArrayList <Cartas> baraja;
    
     public baraja() {
        this.baraja = new ArrayList();
        //aca le digo qe recorra el mazo  
        for (int i = 0; i < 1; i++)
        {
            //12 VUELTAS EMPEZANDO DESDE EL 1
            for (int j = 1; j < 13; j++)
            {
                if (j != 8 && j != 9)
                {//AGREGO UNA CARTA DE CADA PALO POR VUELTA
                    this.baraja.add(new Cartas(j, Palos.oro));
                    this.baraja.add(new Cartas(j, Palos.espada));
                    this.baraja.add(new Cartas(j, Palos.copa));
                    this.baraja.add(new Cartas(j, Palos.oro));
                }
            }
        }

    }

    public baraja(int numero, ArrayList<Cartas> baraja) {
        this.numero = numero;
        this.baraja = baraja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Cartas> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Cartas> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "baraja{" + "numero=" + numero + ", baraja=" + baraja + '}';
    }
     
     
     
}
