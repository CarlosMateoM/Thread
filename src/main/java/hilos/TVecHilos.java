
package hilos;

import java.util.ArrayList;

/**
 *
 * @author cmateo
 */
public class TVecHilos {
    
    private ArrayList<THiloMov> vec;
    
    public TVecHilos(){
        vec = new ArrayList<>();
    }
    
    public int cantidad(){
        return vec.size();
    }
    
    public void agregar(THiloMov hiloM){
        if(!vec.contains(hiloM) && hiloM != null){
            vec.add(hiloM);
        }
    }
    
    public void eliminar(THiloMov hiloM){
        hiloM.detener();
        vec.remove(hiloM);
    }
    
    public void eliminar(int pos){
        eliminar(vec.get(pos));
    }
    
    public THiloMov getHilo(int pos){
        return vec.get(pos);
    }
    
    public void limpiar(){
        int i, n;
        n = cantidad();
        for(i = 0; i < n; i++){
            eliminar(0);
        }
    }
    
            
}
