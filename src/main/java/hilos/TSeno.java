/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author cmateo
 */
public class TSeno extends TFuncion {
    
    public TSeno(){
        super();
    }

    @Override
    public double valorFuncion(double vX) {
        return Math.sin(vX * 0.0174532925);
    }
    
}
