package guis;
import javax.swing.*;
import java.awt.*;

public class AreaTextoScroll extends JFrame {
    JScrollPane scrollpane;
    //Constructor
    public AreaTextoScroll() {
        super("AreaTextoScroll");
        setSize(500, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea comentarios = new JTextArea(8, 40);
        FlowLayout dis = new FlowLayout();
        setLayout(dis);
        add(comentarios);
        setVisible(true);
        scrollpane = new JScrollPane(comentarios);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
    }
    
    public static void main(String args[]) {
        AreaTextoScroll app = new AreaTextoScroll();
    }
}