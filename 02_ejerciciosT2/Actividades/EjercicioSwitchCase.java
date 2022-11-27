import java.util.*;
/**
 *
 * @author Sergio
 */
public class EjercicioSwitchCase {
    public static void main(String[] args){
        
        System.out.println("Introduzca el primer número: ");
        int num1 = new Scanner(System.in).nextInt();
        
        System.out.println("Introduzca el segundo número: ");
        int num2 = new Scanner(System.in).nextInt();
        
        System.out.println("Introduzca simbolo operación (+, -, *, /,): ");
        String operacion = new Scanner(System.in).nextLine();
        
        operacion = operacion.trim();
        char operador = operacion.charAt(0);
        double resultado;
       
        switch(operador){
        case '+':
            resultado =   num1 + num2 ;
            System.out.println("El resultado ="+resultado );
        break;
        case '-':
            resultado = num1 - num2;
            System.out.println("El resultado ="+resultado );
        break;
        case '*':
            resultado =   num1 * num2 ;
            System.out.println("El resultado ="+resultado );
        break;
        case '/':
            if(num2 > 0){
                resultado = (num1*1.0) / num2;
                System.out.println("El resultado ="+resultado );
            }else{
                System.out.println("No se puede hacer esta división");
            } 
        break;
        default:
                System.out.println("==============================================");
                System.out.println("=    No inserto ningún operador correcto     =");
                System.out.println("==============================================");
            break;
        }    
    }
}
