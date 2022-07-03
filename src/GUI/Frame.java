package GUI;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.text.LayoutQueue;

public class Frame extends JFrame{
    private JPanel pan_Principal;
    private double width,height;
    private Dimension dim;
    private int an, al;
    //private  Toolkit screen;
    
    
    public Frame(){
        dim = Toolkit.getDefaultToolkit().getScreenSize();  //gestiona el tamanho de la pantalla
        height = dim.getHeight();                    //gestiona el alto de la pantalla
        width = dim.getWidth();                      //gestiona el ancho de la pantalla
        
        al = (int)height;
        an = (int)width;
        
        //setSize(an/2, al/2);
        setSize(500, 500);
        FlowLayout fl = new FlowLayout();
        BorderLayout bl = new BorderLayout();
        GridLayout gl = new GridLayout(1,2);
        setLayout(bl);
        setResizable(false);

        System.out.println(this.getSize());

        Rectangle rect = new Rectangle(al/3,al/3);
        setMinimumSize(rect.getSize());
        setMaximizedBounds(new Rectangle(an,al));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("The_Horse_problem");   
        
        makePanel();
    }
    private void makePanel(){
        pan_Principal = new JPanel();
        pan_Principal.setSize(this.getSize().height,this.getSize().height);
        
        GridLayout glyd = new GridLayout(10,10);
       
        pan_Principal.setLayout(glyd);
        pan_Principal.setBorder(new LineBorder(Color.CYAN,1));
        
        generarTablero();
        
        
        System.out.println("\n resolucion del panel "+pan_Principal.getSize());
        
        this.getContentPane().add(pan_Principal);
    }
    private void generarTablero(){
        char[] letra = {'A','B','C','D','E','F','G','H'};
        for(int i = 0; i<=9; i++){
            for(int j=0;j<=9;j++){
                if ((0<i && i<9) && (0<j && j<9) ){
                    if(i%2!=0 && j%2==0){           //establece la casilla negra si la fila es impar y la columna par
                        pan_Principal.add(new Casilla(Color.BLACK, (i*10+j),pan_Principal.getHeight()));
                    }
                    else if(i%2!=0 && j%2!=0){      //establece la casilla blanca si la fila es impar y la columna impar
                        pan_Principal.add(new Casilla(Color.white, (i*10+j),pan_Principal.getHeight()));
                    }
                    else if (i%2==0 && j%2!=0){     //establece la casilla negra si la fila es par y la columna impar
                        pan_Principal.add(new Casilla(Color.black, (i*10+j),pan_Principal.getHeight()));
                    }
                    else if (i%2==0 && j%2==0){     //establece la casilla blanca si la fila es par y la columna par
                        pan_Principal.add(new Casilla(Color.white, (i*10+j),pan_Principal.getHeight()));
                    }
                }
                else if(i==0 || i==9){
                    if(j>0 && j<9){
                        pan_Principal.add(new Casilla(letra[j-1],Color.white,pan_Principal.getHeight()));
                    }
                    else{
                        JPanel p = new JPanel();
                        p.setBackground(Color.white);
                        //p.setBorder(new LineBorder(Color.MAGENTA));
                        pan_Principal.add(p);
                    }
                }
                else if((j==0 || j==9)){
                    if(i>0 && i<9){
                        pan_Principal.add(new Casilla(i,Color.white,pan_Principal.getHeight()));
                    }                        
                }
                    
            }   
        }
    }
    
}
