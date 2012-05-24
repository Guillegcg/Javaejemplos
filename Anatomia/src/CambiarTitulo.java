package eventos;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CambiarTitulo extends JFrame implements ActionListener { // 1) Implemento la interface ActionListener
    JButton b1 = new JButton("Curso de JavaScript");
    JButton b2 = new JButton("Curso de PHP");
    
    public CambiarTitulo() {
        super("Barra de Titulo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**2) Método que le indica el componente a vigilas aca son dos **/
        b1.addActionListener(this);
        b2.addActionListener(this);
        /****************************************************************/
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt) {
        Object fuente = evt.getSource();
        if (fuente == b1) {
            setTitle("Curso de JavaScriptsssssssssssssssssssssssss");
        } else if (fuente == b2) {
            setTitle("Curso de PHP");
        }
        repaint();
    }
    
    public static void main(String args[]) {
        CambiarTitulo marco = new CambiarTitulo();
    }
    
}