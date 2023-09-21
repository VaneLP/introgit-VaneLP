package Practica_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practica1 extends JFrame{
    //Atributos
    private JPanel panelPrincipal;
    private JButton norte1;
    private JButton norte2;
    private JButton norte3;
    private JButton centro1;
    private JButton centro2;
    private JButton centro3;
    private JButton limpiar;
    private JLabel panelTxt;

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

        //para que se fije en el panel y podamos teclear cada vez
        panelTxt.requestFocus();

        // ---- LISTENERS ----
        //Norte 1
        norte1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mensaje de dialogo
                JOptionPane.showMessageDialog(null, "Has pulsado el norte", null,JOptionPane.WARNING_MESSAGE);

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //Norte 2
        norte2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                //Cuando pasa por encima el raton cambiar el texto a central
                norte2.setText("Central");

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //Norte 3
        norte3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mensaje de error
                JOptionPane.showMessageDialog(null, "Has pulsado Opcion 3", null,JOptionPane.ERROR_MESSAGE);

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //presionar teclas
        panelTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String numero = String.valueOf(e.getKeyChar());

                if("1".equals(numero))
                    panelTxt.setText("tecleado 1");

                if("2".equals(numero))
                    panelTxt.setText("tecleado 2");

                if("3".equals(numero))
                    panelTxt.setText("tecleado 3");

                if("c".equals(numero))
                    panelTxt.setText("");
            }
        });

        //centro1 cuando pulsamos cambie el jlabel
        centro1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTxt.setText(" pulsado 1");

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //centro2 cuando pulsamos cambie el jlabel
        centro2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTxt.setText("pulsado 2");

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //centro3 cuando pulsamos cambie el jlabel
        centro3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTxt.setText("pulsado 3");

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //boton limpiar jlabel
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelTxt.setText("");

                //para que se fije en el panel y podamos teclear cada vez
                panelTxt.requestFocus();
            }
        });

        //centro1 uno para que cuando entremos y salimos cambie de color
        centro1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centro1.setBackground(new Color(145, 222, 131));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                centro1.setBackground(Color.white);
            }
        });

        //centro2 uno para que cuando entremos y salimos cambie de color
        centro2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centro2.setBackground(new Color(145, 222, 131));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                centro2.setBackground(Color.white);
            }
        });

        //centro3 uno para que cuando entremos y salimos cambie de color
        centro3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                centro3.setBackground(new Color(145, 222, 131));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                centro3.setBackground(Color.white);
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
