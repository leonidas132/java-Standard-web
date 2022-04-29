package Main;

import java.util.Scanner;

public class Credenciales {
    public static void main(String[] args) {
        // ciclo while

        byte n= 1;

       /* while (n <= 10){
            System.out.println(n);
            n++;
        }*/


        //ciclo do while

        //ciclo for
        /*for (int i = 0 ; i < 15 ; i++){
            System.out.println("*");
        }

        for (int j = 1; j <= 15; j++){
            System.out.println(j);
        }*/
        System.out.println("Hola\nMundo");
        Scanner cap = new Scanner(System.in);
        String $usuario = "pepe";
        String $clave = "mojica";

        for (int i = 1; i <= 3; i++){
            System.out.println("ingrese Usuario");
            $usuario = cap.nextLine();
            System.out.println("ingrese Clave");
            $clave = cap.nextLine();
            if ($usuario.equals("pepe")&& $clave.equals("mojica")){
                System.out.println("bienvenidos al sistema");
                break;
            }else if($usuario.equals("pepe")&& $clave !="mojica"){
                System.out.println("clave incorrecta");

            }else if ($usuario != "pepe" && $clave.equals("mojica")){
                System.out.println("usuario incorrecto");
            }else if ($usuario != "pepe" && $clave != "mojica"){
                System.out.println("usuario y clave incorecta");
            }
        }







    }
}
