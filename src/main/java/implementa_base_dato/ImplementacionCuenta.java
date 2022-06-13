package implementa_base_dato;

import entidades_base_datos.Cuenta;
import interefaces_base_datos.Conexion;
import interefaces_base_datos.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ImplementacionCuenta implements DAO<Cuenta>, Conexion {
    private PreparedStatement preparedStatementBuscar;
    private PreparedStatement preparedStatementInsertar;
    private PreparedStatement preparedStatementModificar;
    private PreparedStatement preparedStatementEliminar;
    private PreparedStatement preparedStatementListarr;



    @Override
    public Cuenta buscar(int id) {
        Cuenta cuenta = null;
        String sql ="select id_c,tipo_cuenta,No_cuenta from Cuenta where id_c=?";
        try {
            if(preparedStatementBuscar == null) {
                preparedStatementBuscar = getConexion().prepareStatement(sql);
            }
            preparedStatementBuscar.setInt(1,id);

            ResultSet resultSet = preparedStatementBuscar.executeQuery();
            if(resultSet.next()){
            cuenta = new Cuenta();
            cuenta.setId_c(resultSet.getInt(1));
            cuenta.setTipo_cuenta(resultSet.getString(2));
            cuenta.setNo_cuenta(resultSet.getString(3));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cuenta;
    }
    @Override
    public boolean insertar(Cuenta cuenta) {
        if(cuenta ==null){
            return false;
        }
        String sql = "insert into cuenta (id_c,No_cuenta,tipo_cuenta) values(?,?,?)";
        try {
            if (preparedStatementInsertar ==null) {
                preparedStatementInsertar = getConexion().prepareStatement(sql);
            }
            preparedStatementInsertar.setInt(1,cuenta.getId_c());
            preparedStatementInsertar.setString(2,cuenta.getNo_cuenta());
            preparedStatementInsertar.setString(3,cuenta.getTipo_cuenta());

            return preparedStatementInsertar.executeUpdate()==1;
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }
    @Override
    public boolean modificar(Cuenta cuenta) {
        String sql = "";
        return false;
    }

    @Override
    public boolean Eliminar(Cuenta cuenta) {
        String sql = "";
        return false;
    }

    @Override
    public List<Cuenta> listar() {
        String sql = "";
        return null;
    }
}
