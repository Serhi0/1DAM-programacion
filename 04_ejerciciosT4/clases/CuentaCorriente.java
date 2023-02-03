

package clases;

import java.util.Random;

/**
 *
 * @author Sergio serhi0.oficial@gmail.com
 */
public class CuentaCorriente {
    
    private int numero;
    private double saldo;
    
    public CuentaCorriente(){
        Random aleatorio = new Random();
        numero = 0 + aleatorio.nextInt(1001-0);
        saldo = 0;
    }
    public CuentaCorriente(int numero){
        this.numero=  numero;
        saldo = 0;
    }
    public CuentaCorriente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void añadirDinero(int cantidad){
        saldo += cantidad;
    }
    public void retirarDinero(int cantidad){
        if(saldo - cantidad <= 0){
            saldo = 0;
        }else{
            saldo -= cantidad;
        }
    }

}
