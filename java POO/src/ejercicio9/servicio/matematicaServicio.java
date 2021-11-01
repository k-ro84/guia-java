/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9.servicio;

import ejercicio9.entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class matematicaServicio {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
      Matematica matematica=new Matematica();

      public matematicaServicio(double num1, double num2){//al ser aleatorios los tengo que traer para que se modifiquen aca
          matematica.setNum1(num1);
          matematica.setNum2(num2);
      }
      
        //    public void crearNumero(){
        //         
        //    }
      /*todos por separados ya que tengo que hacer diferencias entre los dos*/
       public int devolverMayor(){
         double num1=matematica.getNum1();
         double num2=matematica.getNum2(); 
        if (num1 > num2) {
            
         return 1;
        } 
        if(num2 >num1){
           
           return 2;
        }
         return 0;  
      }
       /*calcular la potencia del mayoor elevado al menor*/
      public int calcularPotencia(){
        int num1,num2;
        num1 = (int) matematica.getNum1();
        num2 = (int) matematica.getNum2();
        
        if(devolverMayor()==1){
            return(int) Math.pow(num1, num2);
        }               //metodo pow, calcula el primer valor elevado al seguudo
                        // se puede usar incluso cuando es al cuadrado (valor,2)
        if(devolverMayor()==2){
            return(int) Math.pow(num2, num1);
        }      
        return 0;// es el return general del public int
      }
      
      public void calcularRaiz(){//como todo llamado al no ser void debe devolver un resultado
          int num1,num2;
         num1 = Math.abs((int) matematica.getNum1());
         num2 = Math.abs((int) matematica.getNum2());
         
        if (devolverMayor() == 1) {
            System.out.println("|la raiz cuadra del primer numero ya que es el mayor"
                                + "  es : "+ Math.sqrt(num2)+                 "|");
   
        }
        if (devolverMayor() == 2) {
            System.out.println("la raiz cuadrada del segundo al ser el mayor valor "
                                + "de la muestra es : "+Math.sqrt(num1));
        }
    
      }
}
