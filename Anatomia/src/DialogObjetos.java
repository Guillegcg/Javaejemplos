import javax.swing.*;

public class DialogObjetos extends JFrame {
    public DialogObjetos() {
        String cursos[] = {"Java", "C++", "PHP"};
        int response = JOptionPane.showOptionDialog(null, 
                "Qué Curso sigues?", 
                "Cursos", 
                0, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                cursos, 
                cursos[1]);
    }
    
    public static void main(String args[]) {
        DialogObjetos dialogo = new DialogObjetos();
    }
}