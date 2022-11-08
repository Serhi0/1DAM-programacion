/*
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio19 {
    static public void main(String[] args){
        
        System.out.println("Escribe la ruta de un archivo");
        String nombreruta = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombreruta);
        
        System.out.println("El valor del archivo elegido en bytes es: "+ruta.length()+(" bytes"));
        System.out.println("El valor del archivo elegido en Megabytes es: "+(ruta.length()*1.0/1024)/1024+(" Megabytes"));
        
        
    }
    
}
