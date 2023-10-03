package Pruebas;

import javax.swing.border.Border;
import java.awt.*;

//para hacer bordes redondeados necesitamos hacer nosotros la implementacion
public class RoundedBorder implements Border {
    //atributo
    private int radius;

    //constructor
    RoundedBorder(int radius){
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius +1, this.radius+1, this.radius+2,this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawRoundRect(x,y,width-1,height-1,radius,radius);
    }
}

/*en donde queramos ponerlo llamamos al boton.set*/