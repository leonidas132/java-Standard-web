package Main;

import entidad.ProductosPerecederos;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        ArrayList<ProductosPerecederos> ListaPerecedero = new ArrayList<>();
        String descricion;
        Float precio;
        Integer cantidaInvetario;
        int diasVence;

        int registreProducto;
        System.out.println("registre la cantidad de productos a comprar");
        registreProducto = cap.nextInt();
        int i = 0;
        do{
            System.out.println("escoja el tipo de producto: " +
                    "\n 1. Productos perecederos" +
                    "\n 2. Productos No perecederos" +
                    "\n 3. Ofertas" +
                    "\n 0. Salir");
            System.out.println("ingrese la opcion ");
            int opc ;
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
                    ProductosPerecederos perecedero = new ProductosPerecederos(descricion,precio,cantidaInvetario,diasVence);
                    ListaPerecedero.add(perecedero);
                    break;
                case 2:
                    System.out.println("en construcccion");
                    break;
                case 3:
                    System.out.println("productos en ofertas");
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
            }


             i++;
        }while (i < registreProducto);





    }

    // public static ProductosPerecederos productosDescuento (ProductosPerecederos rebaja ){

    //}


}
