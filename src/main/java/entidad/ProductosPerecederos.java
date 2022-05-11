package entidad;

public class ProductosPerecederos extends Producto {
    public int cantidadDiasVence;
    static int  id = 0;
    public ProductosPerecederos() {

    }

    public ProductosPerecederos(String descricion, Float precio, Integer cantidadEnInventario, int cantidadDiasVence) {
        super(descricion, precio, cantidadEnInventario);
        this.cantidadDiasVence = cantidadDiasVence;
        id ++;
    }

    public int getCantidadDiasVence() {
        return cantidadDiasVence;
    }

    public void setCantidadDiasVence(int cantidadDiasVence) {
        this.cantidadDiasVence = cantidadDiasVence;
    }

    @Override
    public String toString() {
        return "Productos en descuentos: '\n" +
                "\n Nombre Producto :"+ getDescricion() +
                "\n Antes : $"+getPrecio() +
                "\n Cantidad en Inventario :" + getCantidadEnInventario() +
                "\n Dias para vencer" + cantidadDiasVence
                ;
    }
    float descuento = 0.3f;



    @Override
    public void getprecioInventario() {

        if (cantidadDiasVence >11){

        float total =(float) getCantidadEnInventario()* getPrecio() ;
        System.out.println("----------------------------------------------------------");
        System.out.println("Nombre prodcuto perecedero : " +getDescricion()+
                            "\nvalor total  producto por unidad : " + getPrecio()  +
                           "\nCantidad en inventario: " +getCantidadEnInventario() +
                           "\nvalor de cantidad por inventario : "+ total);
        System.out.println("-----------------------------------------------------------");

        }else if (cantidadDiasVence <11){
            float total = (descuento * getPrecio()/100 );
            System.out.println("*----------------------------------------------------------------*");
            System.out.println(
                               "Ha este producto se le aplica el descuento " +descuento +"%"+ "" +
                               "\npor tener menos de 10 dias para vencer :\n" +
                                "*-----------------------------------------------------------------*" +
                               "\n|Nombre Producto      :"+" ------------------"+ getDescricion()+"|"+
                               "\n|precio sin descuento : "+"----------------------"+getPrecio()+" |" +
                               "\n|precio con descuento : "+"-----------------------"+"$"+total +" |");
            System.out.println("*----------------------------------------------------------------*");
        }
    }

    @Override
    public void getId() {
        System.out.println("iD del producto : "+id);
    }


}





