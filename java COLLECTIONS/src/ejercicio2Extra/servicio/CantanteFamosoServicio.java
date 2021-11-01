/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2Extra.servicio;

import ejercicio2Extra.entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class CantanteFamosoServicio {
    
    private Scanner leer;
     private ArrayList<CantanteFamoso>billboard;
    
    public CantanteFamosoServicio () {
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.billboard=new ArrayList();
        this.billboard.add(new CantanteFamoso("AC/DC", "BACK IN BLACK"));
        this.billboard.add(new CantanteFamoso("TARJA TURUNEN", " 500 LETTERS"));
        this.billboard.add(new CantanteFamoso("CHET BAKER", "THE BEST OF CHET BAKER SINGS"));
        this.billboard.add(new CantanteFamoso("APOCALYPTICA", "REPRESSED"));
        this.billboard.add(new CantanteFamoso("SOPOR AETERNUS & THE ENSAMBLE OF SHADOWS", "TODESWUNSCH SEUS LE SOLEIL"));
    }
    
     public void ingresoCantante(){
         System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
           String respuesta="";//o chartAt
        do {
            CantanteFamoso cf= new CantanteFamoso();
            System.out.println("     Ingrese un cantante a la lista");
            String nomb=leer.next().toUpperCase();
        
            System.out.println("disco mas vendido hasta la fecha de: " + nomb);
            String disco =leer.next().toUpperCase();

            cf.setCantante(nomb);
            cf.setDiscoMasVendido(disco);

            billboard.add(cf);

           System.out.println("Desea agregar otro cantante? S/N");
           respuesta = leer.next();
            System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");

        } while (respuesta.equalsIgnoreCase("Si"));
    }
     
     
      public void mostrarLista(){
        System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
        System.out.println(            " lista de cantantes/bandas ");
        for (CantanteFamoso singers:  billboard) { // Aca los mostramos en un for each

            System.out.println(" Artistas a premiar : "  + 
                    "\n"  +   billboard);
           
       }
          System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
          System.out.println("      grilla de premiacion: ");
          Iterator<CantanteFamoso> it = billboard.iterator();

        while (it.hasNext()) {
                System.out.println( it.next());  
       }
        
      }   
      public void tamañoGrilla(){
          
       System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si "); 
       System.out.println(" La lista es de tamaño: " + "["+ billboard.size()+ "]");
     }
     //busca pero no borra un cante en lista
      public void borrarCantante(){
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
          System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
          System.out.println("  Ingrese el nombre del cantante a remover de la lista : ");
          String  buscado = leer.next().toUpperCase();

        if (billboard.equals(buscado)) {
           billboard.remove(buscado);
            System.out.println("   lista actualizada: " + billboard.remove(buscado));
            System.out.println(" do, re, mi, fa, sol, la, si,do, re, mi, fa, sol, la, si ");
        } else {
            System.out.println("este cantante no es tan reconocido");
        }
     }
    
}
