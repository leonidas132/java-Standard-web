package App_base_datos;

import com.sun.source.tree.NewArrayTree;
import entidades_base_datos.*;
import implementa_base_dato.*;

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
        //buscar
      //  EmpleadoAsignado empleadoAsignado;
       // empleadoAsignado =implementarEmpleadoAsignado.buscarid(104);
      //  System.out.println(empleadoAsignado);

        //insertar
       // EmpleadoAsignado empleadoAsignado1 = new EmpleadoAsignado(107,"josefa","3043882440","2022/06/13",6,"isacc,juan davod ");
      //  System.out.println(implementarEmpleadoAsignado.insertar(empleadoAsignado1));

        //modificar
     //  EmpleadoAsignado empleadoAsignado1 = new EmpleadoAsignado(107,"pepa","304388","2021/06/13",5,"misael,jamael,davod ");
    // System.out.println(implementarEmpleadoAsignado.modificar(empleadoAsignado1));

        //listar
       // for(EmpleadoAsignado employ : implementarEmpleadoAsignado.listar()){
      //      System.out.println(employ);
      //  }

        //buscar
        ImplementacionCuenta implementacionCuenta = new ImplementacionCuenta();
        Cuenta cuenta;
        cuenta =implementacionCuenta.buscar(5);
        System.out.println(cuenta);

        //insertar
       // Cuenta cuenta1 = new Cuenta(7,"123-1024-190","cuenta corriente");
      //  System.out.println(implementacionCuenta.insertar(cuenta1));

        //modificar
       // Cuenta cuenta1 = new Cuenta(7,"125-1024-1","cuenta Ahorro");
      //  System.out.println(implementacionCuenta.modificar(cuenta1));

        for(Cuenta cuenta1:implementacionCuenta.listar()){
            System.out.println(cuenta1);
        }
     
    }

}
