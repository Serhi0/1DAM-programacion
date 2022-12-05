
import java.awt.*;
import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio52 {

    
    public static void main(String[] args) {
        
        HashMap Map = new HashMap();
        Color amarillo = new Color(255,255,0);
        Color rojo = new Color(255,0,0);
        Color verde = new Color(0,255,0);
        
        
        Map.put("1253ABC",rojo);
        Map.put("98525KWX", amarillo);
        Map.put("17632MSE", verde);
        Map.put("85321ABC", amarillo);
        
        System.out.println(Map.size());
        System.out.println(Map.toString());
        
        Map.values();
        System.out.println("Introduce matrícula: ");
        String matricula = new Scanner(System.in).nextLine();
       
       
       if(Map.containsKey(matricula)){
           System.out.println(Map.get(matricula));
       }else{
           System.out.println("No existe esa matrícula");
       }
        
    }

}
