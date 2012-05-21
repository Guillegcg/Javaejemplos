package anatomia;

import java.awt.Graphics;
import java.awt.Graphics2D;
public class EjemploApplet extends javax.swing. JApplet {
    int numero;
    
    @Override
    public void init() {
        numero = 317;
    }
    
    @Override
    public void paint(Graphics screen) {
        Graphics2D screen2D = (Graphics2D) screen;
        screen2D. drawString("La raiz cuadrada de " +
                numero +
                " es " +
                Math. sqrt(numero), 5, 50);
    }
}