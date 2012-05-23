package guis;
import javax.swing.*;
import java.awt.*;

public class PanelPestañas extends JPanel {
    public PanelPestañas() {
        super();
        JPanel principal = new JPanel();
        JLabel label1 = new JLabel("Principal");
        principal.add(label1);
        JPanel avanzada = new JPanel();
        JLabel label2 = new JLabel("Avanzada");
        avanzada.add(label2);
        JTabbedPane pestañas = new JTabbedPane();
        ImageIcon icon = new ImageIcon("imagenes/open.png");
        principal.setPreferredSize(new Dimension(810, 750));
        pestañas.addTab("Principal", icon, principal);
        pestañas.addTab("Principal", icon, avanzada);
        
        //Añadimos el componente JTabbedPane
        add(pestañas);
        
        //Habilitamos el uso del scroll de pestañas
        pestañas.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        
    }
    
    //Crear la GUI y mostrarla
    private static void crearYMostrarGUI() {
        JFrame marco = new JFrame("Ejemplo Paneles con Pestañas");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Añadir contenido a la ventana
        marco.add(new PanelPestañas(), BorderLayout.CENTER);
        
        //Mostrar la ventana
        marco.pack();
        marco.setVisible(true);
    }
    
    public static void main(String args[]) {
        crearYMostrarGUI();
    }
}