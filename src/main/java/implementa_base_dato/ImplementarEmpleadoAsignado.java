package implementa_base_dato;

import entidades_base_datos.EmpleadoAsignado;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;

import java.sql.PreparedStatement;
import java.util.List;

public class ImplementarEmpleadoAsignado implements DAO<EmpleadoAsignado,String>, Conexion {
    private PreparedStatement preparedStatementBuscarId;
    private PreparedStatement preparedStatementIngresar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementListar;

    public EmpleadoAsignado buscarid(int id){
        EmpleadoAsignado empleadoAsignado = null;
        String sql = "";

        return empleadoAsignado;
    }


    @Override
    public EmpleadoAsignado buscar(String s) {
        return null;
    }

    @Override
    public boolean insertar(EmpleadoAsignado empleadoAsignado) {
        return false;
    }

    @Override
    public boolean modificar(EmpleadoAsignado empleadoAsignado) {
        return false;
    }

    @Override
    public boolean Eliminar(EmpleadoAsignado empleadoAsignado) {
        return false;
    }

    @Override
    public List<EmpleadoAsignado> listar() {
        return null;
    }
}
