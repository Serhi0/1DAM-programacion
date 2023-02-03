

package clases;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class DNI {
    private int numero;
    private char letra;

    public DNI(int n, char c){
        numero = n;
        letra = c;
    }
    public DNI(String c){
        numero = Integer.parseInt(c.substring(0,8));
        letra = c.charAt(9);
    }
}
