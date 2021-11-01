/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6.entidades;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class Tienda {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Integer codigo;
    private String producto;
    private double precio;

    public Tienda() {
    }

    public Tienda(Integer codigo, String producto, double precio) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "codigo=" + codigo + ", producto=" + producto + ", precio=" + precio + '}';
    }
    
    
}
