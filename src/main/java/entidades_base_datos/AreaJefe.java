package entidades_base_datos;

public class AreaJefe {
    private Integer id_area;
    private String nombre;
    private int id;

    public AreaJefe() {
    }

    public AreaJefe(Integer id_area, String nombre, int id) {
        this.id_area = id_area;
        this.nombre = nombre;
        this.id = id;
    }

    public Integer getId_area() {
        return id_area;
    }

    public void setId_area(Integer id_area) {
        this.id_area = id_area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AreaJefe{" +
                "id_area=" + id_area +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}
