package entidad;

public abstract class Cliente {

    public String nombre;
    public String apellido;
    public Documento documento;



    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Documento documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;


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

    @Override
    public String toString() {
        return "\n" +

                ", nombre:'" + nombre + '\'' +
                ", apellido:'" + apellido + '\'' +
                ", documento:" + documento ;
    }

    public abstract void imprimeID();
}
