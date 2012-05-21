package guis;
import java.awt.event.*;
import javax.swing.*;

public class Sliders extends JFrame {
    public Sliders() {
        super("Ejemplo Slider");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSlider miSlider = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
        miSlider.setMajorTickSpacing(10);
        miSlider.setMinorTickSpacing(1);
        miSlider.setPaintTicks(true);
        miSlider.setPaintLabels(true);
        add(miSlider);
    }
    
    public static void main(String args[]) {
        Sliders marco = new Sliders();
        marco.pack();
        marco.setVisible(true);
    }
}