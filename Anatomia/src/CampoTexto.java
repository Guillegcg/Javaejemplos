import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JFrame {
    public CampoTexto() {
        super("CampoTexto");
        setSize(600, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquetaPagina = new JLabel("Dirección página web: ", JLabel.RIGHT);
        JTextField direccionPagina = new JTextField("Escribe aquí", 30);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(etiquetaPagina);
        add(direccionPagina);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        CampoTexto miapli = new CampoTexto();
    }
}