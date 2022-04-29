package entidad;

public class Profesor extends Persona{
    private float sueldo;
    public static int id = 0; // autoincrement

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, Documento documento, int edad, float sueldo) {
        super(nombre, apellido, documento, edad);
        this.sueldo = sueldo;
        id++;// de esta manera podemos autoincrementar la variable
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public void imprimeID() {

    }

    @Override
    public String toString() {
        return "Profesor\n" +
                ",ID DEL ESTUDIANTE  :" + id +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", edad=" + edad +
                ", sueldo=" + sueldo ;
    }
}
