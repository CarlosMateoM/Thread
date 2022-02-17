package hilos;

/**
 *
 * @author cmateo
 */
public class THiloMov extends Thread {

    private int alto;
    private int ancho;
    private int periodo;
    private TFuncion func;
    private boolean activo;

    public THiloMov() {
        alto = 0;
        ancho = 0;
        periodo = 0;
        activo = false;
        func = null;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if (periodo > 0) {
            this.periodo = periodo;
        }
    }

    public TFuncion getFunc() {
        return func;
    }

    public void setFunc(TFuncion func) {
        this.func = func;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public synchronized void detener() {
        if (activo && isAlive()) {
            activo = false;
        }
    }

    @Override
    public void run() {
       
        while (activo) {
            try {
                
                while (true) {
                    Thread.sleep(periodo);
                    if (!func.siguiente(ancho, alto)) {
                        break;
                    }
                }

                while (true) {
                    Thread.sleep(periodo);
                    if (!func.anterior(ancho, alto)) {
                        break;
                    }
                }

            } catch (InterruptedException error) {
                error.printStackTrace();
                detener();
            }
        }
    }

    public void iniciar() {
        try {
            detener();
        } finally {
            activo = true;
            func.getRangoX().reiniciar(true);
            start();
        }
    }
}
