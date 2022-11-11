/*
 */
package pystrings01;

import java.util.*;
/**
 *
 * @author Sergio
 */
public class Pystrings05 {
    public static void main(String[] args){
        
        System.out.println("introduce una frase para ver si es palíndromo");
        String frase = new Scanner(System.in).nextLine();
        
        frase= frase.toLowerCase().replace("á","a").replace("é", "e")
        .replace("í", "i").replace("ó", "o").replace("ú", "u")
        .replace(" ", "").replace(".", "").replace(",", "");
        
        StringBuilder invertidaC = new StringBuilder(frase);
        
        String invertida = invertidaC.reverse().toString();
        
        if(invertida.equals(frase)){
            System.out.println("La frase si es un palíndromo");
        }else{
            System.out.println("La frase no es un palíndromo");
        } 
    }
}
