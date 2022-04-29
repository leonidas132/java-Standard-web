package Main;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arreglos {

    static Scanner scannr = new Scanner(System.in);

    public String alumno;
    public float nota;

    public arreglos() {

    }

    public arreglos(String alumno, float nota) {
        this.alumno = alumno;
        this.nota = nota;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public static void main(String [] args){
        // declaracion de un arrelgo
        /*
          Tipo []  identificador
          o
          tipo dato [] nombre = new tipo dato[ cantidad elementos
           */
       /*
        float [] numeros = new float[10];
        numeros [0] = 1.2f;
        numeros [1] = 20.3f;
        numeros [2] = 14.8f;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);

        }*/
        /*
        *      cities [0][0] ="Colombia";
        cities [0][1] ="Medellin";
        cities [1][0] ="Colombia";
        cities [1][1]= "Bogota";
        cities [2][0] = "Mexico";
        cities [2][1] = "Guadalajara";
        cities [3][0] = "Mexico";
        cities [3][1] = "CDMX";
        // Papra imprimir datos se accede al indice que indica la posicion
        for (int i=0;i<cities.length; i++){
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);

            }
        }
        **/
        // inicializar un areglo
       /* int [ ]nums = {122,55,44,777};
        System.out.println(Arrays.toString(nums));*/
        //genere un programa que le pida al usuario
        //cantidad de nota
        //nota y nombre de cada alumno
       /* datosAlumno = definirLongitud(datosAlumno);
        System.out.println("FILAS :"+datosAlumno.length);
        System.out.println("COLUMNAS :" + datosAlumno[0].length);
        System.out.println();
        ingresarDatos(datosAlumno);
        System.out.println();
        mostrarDatos(datosAlumno);
        System.out.println();*/

        ArrayList <arreglos> lista = new ArrayList<>(); //declaro un arraylist de tipo arreglo(hago referencia a la clase en la cual
        // declare atributos y metodos )
        String nombreAlumno;
        float notasAlumno;
        int numeroEstudiante;
        System.out.println("ingrese el numero de estudiante");
        numeroEstudiante = scannr.nextInt(); // esto me permite capturar la cantidad de alumnos a iterar
        int i = 0;
        float sumaNOTAS = 0;
        int conteo = 0;
        while(i < numeroEstudiante) {
            scannr.nextLine();
            System.out.println("ingrese el nombre del alumno");
            nombreAlumno = scannr.nextLine();
            System.out.println("ingrese la nota del Alumno");
            notasAlumno = scannr.nextFloat();
            arreglos ar = new arreglos(nombreAlumno,notasAlumno); //le paso los parametros al metodo constructor
            lista.add(ar); //le agrego la informacion a mi arraylist por medio de mi objeto ( ar)
            sumaNOTAS = sumaNOTAS + notasAlumno;
            conteo =+numeroEstudiante ;
            i++;

        }
        float mayor = 0;
        float menor = 1;
        for (int j = 0; j < lista.size(); j++) {
            System.out.println("Nombre Alumno : "+ lista.get(j).getAlumno());
            System.out.println("Nota : "+ lista.get(j).getNota());
            if(mayor < lista.get(j).getNota()) {
                mayor = lista.get(j).getNota();
            }
            if(j==0){
                menor = lista.get(j).getNota();
            }else if (lista.get(j).getNota()<menor){
                menor = lista.get(j).getNota();
            }
        }
        float not;
        for (int j = 0; j < lista.size(); j++) {


        }

        System.out.println("La nota mayor es :"+ mayor);
        System.out.println("La nota menor es :"+ menor);
        System.out.println("Notas ingresadas :" +conteo);
        System.out.println("promedio de notas :" +sumaNOTAS/conteo);


    } // cierra metodo main













    /*public static String [][] definirLongitud(String [] [] x){
        System.out.println("ingrese el tamaño de la matriz de la siguiente manera filas&columnas");
        String datosIngresados = scannr.next();
        String [] datos = datosIngresados.split("&"); //separo el string cada vez que encuentre el signo '&'
        int cantidadAlumno= Integer.parseInt(datos[0]); // luego le paso el cararcter que se encuentra en la posición cero del vector datos y hago un parseo
        int cantidadNota = Integer.parseInt(datos[1]);
        x = new String[cantidadAlumno][cantidadNota]; //asigno los valores de fila y columna a la matriz x y luego retrono
        return x;
    } // cierre metodo definirLongitud

    public static void ingresarDatos (String [][] alumno){
        System.out.println("ingrese nombre del alumno y luego la nota ");
        for (int i = 0; i <alumno.length ; i++) {
            for (int j = 0; j <alumno[i].length; j++) {
                alumno [i][j]=scannr.next();

            }
        }
    } // cierra metodo ingresarDatos

    public static void mostrarDatos (String [][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <m[i].length; j++) {
                System.out.print(m[i][j]);

            }
            System.out.println(" ");
        }
        /*
         for (String[] strings : m) {
            for (String string : strings) {
                System.out.print(string);

            }
            System.out.println(" ");
        }



    }// cierra metodo mostrarDatos*/


} // cierra la clase
