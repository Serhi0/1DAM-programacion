/*
 */
package pystrings01;

import java.util.*;
/**
 *
 * @author Sergio
 */
public class Pystrings02 {
    public static void main(String[] args){
        
        System.out.println("Escriba lo que quiera con espacios y se leeran solo los 50 primeros caracteres ");
        String frase = new Scanner(System.in).nextLine();
        
       String sinSeparadores = frase.replaceAll("\\s+","");
       
        System.out.println(sinSeparadores.substring(0, 50));
    }
   
}
