/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2_E.servicio;
import ejercicio2_E.entidades.Puntos;
import java.util.Scanner;
/**
 *
 * @author K-RITO
 */
public class puntosServicio {
Scanner leer = new Scanner(System.in);
    
      Puntos p=new Puntos();
    
    public Puntos crearPuntos(){
        System.out.println("Ingresa la primer cooodenada del primer punto");
        double x1 = leer.nextInt();
        System.out.println("Ingresa la segunda cooodenada del primer punto");
        double x2 = leer.nextInt();
        System.out.println("Ingresa la primer coordenada del segundo punto");
        double y1 = leer.nextInt();
        System.out.println("Ingresa la segunda coordenada del segundo punto");
        double y2 = leer.nextInt();
      return new Puntos(x1,x2,y1,y2);
    }
    
    public void calcularDist(Puntos p){
         double dist= Math.sqrt(Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()), 2));
       System.out.println("La distancia entre los puntos es: "+ dist);
    }
 
}
