import java.util.*;
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio37 {

    
    public static void main(String[] args) {
        
     System.out.println("Introduzca un numero");
     int num = new Scanner(System.in).nextInt();
        
     Integer numero = new Integer(num);
        
     System.out.println(num+"\nbinario = "+Integer.toBinaryString(numero)+"\n"
             +"hexadecimal = "+Integer.toHexString(numero));
        
        
    }

}
