package implementa_base_dato;

import entidades_base_datos.AreaJefe;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;
import jdk.jshell.spi.SPIResolutionException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
        if(areaJefe == null){// nos aseguramps que no de exception
            return false;
        }
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
        if(areaJefe == null){ // nos aseguramps que no de exception
            return false;
        }
        String sql = "update area set nombre =? where id_area =?";
        try {
            if(preparedStatementModificar == null) {
                preparedStatementModificar = getConexion().prepareStatement(sql);
            }
            preparedStatementModificar.setString(1,areaJefe.getNombre());
            preparedStatementModificar.setInt(2,areaJefe.getId_area());
            return preparedStatementModificar.executeUpdate()==1;

        }catch (SQLException e){
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean Eliminar(AreaJefe areaJefe) {

        return false;
    }

    @Override
    public List<AreaJefe> listar() {
        List<AreaJefe> areas = new ArrayList<>();
        String sql = "select id_area,nombre from area";
        try {
            if(preparedStatementListar == null) {
                preparedStatementListar = getConexion().prepareStatement(sql);
            }
            ResultSet resultSet = preparedStatementListar.executeQuery();
            while(resultSet.next()){
                AreaJefe areaJefe1 = new AreaJefe();
                areaJefe1.setId_area(resultSet.getInt("id_area"));
                areaJefe1.setNombre(resultSet.getString("nombre"));

                areas.add(areaJefe1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return areas ;
    }
}
