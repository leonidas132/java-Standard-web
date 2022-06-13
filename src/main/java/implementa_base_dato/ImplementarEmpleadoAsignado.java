package implementa_base_dato;

import entidades_base_datos.EmpleadoAsignado;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplementarEmpleadoAsignado implements DAO<EmpleadoAsignado,String>, Conexion {
    private PreparedStatement preparedStatementBuscarId;
    private PreparedStatement preparedStatementIngresar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementListar;



    public EmpleadoAsignado buscarid(int id_empleado){
        EmpleadoAsignado empleadoAsignado = null;
        String sql = "select id_empleado,nombre,fecha_ingreso,name_subor ,telefono,id_jefe  from empleado where id_empleado =? ";
        try {
            if(preparedStatementBuscarId == null) {
                preparedStatementBuscarId = getConexion().prepareStatement(sql);
            }
            preparedStatementBuscarId.setInt(1,id_empleado);

            ResultSet resultSet = preparedStatementBuscarId.executeQuery();
            if(resultSet.next()){
                empleadoAsignado = new EmpleadoAsignado();
                empleadoAsignado.setId_empleado(resultSet.getInt(1));
                empleadoAsignado.setNombre(resultSet.getString(2));
                empleadoAsignado.setFecha_ingreso(resultSet.getString(3));
                empleadoAsignado.setName_subor(resultSet.getString(4));
                empleadoAsignado.setTelefono(resultSet.getString(5));
                empleadoAsignado.setId_jefe(resultSet.getInt(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
