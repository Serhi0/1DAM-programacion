
import java.text.NumberFormat;




/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio43 {

    
    public static void main(String[] args) {
        
        double Pi = 4 * Math.tan(1);
        String Resultado;
        
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(4);
        Resultado = n.format(Pi);
        
        System.out.println("Resultado: "+Resultado);
        
        
    }

}
