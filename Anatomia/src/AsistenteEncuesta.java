package gestores;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AsistenteEncuesta extends JPanel implements ActionListener {
    int cartaActual = 0;
    CardLayout cartas = new CardLayout();
    PanelEncuesta pregunta[] = new PanelEncuesta[3];
    
    public AsistenteEncuesta() {
        super();
        setSize(240, 140);
        setLayout(cartas);
        // connfigurar encuesta
        String pregunta1 = "¿cuál es tu género?";
        String respuesta1[] = { "hombre", "mujer", "no contestó" };
        pregunta[0] = new PanelEncuesta(pregunta1, respuesta1, 2);
        String pregunta2 = "¿Cuál es tu edad?";
        String respuestas2[] = { "Menos de 25", "25-34", "34-54", "Más de 54" };
        pregunta[1] = new PanelEncuesta(pregunta2, respuestas2, 1);
        String pregunta3 = "¿Cuántas veces haces ejercicio cada semana?";
        String respuestas3[] = { "Nunca", "1-3 veces", "Más de 3" };
        pregunta[2] = new PanelEncuesta(pregunta3, respuestas3, 1);
        pregunta[2].setPreguntaFinal(true);
        for (int i = 0; i < pregunta.length; i++) {
            pregunta[i].botonSiguiente.addActionListener(this);
            pregunta[i].botonFinal.addActionListener(this);
            add(pregunta[i], "Carta" + i);
        }
    }  
    
    public void actionPerformed(ActionEvent evt) {
        cartaActual++;
        if(cartaActual >= pregunta.length) {
            System.exit(0);
        }
        cartas.show(this, "Carta" + cartaActual);
    }
    
}

class PanelEncuesta extends JPanel {
    JLabel pregunta;
    JRadioButton respuesta[];
    JButton botonSiguiente = new JButton("Siguiente");
    JButton botonFinal = new JButton("Finalizar");
    
    PanelEncuesta(String pre, String resp[], int def) {
        super();
        setSize(160, 110);
        pregunta = new JLabel(pre);
        respuesta = new JRadioButton[resp.length];
        ButtonGroup grupo = new ButtonGroup();
        JPanel sub1 = new JPanel();
        JLabel preLabel = new JLabel(pre);
        sub1.add(preLabel);
        JPanel sub2 = new JPanel();
        for(int i = 0; i < resp.length; i++) {
            if (def == i) {
                respuesta[i] = new JRadioButton(resp[i], true);
            } 
            else 
            {
                respuesta[i] = new JRadioButton(resp[i], false);
            }
            grupo.add(respuesta[i]);
            sub2.add(respuesta[i]);
        }
        JPanel sub3 = new JPanel();
        botonSiguiente.setEnabled(true);
        sub3.add(botonSiguiente);
        botonFinal.setEnabled(false);
        sub3.add(botonFinal);
        GridLayout grid = new GridLayout(3, 1);
        setLayout(grid);
        add(sub1);
        add(sub2);
        add(sub3);
    }
    
    void setPreguntaFinal(boolean preguntaFinal) {
        if (preguntaFinal) {
            botonSiguiente.setEnabled(false);
            botonFinal.setEnabled(true);
        }
    }
}