
package hilos;

/**
 *
 * @author cmateo
 */

public class TRango {
    
    protected double minimo;
    protected double maximo;
    
    public TRango(){
        minimo = 0;
        maximo = 0;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }
    
    public double longitud(){
        return Math.abs(maximo - minimo);
    }
    
    public int ajustar(int maximo, double valor){
        System.out.println("\nlongitud: " + longitud());
        //51*400/2 = 10200
        return (int)(valor*maximo/longitud()); 
    }
}
