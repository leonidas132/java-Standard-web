package entidad;

public class productoNoPerecedero extends Producto {
     float cantaComprada;

    public productoNoPerecedero() {
    }

    public productoNoPerecedero(String descricion, Float precio, Integer cantidadEnInventario, float cantaComprada) {
        super(descricion, precio, cantidadEnInventario);
        this.cantaComprada = cantaComprada;
    }

    public float getCantaComprada() {
        return cantaComprada;
    }

    public void setCantaComprada(float cantaComprada) {
        this.cantaComprada = cantaComprada;
    }

    @Override
    public String toString() {
        return "productoNoPerecedero{" +
                "cantaComprada=" + cantaComprada +
                '}';
    }

    @Override
    public float precioInventario(Object valor) {

            float total =(float) cantaComprada * getPrecio() ;
            System.out.println("----------------------------------------------------------");
            System.out.println("valor total  producto por unidad : "+ getPrecio()  +
                    "\nCantidad en inventario: " +getCantidadEnInventario() +
                    "\nvalor de cantidad por inventario : "+ total);
            System.out.println("-----------------------------------------------------------");


        return 0;
    }

}
