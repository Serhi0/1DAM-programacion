

package clases;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Caja {
    
    private boolean abierto;
    private String mensaje;
    
    public Caja(String m){
        mensaje = m;
        abierto = false;
    }
    public Caja(String m, boolean a){
        mensaje = m;
        abierto = a;
    }
    public Caja(){
        abierto = false;
        mensaje = "Viva el tema 7";
    }

}
