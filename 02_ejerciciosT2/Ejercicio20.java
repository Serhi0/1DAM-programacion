
import java.io.File;
import java.util.Scanner;
import java.util.*;

/*
 */

/**
 *
 * @author Sergio
 */
public class Ejercicio20 {
    static public void main(String[] args){
        
        System.out.println("Escribe la ruta de un archivo");
        String nombreruta = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombreruta);
        
        if (ruta.exists()&& ruta.isDirectory()){
            System.out.println("La ruta introducida corresponde a un directorio");
        }else{
            if(ruta.exists()&& ruta.isFile()){
                System.out.println("La ruta introducida es un archivo de tamaño "+ruta.length()+" bytes");
                System.out.println("¿Desea borrarlo? (si/no");
                String validacion = new Scanner(System.in).nextLine();
                if( validacion.equals("si")){
                    ruta.delete();
                    if(ruta.delete()){
                        System.out.println("Hubo un error no se pudo borrar");
                    }else{
                       System.out.println("Se ha borrado correctamente"); 
                    }
                }else{
                    System.out.println("Borrado cancelado");
                }
            }
        }
        
          
    }
}
