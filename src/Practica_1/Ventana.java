package Practica_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JPanel panelPrincipal;
    private JMenu menu;
    private JMenuBar menuBar;
    private JTextArea textArea1;
    private JMenuItem o1,o2,o3;

    //constructor
    public Ventana(){
        setContentPane(panelPrincipal);
        setTitle("Editor");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);

        //hacemos visible
        setVisible(true);


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
    }

    public void pruebas(){
        System.out.println("hola");
    }

    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana v1 = new Ventana();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Container c = this.getContentPane();

        if(e.getSource() == o1)
            System.out.println("Hola");
    }
}

