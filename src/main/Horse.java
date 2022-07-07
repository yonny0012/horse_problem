package main;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.Caballo;
import GUI.Frame;
//import GUI.Ventana;
import GUI.caballoBlanco;
import GUI.caballoNegro;
import GUI.Elementos.Tablero;

public class Horse {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        //Ventana app = new Ventana();
        Frame f1 = new Frame();
        
        f1.setVisible(true);
        

        (f1.getPan_Principal().getCasillas())[0][0].setCaballo(new caballoBlanco(11));
        (f1.getPan_Principal().getCasillas())[2-1][2-1].setCaballo(new caballoNegro(22));
        /*(f1.getPan_Principal().getCasillas())[5][1].setCaballo(new Caballo());
        (f1.getPan_Principal().getCasillas())[2][3].setCaballo(new Caballo());
        (f1.getPan_Principal().getCasillas())[1][4].setCaballo(new Caballo());*/
        //JLabel lb = new JLabel();
        //lb.setIcon(new javax.swing.ImageIcon("Images/pngwing.com.png"));
        //((f1.getPan_Principal().getCasillas())[2][4]).setBackground(Color.black);
        //((f1.getPan_Principal().getCasillas())[2][4]).setColor(Color.black);

        Tablero.getCasillas()[6-1][6-1].setCaballo(new caballoBlanco(66));
        
    }
}
