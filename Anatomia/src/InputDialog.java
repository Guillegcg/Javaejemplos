import javax.swing.*;

public class InputDialog extends JFrame {
    public InputDialog() {
        String respuesta = JOptionPane.showInputDialog(null,
                "Escribe tu nombre:");
    }
    
    public static void main(String args[]) {
        InputDialog dialogo = new InputDialog();
        System.out.println(dialogo);
    }
}