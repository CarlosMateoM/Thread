
package hilos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;

/**
 *
 * @author cmateo
 */
public class TCirculo extends JLabel {

    private int radio;
    private Color colorLinea;

    public TCirculo() {
        super();
        radio = 10;
        setText("");
        colorLinea = Color.BLACK;
        setBackground(Color.WHITE);
    }

    public void setRadio(int radio) {
        if (radio > 0) {
            this.radio = radio;
            setSize(2 * radio, 2 * radio);
        }
    }

    public void setColorLinea(Color color) {
        colorLinea = color;
        repaint();
    }

    public int getRadio() {
        return radio;
    }

    public Color getColorLinea() {
        return colorLinea;
    }

    public void centrar(int cX, int cY) {
        System.out.println("\nCoordenadas:\nx: " + cX + " y:" + cY);
        setLocation(cX, cY);
        
    }

    @Override
    public void paintComponent(Graphics gra) {
        Ellipse2D cir;
        Graphics2D g2D;
        super.paintComponent(gra);
        g2D = (Graphics2D) gra;
        cir = new Ellipse2D.Float(0, 0, getWidth() - 1, getHeight() - 1);
        g2D.setColor(getBackground());
        g2D.fill(cir);
        g2D.setColor(colorLinea);
        g2D.draw(cir);
        
    }

}
