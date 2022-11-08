
import java.io.File;
import java.util.Scanner;

/*
 */

/**
 *
 * @author Sergio
 */
public class Ejercicio21 {
    static public void main(String[] args){
        
        System.out.println("Escribe la ruta de un directorio");
        String nombredirectorio = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombredirectorio);        
        
        if(ruta.isDirectory()){
           File lista[] = ruta.listFiles();  
           System.out.println("Total archivos y carpetas: "+lista.length); 
        }else{
            System.out.println("Error no es un directorio");
             }
     
    }

}
