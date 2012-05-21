import javax.swing.*;

public class FrameMio extends JFrame {
    public FrameMio() {
        super("Curso de Java");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        FrameMio hola = new FrameMio();
    }
}