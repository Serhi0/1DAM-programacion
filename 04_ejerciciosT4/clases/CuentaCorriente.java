

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
       
        this((int)(0+(1001-0)*Math.random()),0);
    }
    public CuentaCorriente(int numero){
      
        this(numero,0);
    }
    public CuentaCorriente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public void a�adirDinero(int cantidad){
        saldo += cantidad;
    }
    public void retirarDinero(int cantidad){
        if(saldo - cantidad <= 0){
            saldo = 0;
        }else{
            saldo -= cantidad;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    @Override
    public String toString(){
        String aux;
        aux = "Cuenta numero: "+numero+" Saldo: "+saldo;
        return aux;
    }
   

}
