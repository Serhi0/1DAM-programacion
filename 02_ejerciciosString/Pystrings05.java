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
        
        System.out.println("introduce una frase para ver si es pal�ndromo");
        String frase = new Scanner(System.in).nextLine();
        
        frase= frase.toLowerCase().replace("�","a").replace("�", "e")
        .replace("�", "i").replace("�", "o").replace("�", "u")
        .replace(" ", "").replace(".", "").replace(",", "");
        
        StringBuilder invertidaC = new StringBuilder(frase);
        
        String invertida = invertidaC.reverse().toString();
        
        if(invertida.equals(frase)){
            System.out.println("La frase si es un pal�ndromo");
        }else{
            System.out.println("La frase no es un pal�ndromo");
        } 
    }
}
