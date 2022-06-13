package implementa_base_dato;

import entidades_base_datos.Cliente;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Objects;

public class implementaCliente implements DAO<Cliente>, Conexion{



    public Cliente buscarId(int id){
        return null;
    }

    @Override
    public Cliente buscar(int id) {

        return null;
    }

    @Override
    public boolean insertar(Cliente cliente) {


        return false;
    }

    @Override
    public boolean modificar(Cliente cliente) {


        return false;
    }

    @Override
    public boolean Eliminar(Cliente cliente) {
        return false;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }


}

