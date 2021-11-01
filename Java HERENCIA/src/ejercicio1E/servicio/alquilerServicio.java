/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1E.servicio;


import ejercicio1E.entidades.Alquiler;
import ejercicio1E.entidades.Barco;
import ejercicio1E.entidades.BarcosAMotor;

import ejercicio1E.entidades.Veleros;
import ejercicio1E.entidades.YatesDeLujo;
import java.time.LocalDate;

import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class alquilerServicio {
    Scanner leer;

    public alquilerServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void creaPuerto() {
        int op = 0;
        do {
            System.out.println("******* ALQUILER DE PUERTO *****");
            System.out.println("* 1. Alquiler de Barco s/Motor *");
            System.out.println("* 2. Alquiler de Velero        *");
            System.out.println("* 3. Alquiler de Yate de Lujo  *");
            System.out.println("* 4. Alquiler de Barco c/Motor *");
            System.out.println("* 5. Salir                     *");
            System.out.println("********************************");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();
            
            switch (op) {
            case 1:
                Barco b = creaBarco();
                System.out.println("El costo del dia de amarre es: $" + b.modulo());
                alquila(b);
                b.barcoDatos();
                break;
            case 2:
                Veleros v = creaVelero();
                System.out.println("El costo del dia de amarre es: $" + v.modulo());
                alquila(v);
                v.Veleromostrar();
                break;
            case 3:
                YatesDeLujo y = creaYate();
                System.out.println("El costo del dia de amarre es: $" + y.modulo());
                alquila(y);
                y.YatesMostrar();
                break;
            case 4:
                BarcosAMotor m = creaMotor();
                System.out.println("El costo del dia de amarre es: $" + m.modulo());
                alquila(m);
                m.barcoAMotormostrar();
                break;
            case 5:
                System.out.println("ªªªª fin de ingresoªªªª");
            default:
                System.out.println("Ingreso una opcion no valida");
        }

            
        } while (op != 5);

   }

    private Barco creaBarco() {
        Barco b = new Barco();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.nextFloat());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextFloat());
        return b;
    }

    private BarcosAMotor creaMotor() {
        BarcosAMotor b = new BarcosAMotor();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.nextFloat());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextFloat());
        System.out.println("Cuantos CV tiene el Motor?");
        b.setCv(leer.nextInt());

        return b;
    }

    private Veleros creaVelero() {
        Veleros b = new Veleros();
        System.out.println("Cual es la Matricula del Barco?");
        b.setMatricula(leer.nextFloat());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextFloat());
        System.out.println("Cuantos Mastiles tiene?");
        b.setMastiles(leer.nextInt());

        return b;
    }

    private YatesDeLujo creaYate() {
        YatesDeLujo b = new YatesDeLujo();
        System.out.println("Cual es la Matricula del yate?");
        b.setMatricula(leer.nextFloat());
        System.out.println("Cuantos metros de eslora tiene?");
        b.setEslora(leer.nextInt());
        System.out.println("Ingrese el año de Fabricacion AAAA");
        b.setAnioFabricacion(leer.nextFloat());
        System.out.println("Cuantos Camarotes tiene?");
        b.setCantCamarotes(leer.nextInt());
        System.out.println("Cual es la potencia del motor en CV");
        b.setCv(leer.nextInt());
        return b;
    }

    private void alquila(Barco b) {
        Character op;
        String Fechaingreso;
        Alquiler a = new Alquiler();
        System.out.println("Amarrar barco al puerto? S/N");
        op = leer.next().toUpperCase().charAt(0);
        switch (op) {
            case 'S':
                a.getNombre();
                
                System.out.println("nombre del rsponsable del alquiler");
                a.setNombre(leer.next().toUpperCase());
                System.out.println("Numero de documento");
                a.setDocumentoCliente(leer.nextLong());
                
                System.out.println("cuando lo alquilo(dd/MM/aaaa)");
                a.setFechaAlquiler(leer.nextInt());
                System.out.println("Fecha de Ingreso (dd/MM/aaaa)");

                a.setFechaDevolucion(leer.nextInt());
                a.precio_alquiler();
               
                break;
            case 'N':
                System.out.println("cierre del alquiler");
                break;
            default:
                System.out.println("Ingreso una opcion no valida");
        }

    }
  

}
