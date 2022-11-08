/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio15 {
    public static void main(String[] args){
        
        String clave ="hola";
        
        System.out.println("introduce contraseña: ");
        String Entrada = new Scanner(System.in).nextLine();
        
        
        System.out.println("¿Coincide la clave? "+Entrada.equals(clave));
    }
}
