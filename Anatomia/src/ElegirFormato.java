package eventos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ElegirFormato extends JFrame implements ItemListener {
    //creamos String para ComboBox
    String formatos[] = { "(elige formato)", "Atom", "RSS 0.92", 
        "RSS 1.0", "RSS 2.0" };
    //creamos String para etiquetas
    String descripciones[] = {
        "Formato de sindicacion y weblog Atom",
        "Formato de sindicacion RSS 0.92 (Netscape)",
        "RSS 1.0 (RDF)",
        "RSS 2.0 (RSS Selección Aconsejada"
    };
    //Creamos Combo y Etiqueta
    JComboBox cajaFormato = new JComboBox();
    JLabel etiquetaDescripcion = new JLabel();
    
    public ElegirFormato() {
        super("Formato de Sindicación");
        setSize(420, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        //añadimos a Combo items del string formatos
        for (int i = 0; i < formatos.length; i++ ) {
            cajaFormato.addItem(formatos[i]);
        }
        cajaFormato.addItemListener(this); //Añadimos listener a Combo
        add(BorderLayout.NORTH, cajaFormato);
        add(BorderLayout.CENTER, etiquetaDescripcion);
        setVisible(true);
    }
    
    public void itemStateChanged(ItemEvent event) {
        int eleccion = cajaFormato.getSelectedIndex();
        if (eleccion > 0) {
            etiquetaDescripcion.setText(descripciones[eleccion-1]);
        }
    }
    
    public static void main(String args[]) {
        ElegirFormato miforma = new ElegirFormato();
    }
}