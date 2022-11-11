/*
 */
package pystrings01;

import java.util.*;
/**
 *
 * @author Sergio
 */
public class Pystrings01 {

    
    public static void main(String[] args) {
        
        System.out.println("Inserta una frase con espacios al inicio: ");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println(frase.trim());
                  
    }
    
}
