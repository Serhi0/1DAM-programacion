/*
 */
package pystrings01;

import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Pystrings07 {
    public static void main(String[] args){
        
       System.out.println("Introduce una cadena (minimo 4 posiciones maximo 10 posiciones): ");
       String cadena = new Scanner(System.in).nextLine();
        
           
       if(cadena.length()>10 || cadena.length()<=3){
           System.out.println("Su cadena no esta en el rango, Fin de programa.");
       }else{
             
            StringBuilder Ccadena = new StringBuilder(cadena);
            char guardado;
      
            guardado= cadena.charAt(0);
            Ccadena.deleteCharAt(0).insert(0,cadena.charAt(1));
            Ccadena.deleteCharAt(1).insert(1, guardado);
         
            guardado= cadena.charAt(2);
            Ccadena.deleteCharAt(2).insert(2,cadena.charAt(3));
            Ccadena.deleteCharAt(3).insert(3, guardado);
      
            if(cadena.length()>=6){
               guardado = cadena.charAt(4);
               Ccadena.deleteCharAt(4).insert(4, cadena.charAt(5));
               Ccadena.deleteCharAt(5).insert(5, guardado);
            }
            
            if(cadena.length()>=8){
               guardado = cadena.charAt(6);
               Ccadena.deleteCharAt(6).insert(6, cadena.charAt(7));
               Ccadena.deleteCharAt(7).insert(7, guardado);
            }
            
            if(cadena.length()==10){
            guardado = cadena.charAt(8);
            Ccadena.deleteCharAt(8).insert(8, cadena.charAt(9));
            Ccadena.deleteCharAt(9).insert(9, guardado);
            }
          
            System.out.println(Ccadena);    
          
        }           
    }
}
