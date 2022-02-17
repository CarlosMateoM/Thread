
package hilos;

/**
 *
 * @author cmateo
 */
public abstract class TFuncion{
    

    protected TCirculo cir;
    protected TRango rangoY;
    protected TRangoMov rangoX;
    
    public TFuncion(){
        cir = new TCirculo();
        rangoY = new TRango();
        rangoX = new TRangoMov();
    }

    public TCirculo getCir() {
        return cir;
    }

    public TRango getRangoY() {
        return rangoY;
    }

    public TRangoMov getRangoX() {
        return rangoX;
    }
    
    public abstract double valorFuncion(double vX);
    
    public int valorY(int maxY){
        return rangoY.ajustar(maxY, valorFuncion(rangoX.getActual()));
    }
    
    public void mover(int maxX, int maxY){
        int cX, cY; 
        cY = maxY/2 - valorY(maxY);
        cX = maxX/2 + rangoX.ajustar(maxX, rangoX.getActual());
 
        
        cir.centrar(cX, cY);
    }
    
    public boolean siguiente(int maxX, int maxY){
        if(rangoX.siguiente()){
            mover(maxX,maxY);
            return true;
        }else {
            return false;
        }
    }
    
    public boolean anterior(int maxX, int maxY){
        if(rangoX.anterior()){
            mover(maxX, maxY);
            return true;
        }else{
            return false;
        }
    }
}
