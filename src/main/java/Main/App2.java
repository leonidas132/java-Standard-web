package Main;

import transporteterrestre.Autobus;
import transporteterrestre.Automobil;
import transporteterrestre.Motocicleta;
import utilidades.Document;

public class App2 {
    public static void main(String[] args) {
        
        Automobil auto = new Automobil( "automovil","rojo-black",4,new Document("Targeta propiedad","12FF","Activo"),"motor v8","dos puertas");
        System.out.println(auto.toString());
        System.out.println(" ");
        Motocicleta moto = new Motocicleta("motocicleta","azul mate",2,new Document("SOAT","145GH","INACTIVO"),"250CC");
        System.out.println(moto.toString());
        System.out.println(" ");
        Autobus bus = new Autobus("bus minicipal","red and gris",8,new Document("cc","1065829198","activo"),20,"urbana","coopetran");
        System.out.println(bus.toString());
    }
}
