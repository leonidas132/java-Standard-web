package entidad;

public abstract class Persona {

    public String nombre;
    public String apellido;
    public Documento documento;
    public int edad;


    public Persona() {
    }

    public Persona( String nombre, String apellido, Documento documento, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n" +

                ", nombre:'" + nombre + '\'' +
                ", apellido:'" + apellido + '\'' +
                ", documento:" + documento +
                ", edad:" + edad ;
    }

    public abstract void imprimeID();
}
