import javax.swing.*;

public class Ventana extends JFrame {
    private JPanel miPanel;
    private JButton button1;
    private JButton button2;

    public Ventana(){
        setContentPane(miPanel);
        setTitle("Aplicacion inicial");
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] arg){
        Ventana ventana = new Ventana();
    }

}
