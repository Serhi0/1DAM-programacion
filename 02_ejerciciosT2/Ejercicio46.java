
import java.time.*;
import java.util.*;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio46 {

    
    public static void main(String[] args) {
        
        Thread Pausa = new Thread();
        try{
            Random random = new Random();
            long milisegundos = 0 + random.nextLong(10-0);
            
            Instant ahora = Instant.now();
            Pausa.sleep(milisegundos*1000);
            Instant despues = Instant.now();
            
            System.out.println(Duration.between(ahora,
                    despues).getSeconds()+" segundos");
        }catch(InterruptedException e){
            System.out.println("Error "+e.getMessage());
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
    }

}
