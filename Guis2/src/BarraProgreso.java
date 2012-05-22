package guis;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BarraProgreso extends JFrame {
    
    JProgressBar actual;
    int num = 0;
    
    public BarraProgreso() {
        super("Barra de Progreso");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(205, 68);
        setLayout(new FlowLayout());
        actual = new JProgressBar(0, 2000);
        actual.setValue(0);
        actual.setStringPainted(true);
        add(actual);
        
    }
    
    public void iterate() {
        while (num <= 2000) {
            actual.setValue(num);
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) { }
            num += 1;
        }
    }
     
    public static void main(String args[]) {
        BarraProgreso marco = new BarraProgreso();
        marco.setVisible(true);
        marco.iterate();
    }
       
 
}