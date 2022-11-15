/*
 */
import java.util.*;
import java.net.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio27 {
    static public void main(String[] args){
        
        System.out.println("Introduzca una dirección IP");
        String IP = new Scanner(System.in).nextLine();
        
        System.out.println("Introduzca un timeout (en milisegundos):");        
        int timeout = new Scanner(System.in).nextInt();                
        
        try{
           InetAddress a = InetAddress.getByName(IP);
  
           boolean ping = a.isReachable(timeout);
            
            if(ping){
                System.out.println("Se puede hacer el ping");
            }else{
                System.out.println("No se puede hacer ping");
            }
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
        }
       
    }
}
