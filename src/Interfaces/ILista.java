package Interfaces;

public interface ILista <Coordenada>{
    void Adicionar(Coordenada x);
    void Insertar(Coordenada x, int pos)throws Exception;
    Coordenada Obtener(int pos)throws Exception;
    void Eliminar(int pos)throws Exception;
    int Longitud();
    boolean Vacia();
}
