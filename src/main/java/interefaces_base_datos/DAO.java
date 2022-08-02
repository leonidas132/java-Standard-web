package interefaces_base_datos;

import entidades_base_datos.Cliente;

import java.util.List;

public interface DAO <E>{  //Data Access Object
    //data access object

    public abstract E buscar(int id);
    public abstract boolean insertar(E e);
    public abstract boolean modificar(E e);
    public abstract boolean Eliminar (E e);
    List<E> listar();
}
