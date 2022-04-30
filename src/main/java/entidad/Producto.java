package entidad;

import utilidades.CalculaPrecio;

public abstract  class Producto implements CalculaPrecio {
    private String descricion ;
    private Float precio;
    private Integer cantidadEnInventario;

    public Producto() {

    }

    public Producto(String descricion, Float precio, Integer cantidadEnInventario) {
        this.descricion = descricion;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(Integer cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "descricion='" + descricion + '\'' +
                ", precio=" + precio +
                ", cantidadEnInventario=" + cantidadEnInventario +
                '}';
    }
}
