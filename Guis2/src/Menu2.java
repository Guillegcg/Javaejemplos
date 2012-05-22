package guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu2 extends JFrame {
    
    public Menu2() {
        super("Ejemplo Menú");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //crear iconos
        ImageIcon iconoAbrir = new ImageIcon("imagenes/open.png");
        //crear botones
        JButton abrir = new JButton(iconoAbrir);//("Abrir", iconoAbrir);
        //añadir botones a la barra de herramientas
        JToolBar barra = new JToolBar();
        barra.add(abrir);
        //Crear menu
        JMenuItem j1 = new JMenuItem("Abrir");
        JMenuItem j2 = new JMenuItem("Salvar");
        JMenuItem j3 = new JMenuItem("Alta");
        JMenuItem j4 = new JMenuItem("Baja");
        JMenu menu = new JMenu("Archivo");
        menu.add(j1);
        menu.add(j2);
        menu.addSeparator();
        menu.add(j3);
        menu.add(j4);
        JMenuBar menubar = new JMenuBar();
        menubar.add(menu);
        
        //preparar interface de usuario
        JTextArea editar = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(editar);
        BorderLayout borde = new BorderLayout();
        setLayout(borde);
        add("North", barra);
        add("Center", scroll);
        setJMenuBar(menubar);
        pack();
        setVisible(true);
    }
    
    public static void main(String args[]) {
        Menu2 frame = new Menu2();
    }
}