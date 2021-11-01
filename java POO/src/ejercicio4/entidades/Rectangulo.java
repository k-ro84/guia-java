/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Rectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     private int base;
     private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {//metodo de consulta;se consulta como esta el objeto
        return base;//o se utiliza return para devolver el valor correspondiente al atributo que se quiere devolver,
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {//set se declara public y devuelve void. permite modificar el estado
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void cargarValores(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese su valor para la base");
        base=leer.nextInt();
        System.out.println("ingrese su valor para la altura");
        altura=leer.nextInt();

    }
    
    public int calcularArea(){
        return this.base* this.altura;
    }
    
    public int calcularPerimetro(){
        return this.base*2 + this.altura*2;  
    }
                
     public void dibujarRectangulo() {
        int b, a;
        b = this.base;
        a = this.altura;
        for (int i = 0; i < a; i++) { //altura
            for (int j = 0; j < b; j++) { //base
                System.out.print("*");
            }
            System.out.println("");
        }
    }
     
}
