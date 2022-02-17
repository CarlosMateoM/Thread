
package hilos;

/**
 *
 * @author cmateo
 */
public class TCoseno extends TFuncion {
    
    public TCoseno(){
        super();
    }

    @Override
    public double valorFuncion(double vX) {
        System.out.println("valorFuncion: \nvX: " + vX);
        return Math.cos(vX * 0.0174532925);
    }
}
