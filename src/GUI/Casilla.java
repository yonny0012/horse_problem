package GUI;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import GUI.Elementos.Etiqueta;
import Interfaces.ICasilla;

public class Casilla extends JPanel implements ICasilla{
    private Color col; 
    private Etiqueta etq_cas;
    private int dim_cas, id_cas;
    private Caballo cab;
    
    /**
     * este objeto recive como id un numero de dos cifras en formato fila-columna
     * este primer constructor pertenece a las casillas del internas del juego (blancas y negras)
     */
    public Casilla(Color col,int id, int dim){
        //super.setLayout(new BorderLayout()); 
        //setSize(dim/10,dim/10);
        setBackground(col);
        this.id_cas = id;
        setBounds(new Rectangle(dim/10,dim/10));
        setBorder(new LineBorder(Color.black,1));

        //System.out.println("posicion: "+getFila()+getColumna()+"  "+getId());

        //this.setLayout(null);
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
        int fil = id_cas/10;
        char letra = '0';
        switch(fil){
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

    public void setCaballo(Caballo cab){
        this.cab = cab;
    }

    @Override
    public boolean hasFicha() {
        // TODO Auto-generated method stub
        return false;
    }
}
