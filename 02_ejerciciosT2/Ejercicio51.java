import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio51 {

    
    public static void main(String[] args) {
        
        HashSet mensajes = new HashSet();
        
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lápiz");
        
        System.out.println(mensajes.size());
        System.out.println(mensajes.toString());
        
    }

}
