/*
 */
import bpc.daw.objetos.TarjetaCredito;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio22 {
    public static void main(String[] args){
        
     TarjetaCredito T = new TarjetaCredito(5000,1111);
     
     System.out.println("Introduzca la contraseņa");
     int contraseņa = new Scanner(System.in).nextInt();
     
     try {
     System.out.println(T.getSaldo(contraseņa));
    }catch(Exception getSaldo){
     System.out.println("Error");
    }
     try{
      T.sacarDinero(2000,contraseņa);
     }catch(Exception SacarDinero){
     System.out.println("Error");
     }
      try {
     System.out.println(T.getSaldo(contraseņa));
    }catch(Exception getSaldo){
     System.out.println("Error");
    }
}
}
