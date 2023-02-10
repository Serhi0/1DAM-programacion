

package clases;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class DNIMejorado {
    
    private int numero;
    private char letra;
    
    public DNIMejorado(int n){
        numero = n;
        letra = this.calcularLetra(n);
        
    }
    public int getNumero(){
        return numero;
    }
    public int getLetra(){
        return letra;
    }
           
    private char calcularLetra(int n){
          String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
          int resto = n%23;
          return caracteres.charAt(resto);
     }  

}
