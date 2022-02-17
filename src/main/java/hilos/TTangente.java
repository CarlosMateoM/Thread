
package hilos;

/**
 *
 * @author cmateo
 */
public class TTangente extends TFuncion {

    public TTangente(){
        super();
    }
    
    @Override
    public double valorFuncion(double vX) {
        double cX,ang;
        ang = vX * 0.0174532925;
        cX = Math.cos(ang);
        if(cX != 0){
            return Math.sin(ang)/cX;
        }else {
            return -1;
        }
    }
    
}
