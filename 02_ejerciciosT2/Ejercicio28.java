/*
 */
import java.util.*;
import java.net.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio28 {
    public static void main(String[] args){
        
        System.out.println("Introduzca un nombre de equipo: ");
        String equipo = new Scanner(System.in).nextLine();
        
        try{
           InetAddress a = InetAddress.getByName(equipo);
           System.out.println(a.getHostAddress());
        }catch(Exception InetAddress){
            System.out.println("Error "+InetAddress.getMessage());
        }
       
    }
}
