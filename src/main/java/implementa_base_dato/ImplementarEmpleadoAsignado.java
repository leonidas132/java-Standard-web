package implementa_base_dato;

import entidades_base_datos.EmpleadoAsignado;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplementarEmpleadoAsignado implements DAO<EmpleadoAsignado>, Conexion {
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
    public EmpleadoAsignado buscar(int id) {
        return null;
    }

    @Override
    public boolean insertar(EmpleadoAsignado empleadoAsignado) {
        if(empleadoAsignado ==null){  //para enitar la nullpointerexesion
            return false;
        }
        String sql = "insert into empleado (id_empleado,nombre,telefono,fecha_ingreso,id_jefe,name_subor) values(?,?,?,?,?,?)";
        try {
            if (preparedStatementIngresar == null) {
                preparedStatementIngresar = getConexion().prepareStatement(sql);
            }
            preparedStatementIngresar.setInt(1,empleadoAsignado.getId_empleado());
            preparedStatementIngresar.setString(2,empleadoAsignado.getNombre());
            preparedStatementIngresar.setString(3,empleadoAsignado.getTelefono());
            preparedStatementIngresar.setString(4,empleadoAsignado.getFecha_ingreso());
            preparedStatementIngresar.setInt(5,empleadoAsignado.getId_jefe());
            preparedStatementIngresar.setString(6,empleadoAsignado.getName_subor());

            return preparedStatementIngresar.executeUpdate()== 1;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }

    @Override
        public boolean modificar(EmpleadoAsignado empleadoAsignado) {
        if(empleadoAsignado ==null){
            return false;
        }
        String sql = "update empleado set nombre =?, telefono =?,fecha_ingreso=?,id_jefe=?,name_subor =? where id_empleado=?";
        try {
            if(preparedStatementModificar == null) {
                preparedStatementModificar = getConexion().prepareStatement(sql);
            }

            preparedStatementModificar.setString(1,empleadoAsignado.getNombre());
            preparedStatementModificar.setString(2,empleadoAsignado.getTelefono());
            preparedStatementModificar.setString(3,empleadoAsignado.getFecha_ingreso());
            preparedStatementModificar.setInt(4,empleadoAsignado.getId_jefe());
            preparedStatementModificar.setString(5,empleadoAsignado.getName_subor());
            preparedStatementModificar.setInt(6,empleadoAsignado.getId_empleado());


            return preparedStatementModificar.executeUpdate()==1;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean Eliminar(EmpleadoAsignado empleadoAsignado) {
        return false;
    }

    @Override
    public List<EmpleadoAsignado> listar() {
        List<EmpleadoAsignado>$empleadoAsignados = new ArrayList<>();
        String sql = "select * from empleado";
        try {
            if(preparedStatementListar == null){
                preparedStatementListar = getConexion().prepareStatement(sql);
            }
            ResultSet resultSet= preparedStatementListar.executeQuery();
            while(resultSet.next()){
                EmpleadoAsignado empleadoAsignado =new EmpleadoAsignado();
                empleadoAsignado.setId_empleado(resultSet.getInt("id_empleado"));
                empleadoAsignado.setNombre(resultSet.getString("nombre"));
                empleadoAsignado.setTelefono(resultSet.getString("telefono"));
                empleadoAsignado.setFecha_ingreso(resultSet.getString("fecha_ingreso"));
                empleadoAsignado.setId_jefe(resultSet.getInt("id_jefe"));
                empleadoAsignado.setName_subor(resultSet.getString("name_subor"));
                $empleadoAsignados.add(empleadoAsignado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return $empleadoAsignados;
    }
}
