//incluimos la clase en el paquete eventos
package eventos;
//importamos los paquetes necesarios
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//creamos la clase Calculadora subclase de JFrame e implementa la herencia FocusListener
public class Calculadora extends JFrame implements FocusListener {
    JTextField valor1 = new JTextField("0", 5);
    JLabel mas = new JLabel("+");
    JTextField valor2 = new JTextField("0", 5);
    JLabel igual = new JLabel("=");
    JTextField suma = new JTextField("0", 5);
    //Creamos el constructor
    public Calculadora() {
        super("Añade dos números");
        setSize(350, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow); //Aplicamos el gestor de diseño
        //añadimos listeners a los dos campos de entrada de texto
        valor1.addFocusListener(this);
        valor2.addFocusListener(this);
        //configuramos el campo suma y lo hacemos no editable
        suma.setEditable(false);
        // añadimos los Componentes
        add(valor1);
        add(mas);
        add(valor2);
        add(igual);
        add(suma);
        setVisible(true);
    }
    
    public void focusGained(FocusEvent event) {
        try {
            //Convertimos valores campos de String a números y los sumamos
            float total = Float.parseFloat(valor1.getText()) +
                    Float.parseFloat(valor2.getText());
            //Añadimos el resultado al campo suma
            suma.setText("" + total);
        } catch (NumberFormatException nfe) {
            valor1.setText("0");
            valor2.setText("0");
            suma.setText("0");
        }
    }
    
    public void focusLost(FocusEvent event) {
        focusGained(event);
    }
    
    public static void main(String args[]) {
        Calculadora marco = new Calculadora();
    }
}
