/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7.servicio;

import ejercicio7.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author K-RITO
 */
public class PersonaServicio {
    
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
     
       public int calcularIMC() {
        double imc, pesos, alto;
        alto = persona.getAltura() / 100;
        pesos = persona.getPeso();
        imc = pesos / Math.pow(alto, 2);
            if (imc > 25) {
                return 1;
            }
            if (imc < 20) {
                return -1;
            }
            if (imc >= 20 && imc <= 25) {
                return 0;
            }
            return 2;
         }
       
    public boolean esMayorDeEdad() {

        if (persona.getEdad() >= 18) {
            
            return true;
        } else {
            System.out.println("tiene menos de 18");
            return false;
        }
        
    }
   
     //tipo arreglo
    public Persona[] crearPersonas(){
           Persona[] personas=new Persona[4];
           
           Persona persona1=new Persona( "tomas",61," ",102.2,1.70); //llamada al servicio
           Persona persona2=new Persona("petra",24," ",50.1,1.64);
           Persona persona3=new Persona( "piru",17," ",53.9,1.68);
           Persona persona4=new Persona("lautaro", 34," ",70.2,1.78);
        
             return personas;
    }
   
           
   
}    
  

//2:opcion
// boolean bandera=true;
// public void crearPersonas(){
//           
//            System.out.println("ingrese apellido y nombre");
//             String nomb=leer.next();
//             System.out.println("ingrese edad");
//             int años=leer.nextInt();
//         do{
//            System.out.println("ingrese el sexo: M /F/O");
//             String genero=leer.next();
//               if (genero.equals("F")|| genero.equals("f")){
//                   System.out.println("el genero ingresado es F : femenino" );
//                  
//                 }else 
//                     if(genero.equals ("M")|| genero.equals("m")){
//                       System.out.println("el sexo ingreesado es M : masculino ");
//                 }else
//                       if(genero.equals("O")|| genero.equals("o"))  {
//                       System.out.println("ingreso un genero no binario");
//                }else{
//                       System.out.println("no ingreso un codigo distinguible por el momento");
//                   
//                 } 
//             
//             System.out.println("Ingrese el peso de la Persona");
//             double compost = leer.nextDouble();
//             System.out.println("Ingrese la altura de la Persona");
//             double alto = leer.nextDouble();  
//               System.out.println("desea saber si la persona practica actividades fisicas?:");
//                 String opcion=leer.next();
//                   if(opcion.equals("s") ||opcion.equals("S")){
//                       System.out.println("realiza alguna actividad deportiva o ejercita regularmente?: si(s)/no(n)");
//                       String respuesta=leer.next();
//                        if(respuesta.equals("S")||respuesta.equals("s")){
//                            System.out.println("esta personsa mantine una rutina de ejercicio");
//                          
//                        }else{
//                            
//                            System.out.println("no realiza alguna actividad fisica no es recomendable para la salud");
//                       
//                        }
//                   }else{
//                       System.out.println("fin de la toma de datos");
//                       bandera=false;
//                      
//                   }
//        
//         }  while(bandera=true);
//            
//         }
//     }

//      public void atributo(){
//            System.out.println("desea realizar otra pregunta(s/n):");
//            String respuesta=leer.next();
//            respuesta =respuesta.toLowerCase();
//            if(respuesta.equals ("s")){
//                System.out.println("realiza actividad fisica/o algun deporte:(si/no)");
//            }else{
//                System.out.println("no ess recomendable un estilo de vide sedentario");
//            }
 