import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio50 {

    
    public static void main(String[] args) {
        
        ArrayList mensajes = new ArrayList();
        
        mensajes.add("palabra1");
        mensajes.add("palabra2");
        mensajes.add("palabra3");
        mensajes.add("palabra4");
        mensajes.add("palabra5");
        
        System.out.println(mensajes.size());
        System.out.println(mensajes.get(2));
        System.out.println(mensajes.toString());
        
        mensajes.remove(0);
        
        System.out.println(mensajes.size());
        System.out.println(mensajes.get(2));
        System.out.println(mensajes.toString());
    }

}
