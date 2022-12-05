
import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio54 {

    
    public static void main(String[] args) {
        
        ArrayList lista = new ArrayList();
        
        lista.add("palabra1");
        lista.add("palabra2");
        lista.add("palabra3");
        lista.add("palabra4");
        lista.add("palabra5");
        lista.add("palabra6");
        lista.add("palabra7");
        lista.add("palabra8");
        lista.add("palabra9");
        lista.add("palabra10");
        
        System.out.println(lista.toString());
        
        Collections.sort(lista);
        
        System.out.println(lista.toString());
        
    }

}
