import javax.swing.*;
import java.awt.*;

public class Checkbox extends JFrame {
    public Checkbox() {
        super("Checkboxes");
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cursoJava = new JCheckBox("Curso de Java", true);
        JCheckBox cursoFlash = new JCheckBox("Curso de Flash", false);
        JCheckBox cursoPHP = new JCheckBox("Curso de PHP", false);
        JCheckBox cursoRuby = new JCheckBox("Curso de Ruby", false);
        FlowLayout dis = new FlowLayout();
        ButtonGroup cursos = new ButtonGroup();
        cursos.add(cursoJava);
        cursos.add(cursoFlash);
        cursos.add(cursoPHP);
        cursos.add(cursoRuby);
        setLayout(dis);
        add(cursoJava);
        add(cursoFlash);
        add(cursoPHP);
        add(cursoRuby);
        setVisible(true);
    }
    
    public static void main(String args[]) {
        Checkbox micaja = new Checkbox();
    }
}