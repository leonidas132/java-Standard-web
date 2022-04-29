package entidad;

public final class Curso {
    private String codigo;
    private String descripción;

    public Curso() {
    }

    public Curso(String codigo, String descripción) {
        this.codigo = codigo;
        this.descripción = descripción;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", descripción='" + descripción + '\'' +
                '}';
    }
}
