package entidad;

public class productoNoPerecedero extends Producto {
     float cantidaComprada;
     int id = 0;
    public productoNoPerecedero() {
    }

    public productoNoPerecedero(String descricion, Float precio, Integer cantidadEnInventario, float cantidaComprada) {
        super(descricion, precio, cantidadEnInventario);
        this.cantidaComprada= cantidaComprada;
        id++;
    }

    public float getCantidaComprada() {
        return cantidaComprada;
    }

    public void setCantaComprada(float cantaComprada) {
        this.cantidaComprada = cantaComprada;
    }

    @Override
    public String toString() {
        return "productoNoPerecedero{" +
                "cantaComprada=" + cantidaComprada +
                '}';
    }



    @Override
    public void getprecioInventario() {
        float totalApagar = cantidaComprada * getPrecio();
        System.out.println("----------------------------------------------------------");
        System.out.println("Nombre producto no perecedero : " +getDescricion()  +
                        "\n|Precio del producto: " +getPrecio() +
                        "\n|valor de cantidad comprada: "+ cantidaComprada +
                        "\n|valor total a pagar : "+ totalApagar );
        System.out.println("-----------------------------------------------------------");
    }

    @Override
    public void getId() {
        System.out.println("ID del producto :"+id);
    }
}
