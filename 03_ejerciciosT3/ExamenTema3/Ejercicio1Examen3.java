


package examen3;

/*
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Ejercicio1Examen3 {

    
    public static void main(String[] args) {
        
        int cuenta= 0,suma=0, i;
        for(i=1;cuenta<5;i++){
            if(i%5==0){
                suma += i;
                cuenta++;
            }
            
        }
        System.out.println(suma);
    }

}
