package GUI.Tree_Structure.TDAs;
import GUI.Elementos.Coordenada;
import Interfaces.ILista;

public class listaSE<Coordenada> implements ILista<Coordenada>{

    private int longitud;
    protected NodoSE<Coordenada> primero;
    protected NodoSE<Coordenada> ultimo;

    public listaSE() {
        primero = null;
        ultimo = null;
        longitud = 0;
    }

    public void Adicionar(Coordenada x) {
        NodoSE<Coordenada> nuevo = new NodoSE<Coordenada>(x, null);
        if (Vacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
        longitud++;
    }

    public void Insertar(Coordenada x, int pos) throws ExceptionPosFueraDeRango {
        if ((pos < 0) || (pos >= longitud)) 
            throw new ExceptionPosFueraDeRango();

        NodoSE<Coordenada> nuevo = new NodoSE<Coordenada>(x, null);
        if (pos == 0) {
            nuevo.setSiguiente(primero);
            primero = nuevo;
        } else {
            NodoSE<Coordenada> cursor = primero;
            int pos_cursor = 0;
            while ((cursor.getSiguiente() != null) && (pos_cursor <= pos - 1)) {
                pos_cursor++;
                cursor = cursor.getSiguiente();
            }
            nuevo.setSiguiente(cursor.getSiguiente());
            cursor.setSiguiente(nuevo);
        }
        longitud++;
    }

    public Coordenada Obtener(int pos) throws ExceptionPosFueraDeRango {
        if ((pos < 0) || (pos >= longitud)) {
            throw new ExceptionPosFueraDeRango();
        }

        NodoSE<Coordenada> cursor = primero;
        for (int i = 0; i < pos; i++) {
            cursor = cursor.getSiguiente();
        }
        return cursor.getInfo();
    }

    public void Eliminar(int pos) {
        if (Vacia()) {
            throw new ExceptionListaVacia();
        }
        if ((pos < 0) || (pos >= longitud)) {
            throw new ExceptionPosFueraDeRango();
        }

        NodoSE<Coordenada> cursor = primero;
        if (pos == 0) {
            primero = cursor.getSiguiente();
        } else {
            NodoSE<Coordenada> anterior = primero;
            int pos_cursor = 0;
            while ((cursor != null) && (pos_cursor != pos)) {
                anterior = cursor;
                cursor = cursor.getSiguiente();
                pos_cursor++;
            }
            anterior.setSiguiente(cursor.getSiguiente());
            cursor.setSiguiente(null);
            if (cursor == ultimo) {
                ultimo = anterior;
            }
        }
        longitud--;
    }

    public int Longitud() {
        return longitud;
    }

    public boolean Vacia() {
        return (longitud == 0);
    }

    public int Buscar(Coordenada x) throws Exception {
        if (Vacia()) {
            throw new ExceptionPosFueraDeRango();
        }

        int pos = 0;
        NodoSE<Coordenada> cursor = primero;
        while ((cursor != null) && (!cursor.getInfo().equals(x))) {
            cursor = cursor.getSiguiente();
            pos++;
        }

        if (cursor == null) {
            return -1;
        } else {
            return pos;
        }
    }
}