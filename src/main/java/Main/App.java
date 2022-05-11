package Main;

import entidad.Producto;
import entidad.ProductosPerecederos;
import entidad.productoNoPerecedero;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int id = 0;
        Producto [] productos;
        System.out.println("Registre cualquier cantidad de producto");
        System.out.println("\n");

        // pregunte el usuario
        System.out.println("ingrese la cantidad de personas que cargara");
        int cantidadProdcuto = cap.nextInt();
        productos = new Producto[cantidadProdcuto];


        for (int i = 0; i <productos.length ; i++) {


            String descricion;
            Float precio;
            Integer cantidaInvetario;
            int diasVence;
            int opc;




            System.out.println("escoja el tipo de producto: " +
                    "\n 1. Productos perecederos" +
                    "\n 2. Productos No perecederos");
            System.out.println("ingrese la opcion ");
            opc = cap.nextInt();

            //objeto auxiliar
            Producto producto = null;

            System.out.println("ingrese un producto a la vez [" + (i + 1) + "]: ");
            cap.nextLine();
            System.out.println("nombre del producto [" + (i + 1) + "]: ");
            descricion = cap.nextLine();
            System.out.println("precio del producto [" + (i + 1) + "]: ");
            precio = cap.nextFloat();
            System.out.println("cantidad del producto en inventario [" + (i + 1) + "]: ");
            cantidaInvetario = cap.nextInt();


            switch (opc) {
                case 1:

                    System.out.println("cantidad de dias para vencer [" + (i + 1) + "]: ");
                    diasVence = cap.nextInt();
                    producto = new ProductosPerecederos(descricion, precio, cantidaInvetario, diasVence);
                    id++;
                    break;
                case 2:

                    int numeroProdcutoLleva;

                    System.out.println("cantidad de productos " + descricion + " que lleva [" + (i + 1) + "]: ");
                    numeroProdcutoLleva = cap.nextInt();
                    producto = new productoNoPerecedero(descricion, precio, cantidaInvetario, numeroProdcutoLleva);
                    id ++;
                    break;

            }
            productos [i]=producto;

        };//for


        // mostrar el tipo de producto

        for (Producto producto: productos) {
            producto.getprecioInventario();
            System.out.println("Id del producto : " + id);
            id++;
        }

        }// main
        public static int id(int id){
           return id;
        }


    }//clase




