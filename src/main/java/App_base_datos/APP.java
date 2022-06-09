package App_base_datos;

import com.sun.source.tree.NewArrayTree;
import entidades_base_datos.AreaJefe;
import entidades_base_datos.Cliente;
import implementa_base_dato.ImplementaArea;
import implementa_base_dato.implementaCliente;

public class APP {
    public static void main(String[] args) {
        ImplementaArea implementaArea = new ImplementaArea();

        AreaJefe arej = implementaArea.buscar("Area contable");
        System.out.println(arej);
    }

}
