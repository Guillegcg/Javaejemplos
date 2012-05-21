import java.awt.*;
import javax.swing.*;

public class MarcoReloj extends JFrame {
    public MarcoReloj() {
        super("Reloj");
        setSize(300, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        PanelReloj tiempo = new PanelReloj();
        add(tiempo);
        setVisible(true);   
    }
    
    public static void main(String args[]) {
        MarcoReloj reloj = new MarcoReloj();
    }
}