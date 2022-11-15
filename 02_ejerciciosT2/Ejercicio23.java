/*
 */
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class Ejercicio23 {
    public static void main(String[] args){
        
        TarjetaCredito T = new TarjetaCredito(1000,2222);
        System.out.println("introduzca contraseña");
        int contraseña = new Scanner(System.in).nextInt();
        
        try{
            System.out.println(T.getSaldo(contraseña));
        }catch(Exception getSaldo){
            System.out.println("Error "+getSaldo.getMessage());
        }
        
       T.ingresarDinero(100);
       
       try{
            System.out.println(T.getSaldo(contraseña));
        }catch(Exception getSaldo){
            System.out.println("Error "+getSaldo.getMessage());
        }

       try{
            if(T.sacarDinero(2800, contraseña)){
                System.out.println("Se puede realizar la operación");
            }else{
                System.out.println("No hay saldo suficiente");
            }
            
        }catch(Exception sacarDinero){
            System.out.println("Error:"+ sacarDinero.getMessage());
        }
       
       try{
            System.out.println(T.getSaldo(contraseña));
        }catch(Exception getSaldo){
            System.out.println("Error "+getSaldo.getMessage());
        }
    }
}
