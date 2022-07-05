package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Caballo extends JLabel{
    private int posicion;
    private boolean visitado = false;
    private ImageIcon img;
    private int destino; 

    public Caballo(){
        //img = new ImageIcon(getClass().getResource("Images/pngwing.com.png"));
        //this.setIcon(img); 
        //this.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/wite_horse-2.png")));       
    }
    public boolean fueVisitado(){
        return visitado;
    }
    public int getPosicion(){
        return posicion;
    }
}
