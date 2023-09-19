package Pruebas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JFrame {
    private JPanel miPanel;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button2;

    public Ventana(){
        setContentPane(miPanel);
        setTitle("Aplicacion inicial");
        //setSize(450,450);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Boton pulsado. Gracias");
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                JOptionPane.showMessageDialog(null,"Pasado por encima");
            }
        });
    }

    public static void main(String[] arg){
        Ventana ventana = new Ventana();
    }

}
