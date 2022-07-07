package GUI;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.MouseInputListener;

import GUI.Elementos.Etiqueta;
import Interfaces.ICasilla;

public class Casilla extends JPanel implements ICasilla{
    private Color col; 
    private Etiqueta etq_cas;
    private int dim_cas, id_cas;
    private Caballo cab;
    private boolean hasCaballo = false;
    
    
    /**
     * este objeto recive como id un numero de dos cifras en formato fila-columna
     * este primer constructor pertenece a las casillas del internas del juego (blancas y negras)
     */
    public Casilla(Color col,int id, int dim){
        addMouseListener(mil);
        //super.setLayout(new BorderLayout()); 
        //setSize(dim/10,dim/10);
        setBackground(col);
        this.id_cas = id;
        setBounds(new Rectangle(dim/10,dim/10));
        setBorder(new LineBorder(Color.black,1));
        

        //System.out.println("posicion: "+getFila()+getColumna()+"  "+getId());

        //this.setLayout(null);
        /**
        JLabel lb = new JLabel();
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("Images/pngwing.com.png")));
        add(lb);
        */
    }

    /**este segundo constructor pertenece a las filas de letras 
     * que identofican a las filas del tablero
    */
    public Casilla(char let, Color col, int dim){
        //setBorder(new LineBorder(Color.BLACK,1));
        setSize(dim/10,dim/10);
        setBackground(col);
        etq_cas = new Etiqueta(String.valueOf(let));
        this.add(etq_cas);
        
    }

    /**este tercer constructor pertenece a las Columnas de numeros 
     * que identofican a las Columnas del tablero
    */
    public Casilla(int pos, Color col, int dim){
        //setBorder(new LineBorder(Color.green,1));
        setSize(dim/10,dim/10);
        setBackground(col);
        etq_cas = new Etiqueta(String.valueOf(pos));
        this.add(etq_cas);
    }
    
    public void setDimension(int dim){
        this.dim_cas = dim;
    }
    public void setColor(Color c){
        setBackground(c);
        this.col = c;
    }
    public Color getColor(){
        return col;
    }
    public void setId_cas(int id){
        this.id_cas = id;
    }
    public int getId(){
        return this.id_cas;
    }
    public char getLetterFila(){            //devuelve la letra de la fila 
        int col = id_cas/10;
        char letra = '0';
        switch(col){
            case 1: letra = 'A'; break;
            case 2: letra = 'B'; break;
            case 3: letra = 'C'; break;
            case 4: letra = 'D'; break;
            case 5: letra = 'E'; break;
            case 6: letra = 'F'; break;
            case 7: letra = 'G'; break;
            case 8: letra = 'H'; break;
        }
        return letra;
    }
    public int getFila(){                   //devuelve el numero de la fila
        return (int)id_cas/10;
    }
    public int getColumna(){                //devuelve el numero de la columna
        return id_cas%10;
    }

    public void setCaballo(Caballo cab){    //Ubica ell caballo en el panel de este elemento
        this.cab = cab;
        this.add(cab);
        this.hasCaballo = true;
        //this.repaint();
        updateUI();
    }
    public Caballo getCaballo(){            //devuelve el objeto cabalo que esta en esta casilla
        return this.cab;
    }

    @Override
    public boolean hasCaballo() {           //devuelve v o f si tiene o no un caballo establecido
        return hasCaballo;
    }
    
    /*----------------------------Decalración del MuoseInputLintener-------------------------------*/
    /*-----------------------------------------------------------------------------------------------
     * Esto es por un tema de organizacion visual del código en la sección 
     * del constructor
     * --------------------------------------------------------------------------------------------*/
    protected MouseInputListener mil = new MouseInputListener() {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.print("esta cliqueando en "+getId()+" "+getLetterFila()+getColumna()+"\n");
            if(!hasCaballo){
                //setCaballo(new caballoBlanco(id_cas));
                setCaballo(new caballoNegro(id_cas));

                /*---------------------------------------------------------
                 * experimentos
                 *----------------------------------------------------------*/
                 

            }
            else
                System.out.println("Ya hay un caballo aqui\n");     //para no poner caballos donde ya lo hay
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        
    };

   }
