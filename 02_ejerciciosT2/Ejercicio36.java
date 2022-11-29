
/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio36 {
/*a. La raíz cuadrada de 150 
b. 2 elevado a 9, y se divide entre el logaritmo neperiano de 6 
c. Coseno de 0.16 radianes. 
d. Seno de 45 grados (utiliza la clase Math para pasar de grados a radianes)*/
    
    public static void main(String[] args) {
        double resultado;
        
        resultado= Math.sqrt(150);
        System.out.println("Raiz cuadrada de 150 = "+resultado+"\n");
        
        resultado= Math.pow(2, 9)/ Math.log(6);
        System.out.println("2^9 / log 6 = "+resultado+"\n");
        
        resultado=  Math.cos(0.16);
        System.out.println("Coseno de 0.16 radianes = "+resultado+"\n");
        
        resultado = Math.sin(Math.toRadians(45));
        System.out.println("Seno de 45 grados = "+resultado+"\n");
                
    }

}
