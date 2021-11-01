/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.entidades;

import java.util.Scanner;


/**
 *
 * @author K-RITO
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private int DNI;
    private int numeroCuenta;
    
    private double saldo;
    private double interes;

    public Cuenta() {
        this.saldo=20000;
    }

    public Cuenta(int DNI, int numeroCuenta, double saldo, double interes) {
        this.DNI = DNI;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 20000;
        this.interes =0;
 
    }

    public int getDNI() {
        return DNI;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

 }