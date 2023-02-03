

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
        
        if(Toolkit.getDefaultToolkit().getScreenSize().getHeight()> y){
            y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        }else{
            if(Toolkit.getDefaultToolkit().getScreenSize().getWidth()> x){
            y =(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            x =(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
            }
        }
    }
    public Punto(Punto p){
        p.x= p.x/2;
        p.y=p.y/2;
    }
    public Punto(double angulo,double distancia){
       
        x = (int)(distancia *Math.cos(angulo));
        y = (int)(distancia *Math.sin(angulo));
        
    }

}
