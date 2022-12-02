
import java.awt.Desktop;
import java.util.*;
import java.io.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio47 {

    
    public static void main(String[] args) {
        
        System.out.println("Escriba la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        
        File archivo = new File(ruta);
        
        try{
            Desktop accion = Desktop.getDesktop();
            accion.open(archivo);
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }


}