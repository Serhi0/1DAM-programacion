/*
 */
package pystrings01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Pystrings09 {
    public static void main(String[] args){
        
        System.out.println("Introduce palabra (maximo 5 letras): ");
        String cadena1 = new Scanner(System.in).nextLine();
        
        if(cadena1.length()>5){
            System.out.println("Sobrepaso el limite de 5 letras, Fin de programa.");
        }else{
        
        
           System.out.println("Introduce otra palabra (maximo 5 letras): ");
           String cadena2 = new Scanner(System.in).nextLine();
        
           if(cadena2.length()>5){
              System.out.println("Sobrepaso el limite de 5 letras, Fin de programa.");
           }else{
               
             cadena1 = cadena1.toLowerCase().replace("á","a").replace("é", "e")
             .replace("í", "i").replace("ó", "o").replace("ú", "u")
             .replace(" ", "").replace(".", "").replace(",", "");
               
             cadena2 = cadena2.toLowerCase().replace("á","a").replace("é", "e")
             .replace("í", "i").replace("ó", "o").replace("ú", "u")
             .replace(" ", "").replace(".", "").replace(",", "");
               
             StringBuilder completa1 = new StringBuilder(cadena1);
             StringBuilder completa2 = new StringBuilder(cadena2);
               
             completa1.setLength(5);
             completa2.setLength(5);
               
             cadena1 =""+completa1;
             cadena2 =""+completa2;
               
             System.out.println(cadena1);     
             char [] letras1 = cadena1.toCharArray();
             char [] letras2 = cadena2.toCharArray();
             Arrays.sort(letras1);
             Arrays.sort(letras2);
               
             cadena1 =""+letras1[0]+letras1[1]+letras1[2]+letras1[3]+letras1[4];
             cadena2 =""+letras2[0]+letras2[1]+letras2[2]+letras2[3]+letras2[4];
              
               
             if(cadena1.equals(cadena2)){
                  System.out.println("Es anagrama");
             }else{
                  System.out.println("No es anagrama");
                }
            }
        }
    }
}
