package entidad;

public class productoNoPerecedero extends Producto {
     float cantaComprada;
    @Override
    public float precioInventario(Object valor) {

        return 0;
    }
}
