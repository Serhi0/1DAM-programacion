
import java.time.LocalDate;
import java.time.Month;




/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio45 {

    
    public static void main(String[] args) {
        
       LocalDate fecha = LocalDate.of(2100, Month.FEBRUARY, 28);
        System.out.println(fecha.getDayOfWeek());
    }

}
