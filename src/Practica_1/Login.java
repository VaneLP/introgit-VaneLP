package Practica_1;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    //atributos
    private JPanel panelPrincipal;
    private JButton loginButton;
    private JCheckBox recuerdameCheckBox;
    private JPasswordField passwordField1;
    private JTextField textField1;
    private JLabel iconoU;
    private JLabel iconoC;

    //constructor
    public Login() {
        //para que se muestre en la ventana nuestro panel
        setContentPane(panelPrincipal);

        //titulo
        setTitle("Inicio de sesión");

        //para que se cierre cuando le damos a la X
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //para que se ajuste solo
        setSize(350,450);

        //la ventana se coloque en el centro
        setLocationRelativeTo(null);

        //hacer visible la ventana
        setVisible(true);

        //ponemos dos imagenes
        iconoC.setIcon(new ImageIcon("src/Practica_1/imagenes/candado.png"));
        iconoU.setIcon(new ImageIcon("src/Practica_1/imagenes/usuario.png"));

        /**
         Paleta de colores:
         - 336699 (azul oscuro)
         - 86BBD8 (azul claro)
         - 2F4858 (gris azulado)
         - 9EE493 (verde)
         - DAF7DC (amarillo verdoso)
         - AF5B5B (rojo 1)
         - F03A47 (rojo 2)

         2B2D30
         */


    }


    // ---- MAIN ----
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Login l1 = new Login();
            }
        });
    }

}
