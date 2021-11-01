/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;


import ejercicio3.entidades.Electrodomestico;
import ejercicio3.entidades.Lavadora;
import ejercicio3.entidades.Televisor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        Electrodomestico lavadora= new Lavadora();
   
        Electrodomestico televisor= new Televisor();
        
        Electrodomestico elect =new Electrodomestico();
        
        ArrayList<Electrodomestico> listaElectro = new ArrayList<>();
          
       lavadora.creaElectrodomestico();
       lavadora.calcularSuma();
       televisor.creaElectrodomestico();
       televisor.calcularSuma();
        
       
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
        listaElectro.add(televisor);
        listaElectro.add(lavadora);
        
            
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
         System.out.println("la lista es de tamaño : " +listaElectro.size());
                 
     
        System.out.println("ªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªªª");
          
        System.out.println("=============================================================");
        double total = 0;
        double totalTelevisiones = 0;
        double totalLavadoras = 0;
       for (Electrodomestico electrodomestico : listaElectro) {
         //foraech donde hago llamado a cada clase hija atravez de la clase madre
            if (electrodomestico instanceof Lavadora) {
                totalLavadoras += electrodomestico.getPrecio();
                //suma
            }

            if (electrodomestico instanceof Televisor) {
                totalTelevisiones += electrodomestico.getPrecio();
            }
             //contadr total 
            total += electrodomestico.getPrecio();
        }

        System.out.println("El total es de compras es :  $" + total+"\n" + "mas iva : "+.21+ 
                "\n total de iva a sumar  :   $"+ total*.21);
         System.out.println("El total para las lavadoras es de :  $" + totalLavadoras );
        System.out.println("El total para los televisores es de :  $" + totalTelevisiones);
       
    }
    
}
 