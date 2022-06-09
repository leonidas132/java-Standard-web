package implementa_base_dato;

import entidades_base_datos.AreaJefe;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplementaArea implements DAO<AreaJefe, Integer>, Conexion {


    @Override
    public AreaJefe buscar(Integer id_area) {

        AreaJefe AJ = null;
        String sql = "select nombre,id from area where id_area =?";
        try {
            PreparedStatement preparedStatementBuscar = getConexion().prepareStatement(sql);
            preparedStatementBuscar.setInt(1,id_area);
            preparedStatementBuscar.setString(2,AJ.getNombre());
            preparedStatementBuscar.setInt(3,AJ.getId());

            ResultSet resultSet = preparedStatementBuscar.executeQuery();
            if(resultSet.next()){
                AJ = new AreaJefe();
                AJ.setId_area(resultSet.getInt(1));
                AJ.setNombre(resultSet.getString("nombre"));
                AJ.setId(resultSet.getInt(3));
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }
        return AJ;
    }

    @Override
    public boolean insertar(AreaJefe areaJefe) {
        return false;
    }

    @Override
    public boolean modificar(AreaJefe areaJefe) {
        return false;
    }

    @Override
    public boolean Eliminar(AreaJefe areaJefe) {
        return false;
    }

    @Override
    public List<AreaJefe> listar(AreaJefe areaJefe) {
        return null;
    }
}
