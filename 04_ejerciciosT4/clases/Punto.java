

package clases;
import java.awt.*;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class Punto {
    
    private int x;
    private int y;
    
    public Punto(){
        
        this(0,0);   
    }
    public Punto(int x, int y){
        
        if((Toolkit.getDefaultToolkit().getScreenSize().getHeight()< y) ||
           (Toolkit.getDefaultToolkit().getScreenSize().getWidth()< x)) {
                this.y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
                this.x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }else{
            this.x = x;
            this.y = y;
            }
    }
    public Punto(Punto p){
        this(p.x/2,p.y/2);
    }
    public Punto(double angulo,double distancia){
       
        /*this.x = (int)(distancia *Math.cos(angulo));
        this.y = (int)(distancia *Math.sin(angulo));*/
        this((int)(distancia *Math.cos(angulo)),(int)(distancia *Math.sin(angulo)));
        
    }
    @Override
    public String toString(){
        String aux;
        aux = "Coordenada x: "+Integer.toString(x)+" Cordenada y: "
                +Integer.toString(y);
        
        return aux;
    }

}
