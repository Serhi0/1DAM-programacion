


package javaapplication20;

/**
 *
 * @author Sergio
 */
public class EjercicioConArgumentos {

    
    public static void main(String[] args) {
        
        System.out.println("Apartado B");
       
        System.out.println("Argumento 1: "+ args[0]);
        System.out.println("Argumento 1: "+ args[1]);
        
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        
        int n3 = n1 * n2;
        
        System.out.println("La suma de los argumentos es: " +n3);
    }

}
