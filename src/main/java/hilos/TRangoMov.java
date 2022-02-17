
package hilos;

/**
 *
 * @author cmateo
 */
public class TRangoMov extends TRango{

    private double actual;
    private double incremento;

    public TRangoMov() {
        super();
        actual = 0;
        incremento = 0;
    }

    public double getActual() {
        System.out.println("getActual(): " + actual + "\n");
        return actual;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = Math.abs(incremento);
    }
    
    public boolean siguiente(){
        actual += incremento;
        System.out.println("siguiente: \nactula: " + actual );
        
        if(actual > maximo){
            actual = maximo;
            return false;
        }else {
            return true;
        }
    }
  
    public boolean anterior(){
        actual -= incremento;
        if(actual < minimo){
            actual = minimo;
            return false;
        }else{
            return true;
        }
    }
    
    public void reiniciar(boolean inicial){
        if(inicial){
            actual = minimo;
        }else{
            actual = maximo;
        }
    }    
}
