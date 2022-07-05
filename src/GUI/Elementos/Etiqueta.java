package GUI.Elementos;

import java.awt.Color;

import javax.swing.JLabel;

public class Etiqueta extends JLabel {
    
    public Etiqueta(String elm){
        super.setText(elm);
        //super.setLayout(null);
        super.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        super.setAlignmentY(JLabel.CENTER_ALIGNMENT);
        super.setBackground(Color.BLUE);
    }
}
