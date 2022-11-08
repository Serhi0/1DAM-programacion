/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio16 {
    public static void main(String[] args){
        
         System.out.println("introduce primera frase: ");
         String frase1 = new Scanner(System.in).nextLine();
        
        System.out.println("introduce segunda frase: ");
        String frase2 = new Scanner(System.in).nextLine();
        
       int numero = frase1.indexOf(frase2);
       
       if(numero == -1){
           System.out.println("¿El texto 2 está incluido en el texto 1? False");
       }else{
           System.out.println("¿El texto 2 está incluido en el texto 1? True"); 
       }

    }
}
