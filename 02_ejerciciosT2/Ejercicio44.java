
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;




/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio44 {

    
    public static void main(String[] args) {
        
      LocalDate fecha = LocalDate.now();
      
      DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");  
      System.out.println(fecha.format(formato1));
      
      DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println(fecha.format(formato2));
      
          
    }

}
