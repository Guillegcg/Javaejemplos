import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OtraBarra extends JFrame {
    public OtraBarra() {
        super("Barra de Herramientas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //crear iconos
        ImageIcon iconoCargar = new ImageIcon("imagenes/open.png");
        
        //Crear botones
        JButton abrir = new JButton(iconoCargar);
        
        //Añadir botones a la barra de herramientas
        JToolBar barra = new JToolBar();
        barra.add(abrir);
        
        //Preparar interface de usuario
        JTextArea editar = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(editar);
        BorderLayout borde = new BorderLayout();
        setLayout(borde);
        add("North", barra);
        add("Center", scroll);
        pack();
        setVisible(true);
    }
    
    public static void main(String args[]) {
        OtraBarra frame = new OtraBarra();
    }
}