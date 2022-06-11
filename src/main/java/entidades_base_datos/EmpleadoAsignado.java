package entidades_base_datos;

public class EmpleadoAsignado {
    private int id_empleado;
    private String nombre;
    private String telefono;
    private String fecha_ingreso;
    private int id_jefe;
    private String name_subor;

    public EmpleadoAsignado() {
    }

    public EmpleadoAsignado(int id_empleado, String nombre, String telefono, String fecha_ingreso, int id_jefe, String name_subor) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fecha_ingreso = fecha_ingreso;
        this.id_jefe = id_jefe;
        this.name_subor = name_subor;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getName_subor() {
        return name_subor;
    }

    public void setName_subor(String name_subor) {
        this.name_subor = name_subor;
    }

    @Override
    public String toString() {
        return "Empleado Asignado" +
                "\nid_empleado:" + id_empleado +
                "\nnombre:" + nombre +
                "\ntelefon:" + telefono +
                "\nfecha_ingreso:" + fecha_ingreso +
                "\nid_jefe:" + id_jefe +
                "\nname_subor:" + name_subor;
    }
}
