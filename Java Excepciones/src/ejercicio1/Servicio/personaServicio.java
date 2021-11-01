/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.Servicio;

import ejercicio1.entidades.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class personaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
     Persona persona=new Persona();
    
  
    public void crearPersona(){
        System.out.println("     TOMA DE DATOS:    ");
             System.out.println("Apellido y Nombre : ");
          persona.setNombre(leer.next());
             System.out.println(" edad : " ); 
          persona.setEdad(leer.nextInt ());
             System.out.println("sexo(f/m/o)");
          String sexo=leer.next();
           sexo =sexo.toLowerCase(); 
         
         if(sexo.equals("f")|| sexo.equals("m")||sexo.equals("o") ){
             System.out.println(sexo);
         }else{
             System.out.println("ingreso una opcion no procesable por el momento");
         }
         
         System.out.println(" su peso(incluido los gramos(por ej: 35,0) : ");
         persona.setPeso(leer.nextDouble());
         System.out.println(" su altura(por ej:1,45) : ");
         persona.setAltura(leer.nextDouble());
         
        
    }
    
    
        int imc = 0;
        int speso=0,bpeso=0,pideal=0;
    
    public int calcularIMC(Persona p) {
       
        if ((p.getPeso()) / (p.getAltura() * p.getAltura()) > 25) {
            imc = 1;
            speso++;
            System.out.println("Sobrepeso");
        } else if ((p.getPeso()) / (p.getAltura() * p.getAltura()) >= 20) {
            imc = 0;
            pideal++;
            System.out.println("Peso Ideal");
        } else {
            imc = -1;
            bpeso++;
            System.out.println("Bajo Peso");
        }
        return imc;
    }
    
    /**
        * Dentro del bloque try vamos a incluir el código que puede lanzar la excepción,
        * mientras que dentro del catch vamos a manejar la posible excepcion lanzada dentro del try,
        * en nuestro caso simplemente vamos a mostrar el mensaje (“La edad debe ser positiva”) 
        * de error que nos proporciona la excepción.

       **/
    
     int contMayor=0, contMenor=0;
    public boolean esMayorDeEdad(Persona p) {
        boolean mayor = false;
        int n=0;
        try {
            
            if (p.getEdad() > 18) {
                
                 contMayor++;
                  mayor=true;
                  System.out.println("mayor de edad");
             } else {
                  contMenor++;
                System.out.println("tiene menos de 18");
                    
           }
            
        }catch(Exception e) {
            System.out.println(" La persona recibida no se puede analizar " );
        }
         return mayor;
    }
   
    
        //ejemplo internet
        //    private int edad;
        // 
        //    public int getEdad() {
        //        return this.edad;
        //    }
        //    
        //    public void edad(){
        //        System.out.println("ingrese edad");
        //        this.edad=leer.nextInt();
        //    }
        //    public void setEdad(int edad) {
        //        if (edad <= 0)
        //            throw new RuntimeException("La edad debe ser positiva");
        //        this.edad = edad;
        //    }
    
    public void Resultados(int cantPersonas){//inicializo para poder tomar el otal de datos ingresados
        // tambien se podria dividir por el numero ya establecido d personas ingresaas(3)
         System.out.println(contMayor + " Personas son mayores de edad");
        System.out.println(contMenor + " Personas son menores de edad");
        System.out.println(pideal + " Personas tienen el peso ideal");
        System.out.println(bpeso + " Personas tienen bajo peso");
        System.out.println(speso + " Personas tienen sobrepeso");
        System.out.println("El % de personas Mayores de edad es " + (contMayor * 100) / cantPersonas + "%");
        System.out.println("El % de personas Menores de edad es " + (contMenor * 100) / cantPersonas + "%");
        System.out.println("El % de personas con peso ideal es " + (pideal * 100) / cantPersonas + "%");
        System.out.println("El % de personas con sobrepeso es " + (speso * 100) / cantPersonas + "%");
        System.out.println("El % de personas con bajo peso es " + (bpeso * 100) / cantPersonas + "%");
    }
       
}
