package Practica_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana extends JDialog  implements ActionListener{
    private JPanel panelPrincipal;
    private JMenu menu;
    private JMenuBar menuBar;
    private JTextArea textArea1;
    private JCheckBox borrarCheckBox;
    private JCheckBox salirCheckBox;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JComboBox comboBox1;
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




        //PRUEBAS

        setJMenuBar(menuBar);

        menu = new JMenu("Opciones");
        menuBar.add(menu);

        o1 = new JMenuItem("Borrar");
        o2 = new JMenuItem("Salir");
        o3 = new JMenuItem("Volver");

        menu.add(o1);
        menu.add(o2);
        menu.add(o3);

        o1.addActionListener(this);
        o2.addActionListener(this);
        o3.addActionListener(this);



        // ---- LISTENERS ----
        //check box borrar
        borrarCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });
        //check box salir
        salirCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });








    }

    //botones funcionales
    @Override
    public void actionPerformed(ActionEvent e) {
        Container c = this.getContentPane();

        //borrar
        if(e.getSource() == o1)
           textArea1.setText("");

        //salir
        if(e.getSource() == o2)
            dispose();

        //volver
        if(e.getSource() == o3)
            dispose();
    }


}

