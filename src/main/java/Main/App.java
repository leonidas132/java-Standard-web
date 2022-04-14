package Main;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        /*
         //Declare e inicie 2 variables que permitan realizar y mostrar en consola las operaciones basicas matetematicas

        int  $numero1 = 20;
        int $numero2 = 10;

        System.out.println("la suma es : " + ($numero1 + $numero2));
        System.out.println("la resta es :" + ($numero1 - $numero2));
        System.out.println("la multiplicación es :"+ ($numero1 * $numero2));
        System.out.println("la división es : " + ($numero1 / $numero2));
           */


        //declare e inicie 4 variables e indique el promedio de las 4

      /*  int nota1 = 10, nota2 = 20, nota3 = 10, nota4 = 20;
        int suma = nota1 + nota2 + nota3 + nota4;
        int promedio = suma/4;
        System.out.println("el prmedio de las cuatro notas es "+ promedio);
        */

        //Declare e inicie 3 variables enteras y compare cual de las 3 es la mayor.
       /* int valor1 = 50, valor2 = 30, valor3 = 20;
        if (valor1 > valor2 || valor1 > valor3){
            System.out.println("el valor mas alto es :"+valor1);

        }else if (valor2 > valor1 || valor2 > valor3){

            System.out.println("el valor mas alto es :"+valor2);
        }else if(valor3> valor1 || valor3 > valor2){
            System.out.println("el valor mas alto es :"+valor3);
        }*/

       // Declare e inicie 2 variables que permitan realizar y mostrar en consola las operaciones básicas matemáticas
        // (suma, resta,división y multiplicación) pero con la opción de elegir cual operación realizar.

        Scanner cap = new Scanner (System.in);
      /*  int $num1;
        int $num2;
        System.out.println("escoja la operación a realizar" +
                "\n 1. Suma" +
                "\n 2. Resta" +
                "\n 3. multiplicación" +
                "\n 4. División ");
        int opc;
        System.out.println("ingrese opción");
        opc = cap.nextInt();
        if(opc==1){
            System.out.println("ingrese los dos numeros a sumar ");
            System.out.println("numero 1");
            $num1 = cap.nextInt();
            System.out.println("numero 2");
            $num2 = cap.nextInt();
            int total = $num1 + $num2;
            System.out.println("el total de la suma es : "+total);
        }else if (opc ==2){
            System.out.println("ingrese los dos numeros a restar ");
            System.out.println("numero 1");
            $num1 = cap.nextInt();
            System.out.println("numero 2");
            $num2 = cap.nextInt();
            int total = $num1 - $num2;
            System.out.println("el total de la resta es : "+total);
        }else if (opc ==3){
            System.out.println("ingrese los dos numeros a miltiplicar ");
            System.out.println("numero 1");
            $num1 = cap.nextInt();
            System.out.println("numero 2");
            $num2 = cap.nextInt();
            int total = $num1 * $num2;
            System.out.println("el total de la multiplicación es : "+total);
        }else if (opc ==4){
            System.out.println("ingrese los dos numeros a dividir ");
            System.out.println("numero 1");
            $num1 = cap.nextInt();
            System.out.println("numero 2");
            $num2 = cap.nextInt();
            int total = $num1 / $num2;
            System.out.println("el total de la división es : "+total);
        }*/

        //  Del ejercicio anterior hacerlo con switch y que pueda aceptar el carácter ‘s’ para sumar,
        //  ‘r’ para restar, ‘m’ para multiplicar y ‘d’ para dividir

        int vari1;
        int vari2;
        System.out.println("operaciones que puede realizar " +
                "\n  s. suma " +
                "\n  r. resta" +
                "\n  m. multiplicación" +
                "\n  d. división");
        String opcs;
        System.out.println("ingrese la letra de la opción escogida");
        opcs = cap.nextLine();
        switch (opcs){
            case "S":
            case "s":
                System.out.println("ingrese primer numero a sumar");
                vari1 = cap.nextInt();
                System.out.println("ingrese el segundo numero");
                vari2 = cap.nextInt();
                int resultado = vari1 + vari2;
                System.out.println("el resultado es : "+ resultado);
                break;
            case "R":
            case "r":
                System.out.println("ingrese primer numero a restar");
                vari1 = cap.nextInt();
                System.out.println("ingrese el segundo numero");
                vari2 = cap.nextInt();
                int resultado1 = vari1 - vari2;
                System.out.println("el resultado es : "+ resultado1);
                break;
            case "M":
            case "m":
                System.out.println("ingrese primer numero a multiplicación");
                vari1 = cap.nextInt();
                System.out.println("ingrese el segundo numero");
                vari2 = cap.nextInt();
                int resultado3 = vari1 * vari2;
                System.out.println("el resultado es : "+ resultado3);
                break;
            case "D":
            case "d":
                System.out.println("ingrese primer numero a dividir");
                vari1 = cap.nextInt();
                System.out.println("ingrese el segundo numero");
                vari2 = cap.nextInt();
                int resultado4 = vari1 / vari2;
                System.out.println("el resultado es : "+ resultado4);
                break;

            default:
                System.out.println("opción incorrecta");
                break;
        }
    }
}
