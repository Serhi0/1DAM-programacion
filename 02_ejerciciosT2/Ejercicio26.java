/*
 */
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio26 {
    static public void main(String[] args){
        
        System.out.println("¿Cuantos segundos quiere esperar?");
        int segundos = new Scanner(System.in).nextInt();
        
        try{
           Thread th = new Thread();
           th.sleep(segundos*1000);
           
        }catch(InterruptedException e){
            System.out.print("Error"+e.getMessage());
        }
        
        System.out.println("Se ha completado");
    }
}
