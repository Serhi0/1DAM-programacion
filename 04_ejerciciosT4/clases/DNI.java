

package clases;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class DNI {
    private int numero;
    private char letra;

    public DNI(int n, char l){
        numero = n;
        letra = l;
    }
    public DNI(String dni){
        numero = Integer.parseInt(dni.substring(0,7));
        letra = dni.charAt(8);
    }
    @Override
    public String toString(){
        String aux = Integer.toString(numero)+Character.toString(letra);
        
        return aux;
    }
            
}
