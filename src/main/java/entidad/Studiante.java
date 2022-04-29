package entidad;

import java.util.Arrays;

public class Studiante extends Persona  {
    Curso [] curso;
     public static int id = 0; // autoincrement


    public Studiante( String nombre, String apellido, Documento documento, int edad, Curso[] curso) {
        super(nombre, apellido, documento, edad);
        this.curso = curso;
        id++; // de esta manera podemos autoincrementar la variable
    }

    public Curso[] getCurso() {
        return curso;
    }

    public void setCurso(Curso[] curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudante\n" +
                ",ID DEL ESTUDIANTE  :" + id +
                ", nombre:'" + nombre + '\'' +
                ", apellido:'" + apellido + '\'' +
                ", documento:" + documento +
                ", edad:" + edad +
                "  curso:" + Arrays.toString(curso) ;
    }

    @Override
    public void imprimeID() {
        System.out.println("ID DEL ESTUDIANTE : " +id);
    }
}
