package GUI.Elementos;


import javax.swing.JPanel;

import GUI.Casilla;

public class Tablero extends JPanel{
    private Casilla[][] casillas;
    private boolean canSetHorse = false;    
    private int con_Clicks = 0;
    
    public Tablero(){
        super();

        casillas = new Casilla[8][8];
    }
    
    public Casilla[][] getCasillas() {
        return casillas;
    }
    private void setCasillas(Casilla cas, int id) {
        this.casillas[(id/10)-1][(id%10)-1] = cas;
    }
    

    public void AddCasilla(Casilla cas){
        super.add(cas);
        setCasillas(cas, cas.getId());
    }

    /*
    //Para ver que funciona como quiero
    public void Mostrar(){
        for(int i=0; i<8;i++){
            for(int j=0;j<8;j++){
                System.out.println((casillas[i][j]).getId()+" ");
            }
            System.out.println("\n");
        }
    }
    */
    
}
