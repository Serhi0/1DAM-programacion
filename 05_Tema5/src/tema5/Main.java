


package tema5;

import java.util.ArrayList;
import java.util.List;



/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Main {

    
    public static void main(String[] args) {
        
        Compras a = new Compras(100);
        
        try{
            a.registrarCompra(10);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
       
        try{
            a.registrarCompra(40);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            a.registrarCompra(60);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(a);
        
        List<Double> ab  = new ArrayList<>();
            
        ab.add(1.0);
        ab.add(2.0);
        ab.add(3.0);
       
        for(double au : ab){
            System.out.println(ab);
            
        }
        
        Rectangulo c = new Rectangulo(10,10);
        
        System.out.println(c.getArea());
        c.setBase(20);
        
        System.out.println(c.getArea());
        System.out.println(c);
    }

}
