package implementa_base_dato;

import entidades_base_datos.AreaJefe;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;
import jdk.jshell.spi.SPIResolutionException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplementaArea implements DAO<AreaJefe, String>, Conexion {  //implementacion
    private PreparedStatement preparedStatementBuscar;
    private PreparedStatement preparedStatementInsetar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementListar;
    @Override
    public AreaJefe buscar(String nombre) {
        AreaJefe AJ = null;
        String sql = "select id_area,nombre from area where nombre =?";
        try {
            if(preparedStatementBuscar ==null){ // de esta manera precargamos  la sentencia sql
                preparedStatementBuscar = getConexion().prepareStatement(sql);
            }
            preparedStatementBuscar.setString(1,nombre);

            ResultSet resultSet = preparedStatementBuscar.executeQuery();
            if(resultSet.next()){
                AJ = new AreaJefe();
                AJ.setId_area(resultSet.getInt(1));
                AJ.setNombre(resultSet.getString(2));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return AJ;
    }

    @Override
    public boolean insertar(AreaJefe areaJefe) {

        String sql = "insert into area(id_area,nombre) values(?,?); ";
        try {
            if(preparedStatementInsetar == null) { // de esta manera precargamos  la consulta sql
                preparedStatementInsetar = getConexion().prepareStatement(sql);
            }
            preparedStatementInsetar.setInt(1,areaJefe.getId_area());
            preparedStatementInsetar.setString(2,areaJefe.getNombre());

            return preparedStatementInsetar.executeUpdate()==1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
