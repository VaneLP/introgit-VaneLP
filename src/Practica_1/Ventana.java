package Practica_1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JDialog{
    private JPanel panelPrincipal;
    private JMenu menu;
    private JMenuBar menuBar;
    private JTextArea text;
    private JCheckBox borrarCheckBox;
    private JCheckBox salirCheckBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JComboBox<String> comboBox1;
    private JLabel label1;
    private JMenuItem o1,o2,o3;

    //constructor
    /* pasamos la ventana del login y un boolean para decir luego si la ventana es modular o no, que
    queremos que lo sea para que no podamos abrir mas de una ventana del editor */
    public Ventana(Login l, boolean b){
        super(l,b);

        setContentPane(panelPrincipal);
        setTitle("Editor");

        setSize(500,500);
        setLocationRelativeTo(null);

        //asignamos el JMenuBAr
        setJMenuBar(menuBar);

        //creamos un nuevo menu y le ponemos un titulo
        menu = new JMenu("Opciones");
        //a nuestro JMenuBar le asignamos nuestro menu
        menuBar.add(menu);

        //creamos los items y le pomenos un nombre
        o1 = new JMenuItem("Borrar");
        o2 = new JMenuItem("Salir");
        o3 = new JMenuItem("Volver");

        //añadimos a nuestro menu los items que acabamos de crear
        menu.add(o1);
        menu.add(o2);
        menu.add(o3);

        // ---- LISTENERS ----
        //Item menu bar - borrar
        o1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        //Item menu bar - salir
        o2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //Item menu bar - volver
        o3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //-----------------------------------------------------------------------

        //check box borrar
        borrarCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        //check box salir
        salirCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        //-----------------------------------------------------------------------

        //radio button 1
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Hola");
            }
        });

        //radio button 2
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Esto");
            }
        });

        //radio button 3
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Cambia");
            }
        });

        //añadimos items al combobox
        comboBox1.addItem("Hola");
        comboBox1.addItem("Esto");
        comboBox1.addItem("Cambia");

    }

}

