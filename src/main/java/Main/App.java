package Main;

import entidad.Curso;
import entidad.Documento;
import entidad.Studiante;
import entidad.Persona;

public class App {
    public static void main(String[] args) {


        Curso [] curso = {new Curso("code1","java")};
        Studiante estudiante = new Studiante("pepe","mogica",new Documento("din",1245),29,curso);
        //estudiante.imprimeID();
        System.out.println(estudiante);
        Studiante estudiante1 = new Studiante("pepe","mogica",new Documento("din",1247),28,curso);
       // estudiant1.imprimeID(); //podemos usar nuestro metodo imprimir
        System.out.println(estudiante1);
        Studiante estudiante2 = new Studiante("pepe","mogica",new Documento("din",1246),26,curso);
        System.out.println(estudiante2);
    }
}
