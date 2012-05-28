import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class ActionCommand extends JFrame implements ActionListener { //Implemento la interface
    
    JButton b1 = new JButton("Curso de JavaScript");
    Boolean flag = false;
    
    public ActionCommand() {
        super("Barra de Título");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1.addActionListener(this); // Método que le indica el componente a vigilar
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        pack();
        setVisible(true);
    }
    
    /* Se implementa los métodos de la interface (aquí solo uno) */
    public void actionPerformed(ActionEvent evt) {
        if (!flag) {
            b1.setActionCommand("prueba"); //Seteo el ActionCommand
            b1.setLabel(b1.getActionCommand()); //Ahora le paso el ActionCommand al Label del objeto boton
            repaint();
            flag = true;
        } else {
            b1.setActionCommand("Curso de JavaScript");
            b1.setLabel(b1.getActionCommand());
            repaint();
            flag = false;
        }
    }
    
    public static void main(String args[]) {
        ActionCommand marco = new ActionCommand();
    }
}