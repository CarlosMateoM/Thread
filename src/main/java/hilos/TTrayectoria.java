package hilos;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * @author cmateo
 */
public class TTrayectoria extends TFuncion {

    private int base;
    private int altura;
    private int nTriangulos;
    private javax.swing.JFrame frame;

    public TTrayectoria(javax.swing.JFrame frame) {
        super();
        this.frame = frame;
        nTriangulos = 4;
        base = (frame.getWidth() / nTriangulos) / 2;
        altura = frame.getHeight() / nTriangulos;
    }

    public void dibujar(int x, int y) {
        Ellipse2D cir = new Ellipse2D.Float(x + 15, y + 85, 2, 2);
        Graphics2D g = (Graphics2D) frame.getGraphics();
        g.setColor(Color.BLACK);
        g.fill(cir);
        g.draw(cir);
    }

    @Override
    public void mover(int maxX, int maxY) {
        int cX, cY;
        cY =(maxY - 50) - (valorY(maxY));
        //cY =- valorY(maxY);
        //cX =+ rangoX.ajustar(maxX, rangoX.getActual());
        cX =+ rangoX.ajustar(maxX, rangoX.getActual());

        //cir.centrar(cX, cY);

        dibujar(cX, cY);
        System.out.println("dibujar en x: " + cX + " y: " + cY);
    }

    @Override
    public double valorFuncion(double vX) {
        //return (vX*0.0174532925)*(Math.cos(Math.PI/(vX*0.0174532925)));
        //return -Math.abs(vX-100)*0.0174532925;
        //return (0.0174532925)*vX*1.01-3.04;
        //return -(0.0174532925)*vX*1.01-3.04;
        double angulo;
            angulo = Math.atan(altura / base);
        if (rangoX.getActual() < base) {
            return (vX * 0.0174532925) * angulo;
        } else {
            return (-vX * 0.0174532925) * angulo;
        }

    }

    /*
    private int altura;
    private int tActual;
    private Color colorLinea;
    private int numeroTriangulos;
    
    public TTrayectoria(){
        altura = 10;
        tActual = 0;
        colorLinea = Color.BLACK;
        numeroTriangulos = 4;
    }

    public int getNumeroTriangulos() {
        return numeroTriangulos;
    }

    public void setNumeroTriangulos(int numeroTriangulos) {
        this.numeroTriangulos = numeroTriangulos;
    }
    
    public double getBase(){
        return (numeroTriangulos)/2;
    }
    
    
    
    
    
    
    /*
    
    private int nTriangles;
    private Color colorPath;
    protected Polygon vertices;

    public TTrayectoria() {
        super();
        nTriangles = 0;
        colorPath = Color.BLACK;
    }

    public Color getColorPath() {
        return colorPath;
    }

    public void setColorPath(Color colorPath) {
        this.colorPath = colorPath;
    }

    public int getNTriangles() {
        return nTriangles;
    }

    public void setNTringles(int nTriangles) {
        this.nTriangles = nTriangles;
    }

    private double lengthX(double min, double max) {
        return Math.abs(max - min);
    }

    public void drawPath() {

        double base;
        int triangle;
        double altura;
        double lengthX;
        double xI, xF, yI, yF;
        xI = rangoX.getMinimo();
        xF = rangoX.getMaximo();
        yI = rangoY.getMinimo();
        yF = rangoY.getMaximo();
        lengthX = lengthX(xI, xF);
        base = lengthX / getNTriangles();
        altura = base / 2;
        triangle = 1;
        while (triangle <= getNTriangles()) {
///         drawPath(xI, base, altura);
            altura += altura;
            triangle++;
        }
    }

    private void drawPath(int xI, int yF, double base, double altura) {
        vertices.addPoint(xI, yF);
        vertices.addPoint((yF + (int) altura), (yF - (int) altura));
        vertices.addPoint(yF, (int) (yF + base));
        Graphics2D g;
        g.setColor(getColorPath());


    }
     */
}
