package Practica_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
/*
PROFE NI CASO COSAS MIAS, ES PARA NO PERDERLO
 Paleta de colores:
 - 336699 (azul oscuro)
 - 86BBD8 (azul claro)
 - 2F4858 (gris azulado)
 - 9EE493 (verde)
 - DAF7DC (amarillo verdoso)
 - F03A47 (rojo 1)

 2B2D30
 */
public class Login extends JFrame {
    //atributos
    private JPanel panelPrincipal;
    private JButton login;
    private JCheckBox recuerdameCheckBox;
    private JPasswordField contra;
    private JTextField nombreU;
    String user = "Vane";
    char [] pass = new char[]{'1','2','3','4'};
    private JLabel iconoU;
    private JLabel iconoC;


    // ---- CONSTRUCTOR ----
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

        //en donde queramos ponerlo llamamos al boton.setBorder(new Clase(radio))
        login.setBorder(new RoundedBorder(9));





        // ---- LISTENERS ----
        //boton login
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //user: Vane
                //pass: 1234
                if(nombreU.getText().equals(user) && Arrays.equals(contra.getPassword(), pass)) {
                    login.setBackground(new Color(158, 228, 147));
                    abrirEditor();

                }
                else
                    login.setBackground(new Color(240,58,71));
            }
        });
    }

    //metodo abrir el editor
    public void abrirEditor(){
        Ventana v1 = new Ventana(this,true);
        v1.setVisible(true);
    }


    // ---- MAIN ----
    public static void main(String[] args) {
        //llamamos al splashScreen para que se ejecute antes que el login
        SplashScreen splash = new SplashScreen();

    }

}
