/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio14 {
    public static void main(String[] args){
        
        System.out.println("Escribre una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println("Letra que hay justo a la mitad de la frase: "+frase.charAt(frase.length()/2));
    }
}
