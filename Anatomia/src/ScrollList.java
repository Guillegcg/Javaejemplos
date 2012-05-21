package guis;
import javax.swing.*;
import java.awt.*;
public class ScrollList extends JFrame {
    JScrollPane scrollpane;
    public ScrollList() {
        super("Ejemplo de JScrollPane");
        setSize(300, 200);
        
        String categorias[] = { "Curso de PHP y MySQL", "Curso de ActionScript", "Curso de Camtasia",
            "Curso de Visual Web Developer", "Curso de Serv-U", "Curso de Photoshop", "Curso de CSS", 
            "Curso de JQuery", "Curso de AJAX", "Curso de FoxPro", "Curso de Symfony", "Curso de .NET" };
        JList lista = new JList(categorias);
        //add(lista);
        //lista.setVisible(true);
        scrollpane = new JScrollPane(lista);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        
    }
    
    public static void main(String args[]) {
        ScrollList nuevoScroll = new ScrollList();
        nuevoScroll.setVisible(true);
    }
}