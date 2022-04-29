package Main;
import java.util.Arrays;
import java.util.Scanner;
public class matriz1 {
    public static void main (String [] args ){
        Scanner cap = new Scanner(System.in);
        int numeroAlum;
        int numeroNOta;

        System.out.println("ingrese la cantidad de alumno");
        numeroAlum= cap.nextInt();
        System.out.println("ingrese la cantidad de nota");
        numeroNOta = cap.nextInt();

        String matrizAlumno [] [] = new String[numeroAlum][numeroNOta];

        for (int i= 0; i <numeroAlum;i++){

            for (int j = 0; j < numeroNOta; j++) {
                cap.nextLine();
                System.out.println("ingrese el nombre del alumno");
                matrizAlumno[i][j] = cap.nextLine();
            }

        }
        matrizAlumno.toString();

        for (int i = 0; i < matrizAlumno.length; i++) {
            for (int j = 0; j <matrizAlumno.length  ; j++) {
                System.out.println(matrizAlumno[i][j]);
            }

        }



    }//cierre del metodo main

}// cierre de la clase
