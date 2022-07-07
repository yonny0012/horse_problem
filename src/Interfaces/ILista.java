package Interfaces;

public interface ILista <T>{
    void Adicionar(T x);
    void Insertar(T x, int pos)throws Exception;
    T Obtener(int pos)throws Exception;
    void Eliminar(int pos)throws Exception;
    int Longitud();
    boolean Vacia();
}
