package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Caballo extends JLabel{
    private int posicion;
    private boolean fueVisitado = false;
    private ImageIcon img;

    public Caballo(){
        img = new ImageIcon(getClass().getResource("Images.Horse.png"));
        super.setIcon(img);
        

    }    
}
