package Main;

import entidad.ProductosPerecederos;
import entidad.productoNoPerecedero;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);

        ArrayList<ProductosPerecederos> ListaPerecedero = new ArrayList<>();
        ArrayList<productoNoPerecedero> noPerecederos = new ArrayList<>();

        productoNoPerecedero $NoPerecedero ;
        ProductosPerecederos perecedero ;

        String descricion;
        Float precio;
        Integer cantidaInvetario;
        int diasVence;
        int opc ;


        int registreProducto;
        System.out.println("registre la cantidad de productos a comprar");
        registreProducto = cap.nextInt();
        int i = 1;
        do{
            System.out.println("escoja el tipo de producto: " +
                    "\n 1. Productos perecederos" +
                    "\n 2. Productos No perecederos" +
                    "\n 3. Ofertas" +
                    "\n 0. Salir");
            System.out.println("ingrese la opcion ");

            opc = cap.nextInt();
            switch (opc){
                case 1:
                    System.out.println("ingrese un producto a la vez");
                    cap.nextLine();
                    System.out.println("nombre del producto");
                    descricion = cap.nextLine();
                    System.out.println("precio del producto");
                    precio = cap.nextFloat();
                    System.out.println("cantidad del producto en inventario");
                    cantidaInvetario = cap.nextInt();
                    System.out.println("cantidad de dias para vencer ");
                    diasVence = cap.nextInt();
                    perecedero = new ProductosPerecederos(descricion,precio,cantidaInvetario,diasVence);
                    ListaPerecedero.add(perecedero);
                    perecedero.precioInventario(ListaPerecedero);
                    break;
                case 2:

                    int numeroProdcutoLleva;
                    System.out.println("ingrese un producto a la vez");
                    cap.nextLine();
                    System.out.println("nombre del producto");
                    descricion = cap.nextLine();
                    System.out.println("precio del producto");
                    precio = cap.nextFloat();
                    System.out.println("cantidad del producto en inventario");
                    cantidaInvetario = cap.nextInt();
                    System.out.println("cantidad de productos "+ descricion +" que lleva");
                    numeroProdcutoLleva = cap.nextInt();
                    $NoPerecedero = new productoNoPerecedero(descricion,precio,cantidaInvetario,numeroProdcutoLleva);
                    noPerecederos.add($NoPerecedero);
                    break;
                case 3:
                    for (int j = 0; j < ListaPerecedero.size(); j++) {
                        System.out.println(ListaPerecedero.get(j));
                        float porc = 0.3f;
                        if(ListaPerecedero.get(j).getCantidadDiasVence()< 11) {
                            float des = porc * ListaPerecedero.get(j).getPrecio() / 100;
                            System.out.println("Despeues :" + "$" + des);
                        }

                    }
                    break;
                case 0:

                    break;
            }


             i++;
        }while (opc != 0);
        System.out.println("Hata pronto");





    }

    // public static ProductosPerecederos productosDescuento (ProductosPerecederos rebaja ){

    //}


}
