package GUI.Elementos;

import GUI.Caballo;
import GUI.Casilla;

public class Coordenada {
    private int coord_X;
    private int coord_Y;
    private Casilla casi;

    public Coordenada(Caballo c){
        coord_X = c.getPosicion()%10;
        coord_Y = c.getPosicion()/10;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public Casilla getCasilla() {
        return casi;
    }
    
}
