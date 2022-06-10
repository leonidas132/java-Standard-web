package App_base_datos;

import com.sun.source.tree.NewArrayTree;
import entidades_base_datos.AreaJefe;
import entidades_base_datos.Cliente;
import implementa_base_dato.ImplementaArea;
import implementa_base_dato.implementaCliente;

public class APP { // tranferencia
    public static void main(String[] args) {
        ImplementaArea implementaArea = new ImplementaArea(); // objeto de tipo implementacion

        AreaJefe arej = implementaArea.buscar("Area Sistemas");
        System.out.println(arej);

        AreaJefe areaJefe2 = new AreaJefe(6,"Area Mantenimiento");
     //  System.out.println( implementaArea.insertar(areaJefe2 ));

    }

}
