package App_base_datos;

import com.sun.source.tree.NewArrayTree;
import entidades_base_datos.AreaJefe;
import entidades_base_datos.Cliente;
import entidades_base_datos.EmpleadoAsignado;
import entidades_base_datos.EmpleadoJefe;
import implementa_base_dato.ImplementaArea;
import implementa_base_dato.ImplementarEmpleadoAsignado;
import implementa_base_dato.implementaCliente;
import implementa_base_dato.implementacionEmpleadoJefe;

public class APP { // tranferencia
    public static void main(String[] args) {
       ImplementaArea implementaArea = new ImplementaArea(); // objeto de tipo implementacion
        /*  // buscar
         AreaJefe arej = implementaArea.buscar("Area Sistemas");
         System.out.println(arej);

         // insertar
        AreaJefe areaJefe2 = new AreaJefe(5,"Area administrativa");
        System.out.println( implementaArea.insertar(areaJefe2 ));

         //modificar
         AreaJefe areaJefe2 = new AreaJefe(5,"Area administrativa");
        implementaArea.modificar(areaJefe2);
        System.out.println(areaJefe2);

        //eliminar
        System.out.println(implementaArea.Eliminar(arej));


        //listar area
        for ( AreaJefe area: implementaArea.listar()) {
            System.out.println(area);
        }

        */

        implementacionEmpleadoJefe implementacionjefe = new implementacionEmpleadoJefe();
         // buscar
      //  EmpleadoJefe empleadoJefe = implementacionjefe.buscarID(1);
      //  System.out.println(empleadoJefe);

        //insertar
       // EmpleadoJefe empleadoJefe1= new EmpleadoJefe(6,"luis ",5);
       //System.out.println(implementacionjefe.insertar(empleadoJefe1));

        //Modificar
       // EmpleadoJefe empleadoJefe1= new EmpleadoJefe(6,"luis ",5);
      //  implementacionjefe.modificar(empleadoJefe1);

        //eliminar


        //Listar
       /* for(EmpleadoJefe empleadoJefe:implementacionjefe.listar()){
            System.out.println(empleadoJefe);
        }*/

        ImplementarEmpleadoAsignado implementarEmpleadoAsignado = new ImplementarEmpleadoAsignado();

        EmpleadoAsignado empleadoAsignado;
        empleadoAsignado =implementarEmpleadoAsignado.buscarid(105);
        System.out.println(empleadoAsignado);

    }

}
