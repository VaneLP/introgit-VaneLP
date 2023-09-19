package Practica_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Practica1 extends JFrame{
    //Atributos
    private JPanel panelPrincipal;
    private JButton norte1;
    private JButton norte2;
    private JButton norte3;
    private JButton centro1;
    private JButton centro2;
    private JButton centro3;

    //constructor
    public Practica1(){
        //para que se muentre en la ventana el panel
        setContentPane(panelPrincipal);

        //ponerle titulo
        setTitle("Contenedores animados");

        //para que se cierre cuando pulsamos la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //para que se ajuste sola sin tener que ponerle un tamaño
        pack();

        //Para que la ventana se ponga en el centro sin ponerle posicion
        setLocationRelativeTo(null);

        //hacemos visible el panel
        setVisible(true);

        // ---- LISTENERS ----
        //Norte 1
        norte1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mensaje de dialogo
                JOptionPane.showMessageDialog(null, "Has pulsado el norte", null,JOptionPane.WARNING_MESSAGE);

            }
        });

        //Norte 2
        norte2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                //Cuando pasa por encima el raton cambiar el texto a central
                norte2.setText("Central");
            }
        });

        //Norte 3
        norte3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mensaje de error
                JOptionPane.showMessageDialog(null, "Has pulsado Opcion 3", null,JOptionPane.ERROR_MESSAGE);
            }
        });
    }



    // ---- MAIN ----
   //para que se ejecute el programa
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Practica1 p = new Practica1();
            }
        });
    }
}
