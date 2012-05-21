import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CursoSwing extends JFrame {
    public CursoSwing() {
        super("Guillermo");
        setSize(230, 70);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //FlowLayout dis = new FlowLayout();
        //FlowLayout dis = new FlowLayout();
        FlowLayout hola = new FlowLayout();
        setLayout(hola);
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pausa = new JButton("Pausa");
        add(play);
        add(stop);
        add(pausa);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        CursoSwing marco = new CursoSwing();
    }
}